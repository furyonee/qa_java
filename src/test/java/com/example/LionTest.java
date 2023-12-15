package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensShouldReturnOneKitten() throws Exception {
        Lion male = new Lion("Самец", feline);
        when(feline.getKittens()).thenReturn(1);
        assertEquals(1, male.getKittens());
    }

    @Test(expected = Exception.class)
    public void incorrectCounstructorValueShouldThrowException() throws Exception {
        try {
            new Lion("...", feline);
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
            throw e;
        }
    }

    @Test
    public void predatorShouldHaveProperFood() throws Exception {
        Lion female = new Lion("Самка", feline);
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(expectedFood);
        assertEquals(expectedFood, female.getFood());
    }
}
