package com.company;

public class Main {

    public static void main(String[] args) {


        for (int i=0; i<101; i++){

            if (i%3 == 0){
                System.out.println("Fizz");
            }

            if (i%5 == 0){
                System.out.println("Buzz");
            }

            if (i%3 == 0 & i%5 == 0){
                System.out.println("FizzBuzz");
            }

            if (i == 42){
                System.out.println("Answer to the Ultimate Question of Life, the Universe, and Everything");
            }

            else{
                System.out.println(i);
            }
        }
    }
}
