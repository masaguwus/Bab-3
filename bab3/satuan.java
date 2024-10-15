import java.util.Scanner;

public class satuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Angka (100 - 999) : ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("===========================================");

        if (n >= 100 && n <= 999) {
            System.out.println("Angka ratusan : " + (n / 100));
            System.out.println("Angka puluhan : " + (n / 10) % 10);
            System.out.println("Angka satuan : " + (n % 10));
        } else {
            System.out.println("Input angka tidak valid.");
        }
    }
}
