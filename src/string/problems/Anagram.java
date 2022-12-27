package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your first word?");
        String str1 = scanner.next();
        System.out.println("What's your second word?");
        String str2 = scanner.next();

        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if (Arrays.equals(a1,a2)){
            System.out.println("the words are anagram");
        }
        else{
            System.out.println("The Words Are Not Anagram");
        }

    }
}
