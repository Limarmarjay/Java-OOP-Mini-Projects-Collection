import java.util.Scanner;

class ShapeDrawer {
    private int shapeHeight, shapeLength;  // Instance variables for shape dimensions
    private char shapeChar;

    // Method to start the shape drawing process
    public void run() {
        System.out.println("\nThis program should draw the user-chosen shape");
        System.out.println("User should also decide the shape size and the character to draw!\n");

        int choice = makeChoice();
        requestShapeInfo(choice);
        drawShapes(choice);
    }

    // Method to make the shape choice
    private int makeChoice() {
        int choice;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("\t 1. square");
            System.out.println("\t 2. rectangle");
            System.out.println("\t 3. isosceles triangle");
            System.out.println();
            System.out.print("Please tell me what shape to draw: ");
            choice = input.nextInt();
        } while (choice < 1 || choice > 3);

        return choice;
    }

    // Method to request the shape information
    private void requestShapeInfo(int choice) {
        Scanner input = new Scanner(System.in);

        if (choice == 2) { // For rectangle
            System.out.print("Please tell me the height of the rectangle to draw: ");
            shapeHeight = input.nextInt();
            System.out.print("Please tell me the length of the rectangle to draw: ");
            shapeLength = input.nextInt();
        } else { // For square or triangle
            System.out.print("Please tell me the height of the shape to draw: ");
            shapeHeight = input.nextInt();
        }

        System.out.print("Please tell me the character to draw the shape: ");
        shapeChar = input.next().charAt(0);
    }

    // Method to draw the chosen shape
    private void drawShapes(int choice) {
        switch (choice) {
            case 1:
                drawSquare(shapeHeight, shapeChar);
                break;
            case 2:
                drawRectangle(shapeHeight, shapeLength, shapeChar);
                break;
            case 3:
                drawTriangle(shapeHeight, shapeChar);
                break;
            default:
                System.out.println("\nThere must be something wrong!");
        }
    }

    // Method to draw a square
    private void drawSquare(int size, char ch) {
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to draw a rectangle
    private void drawRectangle(int height, int length, char ch) {
        System.out.println();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to draw an isosceles triangle
    private void drawTriangle(int size, char ch) {
        int nSpace = size - 1;
        int nChar = 1;
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < nSpace; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < nChar; j++) {
                System.out.print(ch);
            }
            System.out.println();
            nSpace--;
            nChar += 2;
        }
        System.out.println();
    }
}

// Main class to execute user-defined class
public class Main2 {
    public static void main(String[] args) {
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.run();
    }
}


