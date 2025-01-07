import java.util.Scanner;

public class B2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int hundreds = B / 100;
        int tens = (B / 10) % 10;
        int ones = B % 10;
        System.out.println(A * ones);
        System.out.println(A * tens);
        System.out.println(A * hundreds);
        System.out.println(A * B);
    }
}
