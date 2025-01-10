import java.util.Scanner;

public class B14654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int people = sc.nextInt();

        for(int i = 0; i < n; i++){
            int in = sc.nextInt();
            int out = sc.nextInt();

            people += in;
            people -= out;
        }
        System.out.println("비와이");
    }
}
