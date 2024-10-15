import java.util.Scanner;

class logika {
    public static long permutasi (int n, int m) {
        long result = 1;
        for (int i = n; i > n - m; i--) {
            result *= i;
        }
        return result;
    }
}

public class Permutasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logika obj = new logika();
        System.out.println("===============================================");
        System.out.println("Rumus permutasi : nPm = n! / (n - m)!");
        System.out.println("===============================================");
        System.out.print("Nilai n : ");
        int n = scanner.nextInt();
        System.out.print("Nilai m : ");
        int m = scanner.nextInt();
        scanner.close();
        System.out.println("===============================================");
        long result = obj.permutasi(n ,m);
        System.out.println("Hasil permutasi : " + result);
    }
}
