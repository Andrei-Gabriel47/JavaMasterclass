package org.example.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainIntro {
    public static void main(String[] args) {
        String[] names = {"Ana", "Bob", "Hannah", "Andrei", "Greg"};
        List<String> list  = new ArrayList<>();
        list.addAll(Arrays.asList(names));
        System.out.println(list);

        list.add("Fred");
        list.addAll(Arrays.asList("Greogre","Grace"));
        System.out.println(list);
        System.out.println("Grace in the list?" + list.contains("Grace"));

        list.removeIf(s -> s.charAt(0)=='G');
        System.out.println(list);
        System.out.println("Grace in the list?" + list.contains("Grace"));


    }
}
