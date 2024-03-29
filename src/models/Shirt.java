package models;

import java.util.Objects;

public class Shirt extends Product{

    public enum Size {
        SMALL, MEDIUM, LARGE
    }
    private Size size;

    public Shirt(Size size, double price, String color, String brand) {
        super(price, color, brand);
        this.size = size;
    }

    public Shirt(Shirt source) {
        super(source);
        this.size = source.size;
    }

    @Override
    public void fold() {
        System.out.println("Lay shirt on flat surface");
        System.out.println("Fold shirt sideways");
        System.out.println("Bring sleeves in");
        System.out.println("Fold from bottom up");
    }


    public Size getSize() {
        return size;
    }


    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shirt shirt = (Shirt) o;
        return size == shirt.size && super.getPrice() == shirt.getPrice() && super.getColor().equals(super.getColor()) && super.getBrand().equals(shirt.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, super.getPrice(), super.getColor(), super.getBrand());
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "size='" + size + '\'' +
                "price='" + super.getPrice() + '\'' +
                "color='" + super.getColor() + '\'' +
                "brand='" + super.getBrand() + '\'' +
                '}';
    }
}
