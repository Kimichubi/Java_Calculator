import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        Scanner input = new Scanner(System.in);
        int option;

        do {
            printMenu();
            option = getIntInput(input, "Select an option: ");

            if (option >= 1 && option <= 4) {
                int num1 = getIntInput(input, "Please enter the first number: ");
                int num2 = getIntInput(input, "Please enter the second number: ");
                performOperation(option, num1, num2);
            } else if (option != 5) {
                System.out.println("Please enter a correct option!");
            }
        } while (option != 5);

        System.out.println("Closing...");
        input.close();
    }

    public static void printMenu() {
        System.out.println("Please select an option:");
        System.out.println("1: Sum");
        System.out.println("2: Subtraction");
        System.out.println("3: Division");
        System.out.println("4: Multiplication");
        System.out.println("5: Quit");
    }

    public static int getIntInput(Scanner input, String prompt) {
        System.out.print(prompt);
        while (!input.hasNextInt()) {
            System.out.print("Invalid input. " + prompt);
            input.next(); // discard invalid input
        }
        return input.nextInt();
    }

    public static void performOperation(int option, int num1, int num2) {
        switch (option) {
            case 1:
                System.out.println("Result: " + sum(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case 3:
                if (num2 != 0) {
                    System.out.println("Result: " + divide(num1, num2));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            case 4:
                System.out.println("Result: " + multiply(num1, num2));
                break;
        }
    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }
}
