package edu.sdccd.cisc191.f.models;

import edu.sdccd.cisc191.f.models.cards.BlockCard;
import edu.sdccd.cisc191.f.models.cards.StrikeCard;

import java.util.ArrayList;
import java.util.List;

public class WarriorStarterDeckBuilder {

    // Create 10 cards
    // put them into a deck
    // create method to allow deck be placed in player

    private static final List<Card> cardList = new ArrayList<>();
    private static Deck<Card> cardDeck;

    private static void createCards() {
        for (int i = 0; i < 4; i++) {
            cardList.add(new StrikeCard());
            cardList.add(new BlockCard());
        }
    }

    private static void createDeck() {
        cardDeck = new Deck<>(cardList);
    }

    public static Deck<Card> build() {
        createCards();
        createDeck();
        return cardDeck;
    }
}
