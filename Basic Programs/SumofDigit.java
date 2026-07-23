public class SumofDigit {

    public static void main(String[] args) {
        int n = 12345;
        int sum = 0;

        while (n > 0) {
            sum += n % 10;      // Add the last digit to sum
            n /= 10;        // Remove the last digit
        }

        System.out.println("Sum of digits: " + sum);
    }
    
}