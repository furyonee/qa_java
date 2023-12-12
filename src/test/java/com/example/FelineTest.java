package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private Feline feline;

    @Test
    public void getFamilyReturnsFelineValue() {
        feline.getFamily();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensWithParametersShouldReturnAppropriateValue() {
        feline.getKittens(2);
        assertEquals(2, feline.getKittens(2));
    }

    @Test
    public void getKittensWithNoParametersShouldReturnOne() {
        feline.getKittens();
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void doesHaveMane() {
        feline.doesHaveMane();
        assertEquals(false, feline.doesHaveMane());
    }
}
