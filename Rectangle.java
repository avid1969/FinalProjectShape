package finalProjectShape;

public class Rectangle extends Shape{

    private double width;
    private double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double calcArea() {
        return this.length *this.width;

    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", length=" + length + " color=" + super.getColor()+ " area=" + calcArea() +"]";
    }

    @Override
    public void prinData() {
        System.out.println("This is rectangle area is: " + calcArea());

    }

    @Override
    public double circumference() {
        return 2*(this.width + this.length);
    }
}
