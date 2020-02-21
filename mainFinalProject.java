package finalProjectShape;

import java.util.ArrayList;
import java.util.Scanner;

public class mainFinalProject {

    static Scanner scanner;
    static ArrayList<Shape> shapes = new ArrayList<>();

    static {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {

        boolean quit = false;
        while (!quit) {
            int mainOption = Menu.displayMainMenu();
            switch (mainOption) {
                case 2:
                    System.out.println("List all shapes");
                    printShapes(shapes);
                    break;
                case 3:
                    System.out.println("Sum all circumferences \n" + circumferences());
                    break;
                case 4:
                    System.out.println("Sum all areas \n" + calcAreas());
                    break;
                case 5:
                    System.out.println("Find biggest circumference \n" + biggestCircumference());
                    break;
                case 6:
                    System.out.println("Find biggest area \n" + biggestArea());
                    break;
                case 7:
                    System.out.println("Exit");
                    quit = true;
                    break;
                default:
                    break;
                case 11:
                    Square sq = addSquare();
                    if(sq!=null) {
                        shapes.add(sq);
                    }
                    break;
                case 12:
                    Rectangle rc = addRectangle();
                    if(rc!=null) {
                        shapes.add(rc);
                    }
                    break;
                case 13:
                    Circle c = addCircle();
                    if(c!= null) {
                        shapes.add(c);
                    }
                    break;
                case 14:
                    RightTriangle rt = addrightTriangle();
                    if(rt !=null) {
                        shapes.add(rt);
                    }
                    break;
                case 15:
                    break;
            }
        }
    }
    private static void printShapes(ArrayList<Shape> arr) {
        for (Shape shape : arr) {
            System.out.println(shape.toString());
        }
    }

    private static RightTriangle addrightTriangle() {
        System.out.println("Enter size of zelahA");
        double zelahA = scanner.nextDouble();
        System.out.println("Enter size of zelahB");
        double zelahB = scanner.nextDouble();
        System.out.println("Enter size of zelahC");
        double zelahC = scanner.nextDouble();
        System.out.println("Type the color");
        String color = scanner.next();
        RightTriangle rt = new RightTriangle(color, zelahA, zelahB, zelahC);
        if(zelahA>0 && zelahB>0 &&zelahC>0) {
            return rt;
        }else {
            return null;
        }
    }

    private static Circle addCircle() {
        System.out.println("Type the radius");
        double radius = scanner.nextDouble();
        System.out.println("Type the color.");
        String color = scanner.next();
        Circle c = new Circle(color,radius);
        if (radius>0) {
            return c;
        }else {
            return null;
        }

    }

    private static Rectangle addRectangle() {
        System.out.println("Type the width");
        double width = scanner.nextDouble();
        System.out.println("Type the height");
        double height = scanner.nextDouble();
        System.out.println("Type the color.");
        String color = scanner.next();
        Rectangle rc = new Rectangle(color, width, height);
        if(width>0 && height>0) {
            return rc;
        }else {
            return null;
        }

    }

    public static Square addSquare() {
        System.out.println("Type the side");
        double side = scanner.nextDouble();
        System.out.println("Type the color.");
        String color = scanner.next();
        Square sq = new Square(color, side);
        if(side>0) {
            return sq;
        }else {
            return null;
        }
    }

    public static double circumferences() {
        double sum=0;
        for (Shape shape : shapes) {
            sum +=	shape.circumference();
        }
        return sum;
    }
    public static double calcAreas() {
        double sum =0;
        for (Shape shape : shapes) {
            sum+=shape.calcArea();
        }
        return sum;
    }
    public static double biggestCircumference() {
        double max = 0;
        for (Shape shape : shapes) {
            if (shape.circumference()>max) {
                max= shape.circumference();
            }
        }
        return max;
    }
    public static double biggestArea() {
        double max =0;
        for (Shape shape : shapes) {
            if(shape.calcArea()>max) {
                max=shape.calcArea();
            }
        }
        return max;
    }
}
