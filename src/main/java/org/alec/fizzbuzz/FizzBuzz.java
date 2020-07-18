package org.alec.fizzbuzz;

import static org.alec.words.Words.*;

public class FizzBuzz {

    public String play(int number) {
        String result;
        int remainder = number % 15;

        switch (remainder) {
            case 0:
                result = FIZZ + BUZZ;
                break;
            case 3:
            case 6:
            case 9:
                result = FIZZ;
                break;
            case 5:
            case 10:
                result = BUZZ;
                break;
            default:
                result = "" + number;
        }
        return result;
    }
}
