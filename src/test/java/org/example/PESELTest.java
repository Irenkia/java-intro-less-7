package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PESELTest {
    @Test
    public void mustIsStringType() {
        //given
        String numberPesel = "12345123451";

        //when
        boolean result = PESEL.isStringType(numberPesel);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void whenIsStringTypeThrowException_thenAssertionSucceeds() {
        //given
        String numberPesel = null;
        boolean exceptionThrown = true;

        //when
        try {
            boolean result = PESEL.isStringType(numberPesel);
        } catch (Exception e) {
            try {
                throw new WrongTypeOfDataException(e.getMessage());
            } catch (WrongTypeOfDataException ex) {
                System.out.println("FileProblemException : Expected type of String");
                exceptionThrown = false;
            }
        }

        //then
        Assertions.assertTrue(exceptionThrown);
    }

    @Test
    public void mustIsLengthRight() {
        //given
        String numberPesel = "12345123451";

        //when
        boolean result = PESEL.isLengthRight(numberPesel);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void whenIsLengthRightThrowException_thenAssertionSucceeds() {
        //given
        String numberPesel = "12345";
        boolean exceptionThrown = true;

        //when
        try {
            boolean result = PESEL.isLengthRight(numberPesel);
        } catch (Exception e) {
            try {
                throw new IllegalLengthException(e.getMessage());
            } catch (IllegalLengthException ex) {
                System.out.println("IllegalLengthException : Expected length = 11, got " + numberPesel.length());
                exceptionThrown = false;
            }
        }

        //then
        Assertions.assertTrue(exceptionThrown);
    }

}
