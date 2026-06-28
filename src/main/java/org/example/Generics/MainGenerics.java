package org.example.Generics;

public class MainGenerics {
    public static void main(String[] args) {
        var nationalPark = new Park[]{
                new Park("Yellowstone", "44.488,-110.596"),
                new Park("Grand Canyon", "36.1054, -112.09")
        };
        Layer<Park> parkLayer = new Layer<>(nationalPark);
        parkLayer.renderLayer();

        var rivers = new River[]{
                new River("Mississippi", "47.50, -95.44", "29.15, -89.55"),
                new River("Missouri", "45.92,-111.21", "38.81, -90.44")
        };
        Layer<River> riverLayer = new Layer<>(rivers);
        riverLayer.renderLayer();
    }
}
