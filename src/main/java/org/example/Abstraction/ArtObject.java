package org.example.Abstraction;

public class ArtObject extends ProductForSale{

    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " +type + " is a nice thing");
        System.out.println("The price is " + price);
        System.out.println(description);
    }

}
