package finalProjectShape;

public class Square extends Shape {

    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;

    }

    public double calcArea() {
        return this.side*this.side;

    }

    @Override
    public String toString() {
        return "Square [width=" + side + " color=" + super.getColor()+ " area=" +calcArea() + "]";
    }

    @Override
    public void prinData() {
        System.out.println("This is Square and area is: " + calcArea());

    }

    @Override
    public double circumference() {
        return 4*this.side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


}
