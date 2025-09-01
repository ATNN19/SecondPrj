package iuh.fit.se;

/**
 * @description: This class represents a rectangle with length and width
 * @author: Nguyen Van A
 * @version: 1.0
 * @created: 23-Aug-2025 09:10:00 PM
 */
public class Rectangle {
    private double length;
    private double width;

    // Constructor có kiểm tra dữ liệu đầu vào
    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }

    public double getLength() { return length; }
    public double getWidth() { return width; }

    public void setLength(double newVal) {
        if (newVal < 0) throw new IllegalArgumentException("Length must be greater than 0");
        this.length = newVal;
    }

    public void setWidth(double newVal) {
        if (newVal < 0) throw new IllegalArgumentException("Width must be greater than 0");
        this.width = newVal;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return String.format("Rectangle[length= %.2f, width= %.2f]", length, width);
    }

}
