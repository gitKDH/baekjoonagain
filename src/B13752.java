import java.util.Scanner;

public class B13752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int k = sc.nextInt();
            for(int j = 0; j < k; j++){
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
