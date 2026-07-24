import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number : ");
        int n = sc.nextInt();
        System.out.print("Enter a last number : ");
        int m = sc.nextInt();

        for (int i=n; i <= m; i++) {
            System.out.println(i);
        }
    }
}