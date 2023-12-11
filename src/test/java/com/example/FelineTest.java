package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
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
