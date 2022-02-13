package models;

public abstract class Product implements Comparable<Product> {
    private double price;
    private String color;
    private String brand;

    public Product(double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    public Product(Product source) {
        this.price = source.price;
        this.color = source.color;
        this.brand = source.brand;
    }

    public abstract void fold();

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product referenceObject) {
        return (int) Math.round(this.getPrice() - referenceObject.getPrice());
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
