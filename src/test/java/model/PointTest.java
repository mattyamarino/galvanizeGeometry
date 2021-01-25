package model;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void getters_returnsSetValueForXandY() {
        Point point = new Point(99, 27);
        assertEquals(99, point.getX(), 0);
        assertEquals(27, point.getY(), 0);
    }

    @Test
    public void offset_offsetsXandYbyNewValues() {
        Point point = new Point();
        point.offset(34, 76);
        assertEquals(34, point.getX(), 0);
        assertEquals( 76, point.getY(), 0);
    }
}