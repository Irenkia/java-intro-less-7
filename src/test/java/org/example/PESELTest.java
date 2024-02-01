package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PESELTest {
    @Test
    public void whenIsStringTypeThrowException_thenAssertionSucceeds() throws WrongTypeOfDataException {
        //given
        String numberPesel = "12345123451";

        //when
        boolean rersult = PESEL.isStringType(numberPesel);

        //then
        Assertions.assertTrue(rersult);
    }

    @Test
    public void whenIsStringTypeThrowException_thenAssertionNotSuccessful() {
        //given
        String numberPesel = "12345123451а";
        boolean exceptionThrown = false;

        //when
        try {
            boolean result = PESEL.isStringType(numberPesel);
        } catch (WrongTypeOfDataException e) {
            exceptionThrown = true;
        }

        //then
        Assertions.assertTrue(exceptionThrown);
        System.out.println("WrongTypeOfDataException : problem with type");
    }

    @Test
    public void whenIsLengthRightThrowException_thenAssertionSucceeds() throws WrongTypeOfDataException {
        //given
        String numberPesel = "12345123451";

        //when
        boolean rersult = PESEL.isStringType(numberPesel);

        //then
        Assertions.assertTrue(rersult);
    }

    @Test
    public void whenIsLengthRightThrowException_thenAssertionNotSuccessful() {
        //given
        String numberPesel = "12345";
        boolean exceptionThrown = false;

        //when
        try {
            boolean result = PESEL.isLengthRight(numberPesel);
        } catch (IllegalLengthException e) {
            exceptionThrown = true;
        }

        //then
        Assertions.assertTrue(exceptionThrown);
        System.out.println("IllegalLengthException : Expected length = 11, got " + numberPesel.length());
    }

}
