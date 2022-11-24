package de.neuefische;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void add() {
        //GIVEN
        int num1 = 5;
        int num2 = 6;
        //WHEN
        int actual = Main.add(num1, num2);
        //THEN
        Assertions.assertEquals(10, actual);
    }

}