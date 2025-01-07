import java.util.Scanner;

public class B10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int SecondLargest;
        if((A >= B && C >= A) || (A >= C && B >= A)){
            SecondLargest = A;
        } else if ((B >= A && C >= B) || (A >= B && B >= C)) {
            SecondLargest = B;
        }else
            SecondLargest = C;
        System.out.println(SecondLargest);
    }
}
