package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            if (i == 42) {
                System.out.println("Answer to the Ultimate");
            } else if (i% 5 == 0 & i% 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i% 5 == 0) {
                System.out.println("Buzz");
            } else if (i% 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    } // Shayan , Islam , Leszek
}
