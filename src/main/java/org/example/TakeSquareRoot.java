package org.example;

public class TakeSquareRoot {

    public static double getSquareRoot(double number) {
        if(number < 0){
            throw new IllegalArgumentException("Expected positive number, got " + number);
        }
        return Math.sqrt(number);
    }

}
