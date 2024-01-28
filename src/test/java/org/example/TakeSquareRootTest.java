package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Double.NaN;

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

        //when
        double result = TakeSquareRoot.getSquareRoot(number);

        //then
        Assertions.assertEquals(0.0, result);
    }

}
