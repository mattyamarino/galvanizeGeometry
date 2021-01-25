import exceptions.NonExistingPointException;
import model.Circle;
import model.Point;
import model.Rectangle;
import model.Shape;

import java.lang.Math;
import java.util.ArrayList;
import java.util.List;


public class geomertyService {

    public List<Shape> shapes;

    public double distanceBetweenShapes(Point point1, Point point2) {
        double x = getDifference(point1.getX(), point2.getX());
        double y = getDifference(point1.getY(), point2.getY());
        double distanceSquared = (x * x) + (y * y);
        return Math.sqrt(distanceSquared);
    }

    double getDifference(double firstValue, double secondValue) {
        if(firstValue > secondValue) {
            return firstValue - secondValue;
        }
        return secondValue - firstValue;
    }

    public String getRectangleInformation(Rectangle rectangle)  {
        String cordinates = getCordinates(rectangle);
        return rectangle.getLength() + " X " + rectangle.getWidth() + " rectangle" + cordinates;
    }

    public String getCircleInformation(Circle circle) {
        String cordinates = getCordinates(circle);
        return "circle of radius " + circle.getRadius() + cordinates;
    }

    String getCordinates(Shape shape) {
        String cordinates;
        try {
            cordinates = " at (" + shape.getPoint().getX() + "," + shape.getPoint().getY() + ")";
        } catch (NonExistingPointException ex) {
            cordinates = "";
        }
        return cordinates;
    }

    public String getPointInformation(Point point) {
        return "(" + point.getX() + "," + point.getY() + ")";
    }

    public List<Shape> getPlane() {
        List<Shape> returnList = new ArrayList<>();
        for(Shape shape: shapes) {
            try{
                if(shape.getPoint() != null) {
                    returnList.add(shape);
                }
            } catch (NonExistingPointException e) {
            }
        }
        return  returnList;
    }
}
