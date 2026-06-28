package org.example.Abstraction;

public class Furniture extends ProductForSale{

    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " +type + " is a nice piece ");
        System.out.println("The price is " + price);
        System.out.println(description);
    }

}
