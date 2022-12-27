package math.problems;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        long[] fib = new long[40];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < fib.length; i++) {
            System.out.print(fib[i] + " ");
        }

    }

    }

