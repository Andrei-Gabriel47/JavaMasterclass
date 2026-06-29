package org.example.Lambdas;

import java.util.ArrayList;
import java.util.List;

public class MainPart2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("alpha","bravo","gamma"));
        list.forEach((s -> System.out.println(s)));
        System.out.println("-".repeat(20));
        list.forEach((var word) ->{
            char first = word.charAt(0);
            System.out.println(word + " means " + first);
        });
    }
}
