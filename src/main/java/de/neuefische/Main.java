package de.neuefische;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String playFizzbuzz(int value) {
        if (value < 0){
            return "Please enter a positive Number";
        }
        if (value % 3 == 0 && value % 5 == 0){
            return "fizzbuzz";
        } else if (value % 5 == 0) {
            return "buzz";
        } else if (value % 3 == 0) {
            return "fizz";
        }
        return ""+value;
    }
}