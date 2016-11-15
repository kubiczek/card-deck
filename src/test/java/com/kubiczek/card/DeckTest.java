package com.kubiczek.card;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

/**
 * Created by mkubiczek on 11/15/2016.
 */
public class DeckTest {

    @Test
    public void shouldShuffleDeckOfCards() {
        // given
        Deck deck = Deck.getInstance(Deck.STANDARD_52_CARD_DECK);
        // when
        deck.shuffle();
        // then
        assertThat(deck.size()).isEqualTo(52);
        boolean[][] flags = new boolean[Rank.values().length][Suit.values().length];
        while (deck.isEmpty()) {
            Card card = deck.take();
            assertThat(flags[card.getRank().ordinal()][card.getSuit().ordinal()]).isFalse();
            flags[card.getRank().ordinal()][card.getSuit().ordinal()] = true;
        }
    }

    @Test
    public void shouldThrowException_whenTakeCardFromEmptyDeck() {
        // given
        Deck deck = Deck.getInstance(Deck.EMPTY_DECK);
        // when
        // when
        Throwable thrown = catchThrowable(() ->
                deck.take());
        // then
        assertThat(thrown).isInstanceOf(IndexOutOfBoundsException.class);
    }
 }
