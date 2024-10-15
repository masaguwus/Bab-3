import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        int nilai;
        System.out.println();
        System.out.println("pernyataan continue batas 10");
        for(nilai = 1;nilai<=10;nilai++){
            if(nilai<=5)
                continue;
            else
                System.out.println(nilai);
        }
    }
}
