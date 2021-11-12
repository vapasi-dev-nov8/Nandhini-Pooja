package com.shapes.test;

import com.shapes.Rectangle;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    void shouldCalculateArea()
    {
        Rectangle rectangle = new Rectangle(5, 3);
        assertEquals(15,rectangle.area());
    }

    @Test
    void shouldCalculatePerimeter()
    {
        Rectangle rectangle = new Rectangle(4, 5);
        assertEquals(18,rectangle.perimeter());
    }

    /*@ParameterizedTest
    @MethodSource("provideLengthBreadthAndArea")
    void shouldCalculateAreaOfRectangle(double length, double width, double expectedArea) {
        // Given
        Rectangle rectangle = new Rectangle(length, width);

        // When
        double actualArea = rectangle.area();

        // Then
        assertEquals(expectedArea, actualArea);
    }

    private static Stream<Arguments> provideLengthBreadthAndArea() {
        return Stream.of(
                Arguments.of(2.0, 3.0, 8.0),
                Arguments.of(2.0, 0.0, 7.0),
                Arguments.of(0.0, 3.0, 5.0)
        );
    }*/

}
