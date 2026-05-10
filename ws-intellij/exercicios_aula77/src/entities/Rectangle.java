package entities;

public class Rectangle {
    public double width, height;

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return (width * 2) + (height * 2);
    }

    public double calculateDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
