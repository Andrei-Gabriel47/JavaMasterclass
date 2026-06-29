package org.example.Collections;

import java.util.Scanner;

public class MainAdventure {
    public static void main(String[] args) {
        AdventureGame game = new AdventureGame();
        game.play("road");

        Scanner scanner = new Scanner(System.in);

        while (true){
            String direction = scanner.nextLine().trim().toUpperCase().substring(0,1);
            if(direction.equals("Q")) break;
            game.move(direction);
        }
    }
}
