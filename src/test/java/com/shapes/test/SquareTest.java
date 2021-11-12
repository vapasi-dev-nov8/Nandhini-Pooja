package com.shapes.test;

import com.shapes.Square;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    /*@Test
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
    } */

    @ParameterizedTest
    @MethodSource("provideSideForArea")
    void shouldCalculateAreaOfSquare(double side, double expectedArea) {
        // Given
        Square square = new Square(side);

        // When
        double actualArea = square.area();

        // Then
        assertEquals(expectedArea, actualArea);
    }

    private static Stream<Arguments> provideSideForArea() {
        return Stream.of(
                Arguments.of(2.0, 4.0),
                Arguments.of(0.0, 0.0 )
        );
    }

    @ParameterizedTest
    @MethodSource("provideSideForPerimeter")
    void shouldCalculatePerimeterOfSquare(double side, double expectedPerimeter) {
        // Given
        Square square = new Square(side);

        // When
        double actualPerimeter = square.perimeter();

        // Then
        assertEquals(expectedPerimeter, actualPerimeter);
    }

    private static Stream<Arguments> provideSideForPerimeter() {
        return Stream.of(
                Arguments.of(2.0, 8.0),
                Arguments.of(0.0, 0.0 )
        );
    }
}
