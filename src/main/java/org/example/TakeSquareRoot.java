package org.example;

public class TakeSquareRoot {

    public static double getSquareRoot(double number) {
        try{
            if(number <= 0){
                throw new IllegalArgumentException("Expected positive number, got " + number);
            }
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
        return Math.sqrt(number);
    }

}
