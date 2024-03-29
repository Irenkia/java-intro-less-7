package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class TakeSquareRootTest {
    @Test
    public void mustTakeSquareRootFromPositiveNumber() throws Exception {
        //given
        double number = 16.0;

        //when
        double result = TakeSquareRoot.getSquareRoot(number);

        //then
        Assertions.assertEquals(4.0, result);
    }

    @Test
    public void whenTakeSquareRootFromNegativeNumberThrowException(){
        //given
        double number = -16.0;
        boolean exceptionThrown = false;

        //when
        try {
            TakeSquareRoot.getSquareRoot(number);
        } catch (IllegalArgumentException e) {
            exceptionThrown = true;
        }

        //then
        Assertions.assertTrue(exceptionThrown);
    }

}
