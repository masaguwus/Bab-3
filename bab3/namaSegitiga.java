import java.util.Scanner;

class bentukSegitiga {
    public static void bentukan (String a) {
        int k = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int x = a.length() / 2 - i; x > 0; x--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1 + (i * 2); j++) {
                if (j % 2 == 0 && k < a.length()) {
                    System.out.print(a.charAt(k));
                    k++;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
//            int padding = p/2 - ((i * 2) + 1);
//            for (int j = 0; j < a.length(); j++) {
//                if (j < padding) {
//                    System.out.print(" ");
//                } else if (j >= padding && j % 2 == 0 && k < a.length() && j < (p/2 + (i * 2) + 1)) {
//                    System.out.print(a.charAt(k));
//                    k++;
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
        }
    }
}

public class namaSegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bentukSegitiga obj = new bentukSegitiga();
        String n = scanner.nextLine();
        scanner.close();
        bentukSegitiga.bentukan(n);
    }
}
