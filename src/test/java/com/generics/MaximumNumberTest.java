package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest <E> {
    @Test
    public void givenIntegerThreeNumber_whenProper_shouldGiveMaximumNumber() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Integer a = 10;
        Integer b = 5;
        Integer c = 4;
        Integer result = (Integer) maximumNumber.maximumNumberFind(a, b, c);
        Assert.assertEquals(a, result);
    }

    @Test
    public void givenThreeDoubleNumber_whenProper_shouldGiveMaximumNumber() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Double a = 1.5;
        Double b = 1.3;
        Double c = 1.4;
        Double result = (Double) maximumNumber.maximumNumberFind(a, b, c);
        Assert.assertEquals(a, result);
    }

    @Test
    public  void givenThreeNumberRandom_whenProper_shouldGiveMaximumNumber() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Character a = 'a';
        Character b = 'b';
        Character c = 'c';
        Character result = (Character) maximumNumber.maximumNumberFind(a, b, c);
        Assert.assertEquals(c, result);

    }
}