package org.alec.fizzbuzz;

import static org.alec.words.Words.*;

public class FizzBuzz {

    public String play() {
        int currentNumber = 1;
        String result = "";
        int remainder = currentNumber % 15;

        switch (remainder){

            case 3:
            case 6:
            case 9:
            case 12:
                result = FIZZ;
                break;
            case 5:
            case 10:
                result = BUZZ;
                break;
            case 15:
                result = FIZZ + BUZZ;
                break;
                default: result += currentNumber;
        }
        return result;
    }
}
