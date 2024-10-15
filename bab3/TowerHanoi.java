import java.util.Scanner;

public class TowerHanoi {

    public static int pointer (int[] arr) {
        // search for the top disk that filled with 0 in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return i - 1;
            }
        }
        return arr.length - 1;
    }

    public static void moveDisks(int n, int start, int end, int[][] arr, long[] count) {
        if (n == 1) {
            moveDisk(start, end, arr);
            System.out.println((start + 1) + " --> " + (end + 1));
            count[0] += 1;
        } else {
            int o = 3 - (start + end);
            moveDisks(n - 1, start, o, arr, count);
            moveDisk(start, end, arr);
            System.out.println((start + 1) + " --> " + (end + 1));
            count[0] += 1;
            moveDisks(n - 1, o, end, arr, count);
        }
    }

    public static void moveDisk(int start, int end, int[][] arr) {
        int topDisk = arr[start][pointer(arr[start])];
        arr[start][pointer(arr[start])] = 0;
        arr[end][pointer(arr[end]) + 1] = topDisk;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long count[] = {0};
        int n = scanner.nextInt();
        int start = scanner.nextInt() - 1;
        int end = scanner.nextInt() - 1;

        int[][] arr = new int[3][n];
        int[] correct = new int[n];
        scanner.close();

        System.out.println();
        System.out.println("config : ");

        for (int i = 0; i < n; i++) {
            arr[0][i] = i + 1;
            correct[i] = i + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Rod" + (i + 1) + " : ");
            for (int ii = 0; ii < arr[i].length; ii++) {
                System.out.print(arr[i][ii] + " ");
            }
            System.out.println();
        }

        moveDisks(n, start, end, arr, count);

        System.out.println("config : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Rod" + (i + 1) + " : ");
            for (int ii = 0; ii < arr[i].length; ii++) {
                System.out.print(arr[i][ii] + " ");
            }
            System.out.println();
        }
        System.out.println();
//        for (int i = 0; arr[2] != correct; i++) {
//            if (n == 1) {
//                arr[end - 1][0] = arr[start - 1][n-1];
//                arr[start - 1][n-1] = 0;
//                System.out.println(start + " --> " + end);
//                count++;
//            } else {
//                n -= 1;
//                o = 6 - (start + end);
//                arr[end - 1][0] = arr[o][n-1];
//                arr[o][n-1] = 0;
//                System.out.println(start + " --> " + o);
//                arr[o][0] = arr[start - 1][n-1];
//                arr[start - 1][n-1] = 0;
//                System.out.println(o + " --> " + start);
//                count++;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int ii = 0; ii < arr[i].length; ii++) {
//                System.out.print(arr[i][ii] + " ");
//            }
//            System.out.println();
//        }
        System.out.print("Total moves : " + count[0]);
    }
}
