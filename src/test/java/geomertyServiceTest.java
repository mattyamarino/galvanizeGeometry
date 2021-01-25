import exceptions.NonExistingPointException;
import model.Circle;
import model.Point;
import model.Rectangle;
import model.Shape;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class geomertyServiceTest {
    geomertyService service;

     @Before
     public void setup() {
         service = new geomertyService();
     }

     @Test
     public void distanceBetweenShapes_returnsLinearDistanceBetweenPoints() {
         Point point1 = new Point(5,10);
         Point point2 = new Point(20,8);

         double result = service.distanceBetweenShapes(point1, point2);

         assertEquals(15.132745950421556, result, 0);
     }

     @Test
     public void getRectangleInformation_returnsLengthWidthAndPoint()  {
        Rectangle rectangle = new Rectangle(15,30);
        rectangle.setPoint(3,4);
        String expected = "15.0 X 30.0 rectangle at (3.0,4.0)";
        String result = service.getRectangleInformation(rectangle);
        assertEquals(expected, result);
     }

     @Test
     public void getRectangleInformation_returnsLengthWidth() {
        Rectangle rectangle = new Rectangle(15,30);
        String expected = "15.0 X 30.0 rectangle";
        String result = service.getRectangleInformation(rectangle);
        assertEquals(expected, result);
     }

     @Test
    public void getCircleInformation_returnsRadiusAndPoint()  {
         Circle circle = new Circle();
         circle.setPoint(5,7);
         String expected = "circle of radius 1.0 at (5.0,7.0)";
         String result = service.getCircleInformation(circle);
         assertEquals(expected, result);
     }

     @Test
    public void getCircleInformation_returnsRadius() {
         Circle circle = new Circle();
         String expected = "circle of radius 1.0";
         String result = service.getCircleInformation(circle);
         assertEquals(expected, result);
     }

     @Test
    public void getPointInformation_returnsCordinates() {
         Point point = new Point(1,7);
         String expected = "(1.0,7.0)";
         String result = service.getPointInformation(point);
         assertEquals(expected, result);
     }

     @Test
    public void getPlane_getShapesOnPlane() {
         Circle circle1 = new Circle();
         Circle circle2 = new Circle();
         circle2.setPoint(5,7);
         Rectangle rectangle1 = new Rectangle(15,30);
         rectangle1.setPoint(3,4);
         List<Shape> shapeList = new ArrayList<>();
         shapeList.add(circle1);
         shapeList.add(circle2);
         shapeList.add(rectangle1);
         service.shapes = shapeList;
         List<Shape> expectedList = new ArrayList<>();
         expectedList.add(circle2);
         expectedList.add(rectangle1);
         List<Shape> result = service.getPlane();
         assertEquals(expectedList, result);


     }

}