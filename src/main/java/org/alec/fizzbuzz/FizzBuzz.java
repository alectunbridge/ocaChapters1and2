package org.alec.fizzbuzz;

import static org.alec.words.Words.*;

public class FizzBuzz {

    public String play(int number) {
        int currentNumber = number;
        String result = String.valueOf(currentNumber);
        int remainder = currentNumber % 15;

        switch (remainder){ // this works for 1-14. 15, remainder 0.. prints 15 ()
            case 0:
              result = Words.FIZZ + Words.BUZZ;
              break;
            case 3:
            case 6:
            case 9:
            case 12:
                result = Words.FIZZ;
                break;
            case 5:
            case 10:
                result = Words.BUZZ;
                break;
            case 15:
                result = Words.FIZZ + Words.BUZZ;
                break;
        }
        return result;
    }
}

// line 3 - switched static import to import static
// lines 24/27 - called BUZZ & FIZZ using class name
// line 7 - added argument of int number
// line 8 - assigned currentNumber as number, not 1 (maybe remove this variable)
// removed currentNumber.increment()
// Line 9 - assigned currentNumber to result variable
// Line 13-15 - added case 0 for numbers divisible by 3 & 5
