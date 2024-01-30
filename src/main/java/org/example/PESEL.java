package org.example;

public class PESEL {

    public static boolean isStringType(String numberPesel) {
        try {
            if (numberPesel instanceof String) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("IOException : problem with type");
            try {
                throw new WrongTypeOfDataException(e.getMessage());
            } catch (WrongTypeOfDataException ex) {
                System.out.println("FileProblemException : Expected type of String");
            }
        }
        System.out.println("FileProblemException : Expected type of String");
        return false;
    }

    public static boolean isLengthRight(String numberPesel) {
        try {
            if (numberPesel.length() == 11) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("IOException : problem with length");
            try {
                throw new IllegalLengthException(e.getMessage());
            } catch (IllegalLengthException ex) {
                System.out.println("IllegalLengthException : Expected length = 11, got " + numberPesel.length());
            }
        }
        System.out.println("IllegalLengthException : Expected length = 11, got " + numberPesel.length());
        return false;
    }
}
