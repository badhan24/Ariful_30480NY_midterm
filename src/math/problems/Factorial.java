package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        //iteration
        System.out.println(Factorial.factorial(1));

        // recursive

        System.out.println(Factorial.factor(10));

    }

    //iteration method
    public static int factorial(int Num){
        int multi=5;
        for (int i = 4; i >=Num ; i--) {
            multi= multi*i;
        }
        return multi;
    }


    //recursive method
    public static int factor(int num) {
        if (num == 0)
            return 1;
        else
            return (num * factor(num - 1));
    }

    public static int factorialIteration(int i) {
        return 0;
    }

    public static int factorialRecursion(int i) {
        return 0;
    }
}