package org.example.Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class MainMiniChallange {
    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "Andrei", "Ioana", "Ciocotof"};
        Arrays.setAll(names, i-> names[i].toUpperCase());
        System.out.println("--> To UpperCase");
        System.out.println(Arrays.toString(names));

        List<String> backedArrary = Arrays.asList(names);
        backedArrary.replaceAll(s -> s += " " +  getChar());
        System.out.println("--> Random char added");
        System.out.println(Arrays.toString(names));

        backedArrary.replaceAll(s -> s = s.split(" ")[0] + " " + reversedName(s.split(" ")[0]));
        System.out.println("--> Reversed names added");
        Arrays.asList(names).forEach(s -> System.out.printf(" " + s));
        System.out.println("");

        List<String> newList = new ArrayList<>(List.of(names));
        newList.removeIf(s ->{
            String firstName = s.substring(0, s.indexOf(" "));
            String lasName = s.substring(s.indexOf(" ")+1);
            return firstName.equals(lasName);
        });
        System.out.println("No duplicate names");
        Arrays.asList(newList).forEach(s -> System.out.printf(" " +s));
    }

    public static char getChar(){
        Random random = new Random();
        return (char) random.nextInt(0,240);
    }

    public static String reversedName(String name){
        return new StringBuilder(name).reverse().toString();
    }

}
