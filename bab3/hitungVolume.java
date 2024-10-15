import java.util.Scanner;

public class hitungVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean kondisi = true;
        System.out.println("=========================================================================");
        System.out.println("MENU");
        do {
            System.out.println("=========================================================================");
            System.out.println("PILIH SALAH SATU NOMOR DIANTARA NOMOR DIBAWAH INI!\n");
            System.out.println("0. KELUAR");
            System.out.println("""
                    1. HITUNG VOLUME BALOK
                    2. HITUNG VOLUME BOLA
                    3. HITUNG VOLUME KERUCUT
                    4. HITUNG VOLUME SILINDER
                    5. HITUNG VOLUME LIMAS SEGITIGA
                    """);
            System.out.print("Pilihan anda : ");
            int n = scanner.nextByte();
            switch (n) {
                case 0:
                    kondisi = false;
                    System.out.println("=========================================================================");
                    System.out.println("Terimakasih telah menggunakan program ini");
                    break;
                case 1: {
                    System.out.print("Masukkan p (cm): ");
                    int p = scanner.nextInt();
                    System.out.print("Masukkan l (cm): ");
                    int l = scanner.nextInt();
                    System.out.print("Masukkan t (cm): ");
                    int t = scanner.nextInt();
                    int hasil = p * l * t;
                    System.out.println("HASIL: " + hasil + " cm³");
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.print("Masukkan jari-jari (cm): ");
                    double r = scanner.nextDouble();
                    double hasil = (double) 4 / 3 * 22 / 7 * r * r * r;
                    System.out.println("HASIL: " + hasil + " cm³");
                    System.out.println();
                    break;
                }
                case 3: {
                    System.out.print("Masukkan jari-jari (cm): ");
                    double r = scanner.nextDouble();
                    System.out.print("Masukkan tinggi (cm): ");
                    double t = scanner.nextDouble();
                    double hasil = (double) 1 / 3 * 22 / 7 * r * r * t;
                    System.out.println("HASIL: " + hasil + " cm³");
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.print("Masukkan jari-jari (cm): ");
                    double r = scanner.nextDouble();
                    System.out.print("Masukkan tinggi (cm): ");
                    double t = scanner.nextDouble();
                    double hasil = (double) 22 / 7 * r * r * t;
                    System.out.println("HASIL: " + hasil + " cm³");
                    System.out.println();
                    break;
                }
                case 5: {
                    System.out.print("Masukkan tinggi (cm): ");
                    double t = scanner.nextDouble();
                    System.out.print("Masukkan alas (cm): ");
                    double a = scanner.nextDouble();
                    double luasA = 0.5 * a * t;
                    double hasil = 0.5 * luasA * t;
                    System.out.println("HASIL: " + hasil + " cm³");
                    System.out.println();
                    break;
                }
                default:
                    System.out.println("Masukkan nilai yang tidak valid");
            }
        } while (kondisi);
    }
}
