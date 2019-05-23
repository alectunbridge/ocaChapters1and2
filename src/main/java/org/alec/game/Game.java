package org.alec.game;

public class Game {
    public static void main(String ... args) {
        FizzBuzz fizzBuzz = new FizzBuzz;
        int i = 0;

        do {
            System.out.println(fizzBuzz.play(i));
        } while (++i<100);
    }
}


// moved variable i to class level
// created new instance of fizzBuzz
// removed continue statement
// passed i in to play() method call
// fixed Main method signature
