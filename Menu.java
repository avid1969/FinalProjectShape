package finalProjectShape;

import java.util.Scanner;

public class Menu {

    public Menu() {

    }

    public static int displayMainMenu() {
        while(true){
            System.out.println("Choose from the option: \n");
            System.out.println(
                    "1)Add new shape\r\n" +
                            "2)List all shapes\r\n" +
                            "3)Sum all circumferences\r\n" +
                            "4)Sum all areas\r\n" +
                            "5)Find biggest circumference\r\n" +
                            "6)Find biggest area\r\n" +
                            "7)Exit\r\n" + "");
            System.out.println("Selection: ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    int subMenu = displayShapeMenu();
                    switch (subMenu) {
                        case 1:
                            System.out.println("Add Square");
                            return 11;
                        case 2:
                            System.out.println("Add Rectangle");
                            return 12;
                        case 3:
                            System.out.println("Add Circle");
                            return 13;
                        case 4:
                            System.out.println("Add Right triangle");
                            return 14;
                        case 5:
                            System.out.println("Exit");
                            return 15;
                        default:
                            continue;
                    }
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 6;
                case 7:
                    return 7;
            }
        }
    }
    private static int displayShapeMenu() {
        while(true) {
            System.out.println("Choose from the option: \n To add new shape: \n");
            System.out.println(
                    "1)Square\r\n" +
                            "2)Rectangle\r\n" +
                            "3)Circle\r\n" +
                            "4)Right triangle\r\n" +
                            "5)Exit to main menu \n"
                            + " ");
            System.out.println("Selection: ");
            Scanner scanner  = new Scanner(System.in);
            int shapeOptionp = scanner.nextInt();
            if(shapeOptionp >= 1 && shapeOptionp <= 5) {
                return shapeOptionp;
            }
        }
    }
}
