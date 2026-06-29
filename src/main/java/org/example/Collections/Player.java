package org.example.Collections;

import java.util.List;

public class Player {
    private String name;
    private List<Card> cards;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Player " + name +
                " has the following hand: " +
                cards ;
    }
}
