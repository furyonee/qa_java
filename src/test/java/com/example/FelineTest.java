package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    private Feline feline = new Feline();

    @Test
    public void getFamilyReturnsFelineValue() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensWithParametersShouldReturnAppropriateValue() {
        assertEquals(2, feline.getKittens(2));
    }

    @Test
    public void getKittensWithNoParametersShouldReturnOne() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void doesHaveMane() {
        assertEquals(false, feline.doesHaveMane());
    }
}
