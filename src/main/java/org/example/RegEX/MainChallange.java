package org.example.RegEX;

import java.util.List;
import java.util.SimpleTimeZone;

public class MainChallange {
    public static void main(String[] args) {
        String sentence ="Hello, World";
        boolean matches = sentence.matches("Hello, World");
        System.out.println(matches);

        String challange2 = "[A-Z][a-z].*";

        for(String s : List.of("The bike is nice",
                "I am a new student",
                "hello world")){
            boolean matched = s.matches(challange2);
            System.out.println(matched + ": "+ s);
        }


    }
}
