package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void testCalcWhenSomeSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcWhenNoSquaresFound() {
        SQRService service = new SQRService();

        int actual = service.calc(0, 10);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcWhenOneSquareFound() {
        SQRService service = new SQRService();

        int actual = service.calc(50, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcWhenMaximumNumberOfSquares() {
        SQRService service = new SQRService();

        int actual = service.calc(100, 9801);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcWhenTheSameMiniAndMaxiValuesOfSquares() {
        SQRService service = new SQRService();

        int actual = service.calc(1380, 1380);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

}


