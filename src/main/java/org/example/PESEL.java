package org.example;

public class PESEL {
    public static boolean containDigitString(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isStringType(String numberPesel) throws WrongTypeOfDataException {
        if (!containDigitString(numberPesel)) {
            throw new WrongTypeOfDataException("WrongTypeOfDataException : problem with type");
        }
        return true;
    }

    public static boolean isLengthRight(String numberPesel) throws IllegalLengthException {
        if (numberPesel.length() != 11) {
            throw new IllegalLengthException("IllegalLengthException : Expected length = 11, got " + numberPesel.length());
        }
        return true;
    }
}
