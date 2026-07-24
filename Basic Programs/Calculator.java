import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double res;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double a = sc.nextDouble();
        System.out.print("Enter a Operator : ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter second number : ");
        double b = sc.nextDouble();

        switch (operator) {
            case '+':
                res = a + b;
                System.out.println("Result => " + a + " " + operator + " " + b + " = " + res);
                break;
            case '-':
                res = a - b;
                System.out.println("Result => " + a + " " + operator + " " + b + " = " + res);
                break;
            case '*':
                res = a * b;
                System.out.println("Result => " + a + " " + operator + " " + b + " = " + res);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    break;
                }else {
                    res = a / b;
                    System.out.println("Result => " + a + " " + operator + " " + b + " = " + res);
                    break;
                }
            default:
                System.out.println("Error: Invalid operator entered.");
        }
    }
    
}
