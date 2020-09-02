package me.right42;

import me.right42.example2.*;

import java.time.*;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Movie movie = new Movie(
                "아바타",
                Duration.ofMinutes(120),
                Money.wons(10000),
                new AmountDiscountPolicy(
                        Money.wons(800),
                        new SequenceCondition(1),
                        new SequenceCondition(10)
                )
        );

        Screening screening = new Screening(movie, 2, LocalDateTime.now());
        System.out.println(movie.calculateMovieFee(screening));
    }
}
