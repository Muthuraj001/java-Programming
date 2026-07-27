import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();
        double result;

        switch (operator) {
            case '+':
                result = n1 + n2;
                System.out.println("Result: " + n1 + " " + operator + " " + n2 + " = " + result);
                break;
            case '-':
                result = n1 - n2;
                System.out.println("Result: " + n1 + " " + operator + " " + n2 + " = " + result);       
                break;
            case '*':
                result = n1 * n2;
                System.out.println("Result: " + n1 + " " + operator + " " + n2 + " = " + result);       
                break;
            case '/':
                if (n2 != 0) {
                    result = n1 / n2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
