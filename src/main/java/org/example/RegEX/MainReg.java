package org.example.RegEX;

public class MainReg {
    public static void main(String[] args) {
        String testString = "Anyone can learn abc's , 123's and any regEx";
        String[] patterns ={
                "abc", "123", "A", "c"
        };
        String replacement= "(-)";
        for(String pattern : patterns){
            String output = testString.replaceFirst(pattern,replacement);
            System.out.println("Pattern: " + pattern + "=>" + output);
        }

        System.out.println("------------------------");
        String[] patternsV2 ={
                "[abc]", "[123]", "[A]"
        };
        for(String pattern : patternsV2){
            String output = testString.replaceFirst(pattern,replacement);
            System.out.println("Pattern: " + pattern + "=>" + output);
        }

        System.out.println("------------------------");
        String[] patternsV3 ={
                "[a-z]", "[2-9]", "[A-M]"
        };
        for(String pattern : patternsV3){
            String output = testString.replaceFirst(pattern,replacement);
            System.out.println("Pattern: " + pattern + "=>" + output);
        }

        System.out.println("------------------------");
        String[] patternsV4 ={
                "[a-z]*", "[2-9]*", "[A-M]"
        };
        for(String pattern : patternsV4){
            String output = testString.replaceFirst(pattern,replacement);
            System.out.println("Pattern: " + pattern + "=>" + output);
        }

        System.out.println("------------------------");
        String[] patternsV5 ={
                "[a-z]{2,}", "[2-9]{1,2}", "[A-M]"
        };
        for(String pattern : patternsV5){
            String output = testString.replaceFirst(pattern,replacement);
            System.out.println("Pattern: " + pattern + "=>" + output);
        }
    }
}
