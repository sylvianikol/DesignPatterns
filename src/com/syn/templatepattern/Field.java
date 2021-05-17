package com.syn.templatepattern;

public class Field {

    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();

        System.out.println("-".repeat(10));

        game = new Football();
        game.play();
    }
}
