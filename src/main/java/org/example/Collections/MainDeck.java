package org.example.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainDeck {
    public static void main(String[] args) {
        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);

        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART,'A');
        Arrays.fill(cardArray,aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray), "Aces of Hearts", 1);

        Collections.shuffle(deck);
        Card.printDeck(deck,"Shuffled Deck", 4);

        Collections.reverse(deck);
        Card.printDeck(deck,"Reversed Shuffled Deck", 4);

        List<Card> copied = new ArrayList<>(deck.subList(0,13));
        Collections.rotate(copied,2);
        System.out.println("Unrotated " + deck.subList(0,13));
        System.out.println("Rotated " + copied);

        //Highest hand of 4 mini-game
        List<Card> cardsGame = Card.getStandardDeck();
        Collections.shuffle(cardsGame);
        Card.printDeck(cardsGame);

        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        player1.setName("Ioana");
        player2.setName("Andrei");
        player3.setName("Ciocotof");

        int noOfCardsDealt = 4;
        List<Card> p1Hand = new ArrayList<>();
        List<Card> p2Hand = new ArrayList<>();
        List<Card> p3Hand = new ArrayList<>();

        for(int i=0; i<noOfCardsDealt;i++){
            p1Hand.add(cardsGame.getFirst());
            cardsGame.removeFirst();
            p2Hand.add(cardsGame.getFirst());
            cardsGame.removeFirst();
            p3Hand.add(cardsGame.getFirst());
            cardsGame.removeFirst();
        }
        player1.setCards(p1Hand);
        player2.setCards(p2Hand);
        player3.setCards(p3Hand);

        System.out.println("-----------------");
        System.out.println("Players Hands");
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

        int p1Score =0;
        int p2Score= 0;
        int p3Score= 0;

        for(Card c : player1.getCards()){
            p1Score+=c.rank();
        }
        for(Card c : player2.getCards()){
            p2Score+=c.rank();
        }
        for(Card c : player3.getCards()){
            p3Score+=c.rank();
        }

        System.out.println("-----------------");
        System.out.println("The winner is : ");
        if(p1Score > p2Score && p1Score > p3Score) System.out.println(player1.getName());
        else if(p2Score>p3Score) System.out.println(player2.getName());
        else System.out.println(player3.getName());

        System.out.println("------------");
        System.out.println("Points");
        System.out.println(player1.getName()+ " " + p1Score + " points");
        System.out.println(player2.getName()+ " " + p2Score + " points");
        System.out.println(player3.getName()+ " " + p3Score + " points");

    }
}
