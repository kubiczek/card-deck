package com.kubiczek.card;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


/**
 * Created by mkubiczek on 11/14/2016.
 */
public class Deck {
    public static final String STANDARD_52_CARD_DECK = "STANDARD_52_CARD_DECK";
    public static final String EMPTY_DECK = "EMPTY_DECK";

    private final List<Card> cards = new LinkedList<>();

    private Deck(List<Card> cards) {
        this.cards.addAll(cards);
    }

    public static Deck getInstance(String type) {
        switch (type) {
            case STANDARD_52_CARD_DECK:
                List<Card> cards = new LinkedList<Card>();
                for (Suit suit : Suit.values()) {
                    for (Rank rank : Rank.values()) {
                        cards.add(new Card(rank, suit));
                    }
                }
                return new Deck(cards);
            case EMPTY_DECK:
                return new Deck(Collections.EMPTY_LIST);
            default:
                throw new IllegalArgumentException("Unsupported type of deck card: " + type);
        }
    }

    public void shuffle() {
        Random random = new Random();
        Card[] array = cards.stream().toArray(Card[]::new);
        for (int i = 0; i < array.length - 1; i++) {
            int n = random.nextInt(array.length - i) + i;
            Card tmp = array[i];
            array[i] = array[n];
            array[n] = tmp;
        }
        this.cards.clear();
        for (int i = 0; i < array.length; i++) {
            this.cards.add(array[i]);
        }
    }

    public Card take() {
        return this.cards.remove(0);
    }

    public boolean isEmpty() {
        return this.cards.isEmpty();
    }

    public int size() {
        return this.cards.size();
    }
}
