package com.shapes.test;

import com.shapes.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    void shouldCalculateArea()
    {
        Square square = new Square(5);
        assertEquals(25,square.area());
    }

    @Test
    void shouldCalculatePerimeter()
    {
        Square square = new Square(4);
        assertEquals(16,square.perimeter());
    }
}
