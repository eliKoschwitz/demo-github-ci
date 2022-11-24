package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void addWhen2And5Then7() {
        // GIVEN
        int a = 2;
        int b = 5;

        // WHEN
        int actual = Main.add(a, b);

        // THEN
        Assertions.assertEquals(9, actual);
    }
}