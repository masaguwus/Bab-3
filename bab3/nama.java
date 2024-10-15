import java.util.Scanner;

@SuppressWarnings("ResultOfMethodCallIgnored")
public class nama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = 5, w = 10;
        String n = scanner.nextLine();
        scanner.close();
        n = n.toUpperCase();
        System.out.println("==============================================\n");
        for (int i = 0; i < n.length(); i++) {
            switch (n.charAt(i)) {
                case 'A':
                    for (int ii = 0; ii < h; ii++) {
                       for (int iii = 0; iii < w; iii++) {
                           if (iii == w / 2 - ii - 1|| iii == w / 2 + ii - 1) {
                               System.out.print("A");
                           } else if (!(ii == 3 && iii > w / 2 - ii - 1 && iii < w / 2 + ii - 1)) {
                               System.out.print(" ");
                           } else if (iii % 2 == 1){
                               System.out.print("A");
                           } else {
                               System.out.print(" ");
                           }
                       }
                        System.out.println();
                    }
                    break;
                case 'H':
                    for (int ii = 0; ii < h; ii++) {
                        for (int iii = 0; iii < w; iii++) {
                            if (iii == 0 || iii == w - 2 || (ii == 2 && iii % 2 == 0)) {
                                System.out.print("H");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 'S':
                    for (int ii = 0; ii < h; ii++) {
                        for (int iii = 0; iii < w; iii++) {
                            if (ii % 2 == 0 && iii % 2 == 0) {
                                if ((ii == 0 && iii == 0) || (ii == 2 && iii == w - 2) || (ii == 2 && iii == 0) || (ii == h - 1 && iii == w - 2)) {
                                    System.out.print(" ");
                                } else {
                                    System.out.print("S");
                                }
                            } else if (ii % 2 == 1 && (iii == Math.pow(2, ii) - 1)) {
                                System.out.print("S");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 'N':
                    for (int ii = 0; ii < h; ii++) {
                        for (int iii = 0; iii < w; iii++) {
                            if (iii == 0 || iii == w - 2) {
                                System.out.print("N");
                            } else if (iii == ii * 2) {
                                System.out.print("N");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }
            System.out.println();
        }
    }
}