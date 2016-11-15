package com.kubiczek.card;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by mkubiczek on 11/15/2016.
 */
@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Deck deck = Deck.getInstance(Deck.STANDARD_52_CARD_DECK);
            log.info("Deck of cards: {}", deck);
            log.info("Shuffling...");
            deck.shuffle();
            log.info("Deck of cards: {}", deck);
        };
    }
}
