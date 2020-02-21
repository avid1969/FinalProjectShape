package finalProjectShape;

public class Circle extends Shape {
    private double radius;


    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calcArea() {
        double area = Math.PI *Math.pow(getRadius(), 2);
        return area;
    }
    public double circumference() {
        double circum = Math.PI * 2 * this.radius;
        return circum;
    }

    @Override
    public void prinData() {
        System.out.println("I am a Circle and my area is: " + calcArea());

    }@Override
    public String toString() {
        return "Circle [radius=" + this.radius + " color=" + super.getColor()+  " area=" +calcArea()+ "]";
    }
}


