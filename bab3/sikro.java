import java.util.Scanner;
import java.math.BigInteger;

public class sikro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        BigInteger factorial = BigInteger.ONE;
        int i = 1;
        while (true) {
            factorial = factorial.multiply(BigInteger.valueOf(i));

            // Count the trailing zeros
            int trailingZeros = countTrailingZeros(factorial);

            // Check if the factorial has exactly 'n' trailing zeros
            if (trailingZeros == n) {
                System.out.println(i + "! ");
            }

            i++;
        }
    }

    // Helper function to count trailing zeros in a BigInteger
    private static int countTrailingZeros(BigInteger num) {
        int count = 0;
        while (num.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            count++;
            num = num.divide(BigInteger.TEN);
        }
        return count;
//        boolean found = true;
//        for (int i = 1; found; i++) {
//            sum *= i;
//            if (sum % Math.pow(10, n) == 0 && sum % Math.pow(10, n + 1) != 0) {
//                System.out.println(i + "! ");
//            } else if (sum % Math.pow(10, n + 1) == 0) {
//                found = false;
//            }
//        }
    }
}
