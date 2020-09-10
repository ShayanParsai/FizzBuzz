package com.company;

public class Main {

    public static void main(String[] args) {


        for (int i=1; i<101; i++){

            if (i%3 == 0 & i != 42 & i !=15 & i !=30 & i !=45 & i !=60 & i !=75 & i !=90){
                System.out.println("Fizz");

            }

            if (i%5 == 0 & i !=15 & i !=30 & i !=45 & i !=60 & i !=75 & i !=90){
                System.out.println("Buzz");
            }

            if (i%3 == 0 & i%5 == 0){
                System.out.println("FizzBuzz");
            }

            if (i == 42){
                System.out.println("Answer to the Ultimate Question of Life, the Universe, and Everything");
            }

            else if (i%3 != 0 & i%5 != 0 & i != 42){
                System.out.println(i);
                //great code
            }
        }
    }
}
