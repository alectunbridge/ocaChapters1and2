package org.alec.fizzbuzz;

import static org.alec.words.Words.*;

public class FizzBuzz {

    public String play(int number) {
        int currentNumber = number;
        String result = String.valueOf(currentNumber);
        int remainder = currentNumber % 15;

        switch (remainder){
            case 0:
              result = FIZZ + BUZZ;
              break;
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
        }
        return result;
    }
}
