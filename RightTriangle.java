package finalProjectShape;

public abstract class RightTriangle extends Shape {

    private double zelahA;
    private double zelahB;
    private double zelahC;

    public RightTriangle(String color, double zelahA, double zelahB, double zelahC) {
        super(color);
        this.zelahA = zelahA;
        this.zelahB = zelahB;
        this.zelahC = zelahC;
    }

    public double getZelahA() {
        return zelahA;
    }

    public void setZelahA(double zelahA) {
        this.zelahA = zelahA;
    }

    public double getZelahB() {
        return zelahB;
    }

    public void setZelahB(double zelahB) {
        this.zelahB = zelahB;
    }

    public double getZelahC() {
        return zelahC;
    }

    public void setZelahC(double zelahC) {
        this.zelahC = zelahC;
    }

    @Override
    public String toString() {
        return "RightTriangle [zelahA=" + zelahA + ", zelahB=" + zelahB + ", zelahC=" + zelahC + " color=" + super.getColor()+ " area=" + calcArea() +"]";
    }

    @Override
    public double calcArea() {
        return zelahA*zelahB/2;
    }

    @Override
    public double circumference() {
        return zelahA +zelahB +zelahC;
    }
}
