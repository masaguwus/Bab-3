import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k, n, m = 0, x = 0;
        int min = 0, max = 0;
        double mean;
        System.out.print("Berapa kali pengulangan : ");
        k = scanner.nextInt();
        System.out.println();
        for (int i = 0; i < k; i++) {
            n = m;
            m = scanner.nextInt();
            x += m;
            if (i > 0 && i <= 1) {
                if (n < m) {
                    min = n;
                    max = m;
                } else {
                    min = m;
                    max = n;
                }
            } else {
                if (min > n) {
                    min = n;
                }
                if (max < m) {
                    max = m;
                }
            }
        }
        mean = (double)(x) / k;
        System.out.println("Nilai minimum : " + min);
        System.out.println("Nilai maximum : " + max);
        System.out.printf("Nilai rata-rata : %.2f\n", mean);
    }
}
