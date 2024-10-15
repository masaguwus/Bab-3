import java.util.Scanner;

public class albina {

    public static void swapRight(long[] array, long i) {
        // Check if the index is valid and there's an element to swap with
        if (i >= 0 && i < array.length - 1) {
            // Swap the element at i with the element to its right
            long temp = array[Math.toIntExact(i)];
            array[Math.toIntExact(i)] = array[Math.toIntExact(i + 1)];
            array[Math.toIntExact(i + 1)] = temp;
        } else {
            System.out.println("Invalid index for swapping.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();
        long[] arr = new long[Math.toIntExact(n)];
        boolean selesai = true;
        for (int i = 0; selesai; i++) {
            n /= (Math.pow(2, i));
            for (long ii = 0; ii < n; ii++) {
                if (arr[1] == 0) {
                    System.out.println(arr[0]);
                    selesai = false;
                    break;
                }
                if (ii % 2 == 1) {
                    arr[Math.toIntExact(ii)] = 0;
                }
            }
            for (long ii = 0; ii < n - 1; ii++) {
                if (arr[i] > arr[i + 1]) {
                    // swapping the index if it's bigger than the right side and move to the next
                    // index after swapping
                    // calling the swapRight method from above
                    swapRight(arr, ii);
                }
            }

        }


    }
}
