import java.util.Scanner;

class bintang {
    public static void pengulangan (int n) {
        for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print("  ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print("* ");
                }
            System.out.println();
        }
    }
}

public class bintang4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bintang obj = new bintang();
        System.out.print("Masukkan nilai n = ");
        int n = scanner.nextInt();
        scanner.close();
        obj.pengulangan(n);
    }
}
