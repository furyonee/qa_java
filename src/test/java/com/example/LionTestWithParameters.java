package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTestWithParameters {
    @Mock
    Feline feline;

    private String gender;
    private boolean expectedHasMane;

    public LionTestWithParameters(String gender, boolean expectedHasMane) {
        this.gender = gender;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters()
    public static Object[][] hasMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void shouldHaveManeDependsOnGender() throws Exception {
        Lion male = new Lion(gender, feline);
        assertEquals(expectedHasMane, male.doesHaveMane());
    }
}
