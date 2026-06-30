package org.example.Streams;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainBingo {
    public static void main(String[] args) {
        List<String> bingoPool = new ArrayList<>(75);

        int start=1;
        for(char c : "BINGO".toCharArray()) {
            for(int i=start;i<(start+15);i++){
                bingoPool.add(""+c+i);
                //System.out.println(""+c+i);
            }
            start+=15;
        }

        Collections.shuffle(bingoPool);
        System.out.println("------------------------");
        List<String> firstOnes = bingoPool.subList(0,15);
        firstOnes.sort(Comparator.naturalOrder());
        bingoPool.stream()
                .limit(15)
                .filter(s -> s.indexOf('G') == 0 || s.indexOf('O')==0)
                .map(s -> s.charAt(0) + "-" + s.substring(1))
                .sorted()
                .forEach(s -> System.out.printf(s + " "));

        System.out.println("---------------------------");
        String[] strings = {"One", "Two","Three"};
        var firstStrem = Arrays.stream(strings)
                .sorted(Comparator.reverseOrder());
                //.forEach(s -> System.out.printf(" " + s));
        var seconStream = Stream.of("Six","Four","Five")
                .sorted(Comparator.naturalOrder());

        System.out.println("--------------------------");
        Stream.concat(seconStream,firstStrem)
                .forEach(s -> System.out.printf(" " + s));

        System.out.println("-------------------------");
        var streamB = Stream.iterate(1, i -> i<=15, i->i+1)
                .map(i -> "B" +i);

        var streamI = Stream.iterate(16,i -> i <=30, i-> i+1)
                .map(i -> "I" + i);

        var streamN= Stream.iterate(31, i -> i<=45, i -> i+1)
                .map(i -> "N" + i);

        var streamG= Stream.iterate(46,i -> i<=60, i -> i+1)
                .map(i -> "G" + i);
        var streamO= Stream.iterate(61,i -> i<=75, i -> i+1)
                .map(i -> "O" +i);

        var streamBi = Stream.concat(streamB,streamI);
        var streamNG = Stream.concat(streamN,streamG);
        var streamBING = Stream.concat(streamBi,streamNG);
        Stream.concat(streamBING,streamO)
                .forEach(System.out::println);


    }
}
