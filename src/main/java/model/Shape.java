package model;

import exceptions.NonExistingPointException;

public abstract class Shape {
    private String color = "Burnt Umber";
    private double perimeter;
    private double area;
    private Point point;

    public String getColor() {
        return color;
    };

    public void setColor(String color) {
        this.color = color;
    };

    public double getPerimeter() { return perimeter; }

    public void setPerimeter(double perimeter) { this.perimeter = perimeter; }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Point getPoint() throws NonExistingPointException {
        if(point == null) {
            throw new NonExistingPointException("This Shape Is Not Located On The Cartesian Plane");
        }
        return point;
    }

    public void setPoint(double x, double y) {
        this.point = new Point(x, y);
    }

    public void setPointOffset(double xOffset, double yOffset) {
        this.point.offset(xOffset, yOffset);
    }
}
