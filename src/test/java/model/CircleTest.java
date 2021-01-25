package model;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest{

    Circle circle;

    @Test
    public void getRadius_returnsRadius() {
        circle = new Circle(4);
        assertEquals(4, circle.getRadius(), 0);
    }

    @Test
    public void getRadius_returnsDefaultValueIfUsingEmptyConstructor() {
        circle = new Circle();
        assertEquals(1, circle.getRadius(), 0);
    }

    @Test
    public void setRadius_setsValueProvided() {
        circle = new Circle();
        circle.setRadius(22);
        assertEquals(22, circle.getRadius(), 0);
    }


    @Test
    public void getColor_returnsDefaultColor() {
        circle = new Circle();
        assertEquals("Burnt Umber", circle.getColor());
    }

    @Test
    public void getColor_returnsNewlySetColor() {
        circle = new Circle();
        circle.setColor("Blue");
        assertEquals("Blue", circle.getColor());
    }


}