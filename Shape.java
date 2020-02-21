package finalProjectShape;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape [color=" + color + "]";
    }
    public abstract void prinData();
    public  abstract double calcArea();
    public abstract double circumference();



}

