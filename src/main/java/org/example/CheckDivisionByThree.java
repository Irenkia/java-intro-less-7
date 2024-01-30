package org.example;

public class CheckDivisionByThree {

    public static void validate(int[] values){
        for (int i = 0; i < values.length; i++){
            try {
                if(values[i] % 3 != 0){
                    System.out.println("Wrong value \"" + values[i] + "\"  not divisible by 3");
                    throw new IllegalArgumentException();
                }else {
                    System.out.println("Value \"" + values[i] + "\"  divisible by 3");
                }
            }catch (IllegalArgumentException e){
                e.getMessage();
            }
        }
    }
}
