package org.example;

public class CheckDivisionByThree {

    public static void validate(int[] values){
        if(checkParameterForZero(values)){
            for (int i = 0; i < values.length; i++){
                try {
                    checkIfDivisible(values[i]);
                }catch (IllegalArgumentException e){
                    e.getMessage();
                }
            }
        }
    }

    public static boolean checkParameterForZero(int[] values){
        if(values == null){
            return false;
        }
        return true;
    }

    public static boolean checkIfDivisible(int number){
        if(number % 3 != 0){
            System.out.println("Wrong value \"" + number + "\"  not divisible by 3");
            throw new IllegalArgumentException();
        }else {
            System.out.println("Value \"" + number + "\"  divisible by 3");
            return true;
        }
    }
}
