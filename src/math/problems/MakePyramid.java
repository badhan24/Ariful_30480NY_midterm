package math.problems;

import static jdk.nashorn.internal.objects.Global.print;

public class MakePyramid {

    static int i;
    static int j;
    static int k;
    static int number;
    public static void main(String[] args) {
        /*   Implement a large Pyramid of stars in the screen with java.
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         */




        for(i=1; i<=number; i++)
        {
            for(j=i; j<number;j++)
                System.out.print("I");
            for(k=1; k<(i*2); k++)
                System.out.print("*");
            System.out.print("\n");

        }



        }

  }
