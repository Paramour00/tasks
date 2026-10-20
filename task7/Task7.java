package task7;
import java.util.*;


public class Task7 {

    class Calculator {
        double num1, num2;

        public Calculator(double num1, double num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        public double add() {
            return num1 + num2;
        }

        public double subtract() {
            return num1 - num2;
        }

        public double multiply() {
            return num1 * num2;
        }

        public double divide() {
            if (num2 != 0) {
                return num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        Task7 task7 = new Task7();
        Calculator calculator = task7.new Calculator(num1, num2);

        System.out.println("Addition: " + calculator.add());
        System.out.println("Subtraction: " + calculator.subtract());
        System.out.println("Multiplication: " + calculator.multiply());
        System.out.println("Division: " + calculator.divide());

        sc.close();
    }
}
