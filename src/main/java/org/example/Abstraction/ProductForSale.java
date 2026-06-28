package org.example.Abstraction;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public ProductForSale() {
    }

    public double getSalesPrice(int qty){
        return qty*price;
    }

    public abstract void showDetails();
}
