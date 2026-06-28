package org.example.Abstraction;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product){

}

public class MainStore {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil painting", 13.50, "Nice work by ABF painter in 2010"));
        storeProducts.add(new ArtObject("Sculpture", 250, "Bronze work by JFK in 1947"));
        storeProducts.add(new Furniture("Desk", 450,"Most resistant desk"));
        storeProducts.add(new Furniture("Lamp",99.99,"a white light lamp"));
        listProducts();

        System.out.println("-------Order 1-----------");
        var order1 = new ArrayList<OrderItem>();
        addItemtoOrder(order1,1,3);
        addItemtoOrder(order1,0,2);
        printorder(order1);

        System.out.println("-------Order 2-----------");
        var order2 = new ArrayList<OrderItem>();
        addItemtoOrder(order1,3,3);
        addItemtoOrder(order1,2,4);
        addItemtoOrder(order1,1,1);
        addItemtoOrder(order1,0,1);
        printorder(order1);
    }

    public static void listProducts(){
        for (var item : storeProducts){
            System.out.println("-".repeat(27));
            item.showDetails();
        }
    }

    public static void addItemtoOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printorder(ArrayList<OrderItem> order){
        double salesTotal =0;
        for( var item : order){
            salesTotal+= item.product().getSalesPrice(item.qty());
        }
        System.out.println("Sales Total = "+ salesTotal);
    }
}
