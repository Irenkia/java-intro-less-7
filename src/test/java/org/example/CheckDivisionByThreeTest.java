package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckDivisionByThreeTest {
    @Test
    public void mustValidateDivisionByThreeThrowException_thenAssertionSucceeds() {
        //given
        int[] arr = {1, 2, 3, 4, 5, 6};
        boolean exceptionThrown = true;

        //when
        try {
            CheckDivisionByThree.validate(arr);
        } catch (IllegalArgumentException ex) {
            exceptionThrown = false;
        }

        //then
        Assertions.assertTrue(exceptionThrown);
    }

    @Test
    public void mustValidateDivisionByThree_whereParameterNullThrowException_thenAssertionSucceeds() {
        //given
        int[] arr = null;
        boolean exceptionThrown = true;

        //when
        try {
            CheckDivisionByThree.validate(arr);
        } catch (IllegalArgumentException ex) {
            exceptionThrown = false;
        }

        //then
        Assertions.assertTrue(exceptionThrown);
    }
}
