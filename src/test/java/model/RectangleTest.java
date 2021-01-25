package model;

import exceptions.NonExistingPointException;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest{
    Rectangle rectangle;

    @Test
    public void getters_returnsLengthAndWidth() {
        rectangle = new Rectangle(10, 5);
        assertEquals(10, rectangle.getLength(), 0);
        assertEquals(5, rectangle.getWidth(), 0);
    }

    @Test
    public void getters_returnsDefaultLengthAndWidthIfGivenNoInput() {
        rectangle = new Rectangle();
        assertEquals(1, rectangle.getLength(), 0);
        assertEquals(1, rectangle.getWidth(), 0);
    }

    @Test
    public void setters_setsLengthAndWidth() {
        rectangle = new Rectangle();
        rectangle.setLength(2);
        rectangle.setWidth(5);

        assertEquals(2, rectangle.getLength(), 0);
        assertEquals(5, rectangle.getWidth(), 0);
    }

    @Test
    public void getColor_returnsDefaultColor() {
        rectangle = new Rectangle();
        assertEquals("Burnt Umber", rectangle.getColor());
    }

    @Test
    public void getColor_returnsNewlySetColor() {
        rectangle = new Rectangle();
        rectangle.setColor("Blue");
        assertEquals("Blue", rectangle.getColor());
    }

    @Test
    public void getPerimeter_returnsSetPerimeter() {
        rectangle = new Rectangle();
        rectangle.setPerimeter(9);
        assertEquals(9, rectangle.getPerimeter(), 0);
    }

    @Test
    public void getArea_returnsSetArea() {
        rectangle = new Rectangle();
        rectangle.setArea(6);
        assertEquals(6, rectangle.getArea(), 0);
    }

    @Test
    public void getPoint_retrievesSetPoint() throws NonExistingPointException {
        rectangle = new Rectangle();
        rectangle.setPoint(8, 11);
        Point expected = new Point(8,11);
        assertEquals(expected, rectangle.getPoint());
    }

    @Test(expected = NonExistingPointException.class)
    public void getPoint_throwsNonExistingPointException() throws NonExistingPointException {
        rectangle = new Rectangle();
        rectangle.getPoint();
    }

    @Test
    public void getOffset_offsetsXAndYValueByAmountsProvided() throws NonExistingPointException {
        rectangle = new Rectangle();
        rectangle.setPoint(20,15);
        rectangle.setPointOffset(10,15);
        Point expected = new Point(30, 30);
        assertEquals(expected, rectangle.getPoint());
    }

}