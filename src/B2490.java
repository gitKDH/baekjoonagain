import java.util.Scanner;

public class B2490 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            int f = 0;
            int b = 0;
            String result = "";
            for (int j = 0; j < 4; j++) {
                int roll = sc.nextInt();
                if (roll == 0) {
                    f += 1;
                } else if (roll == 1) {
                    b += 1;
                }
            }
            if(f == 1 && b == 3){
                result = "A";
            } else if (f == 2 && b == 2) {
                result = "B";
            } else if (f == 3 && b == 1) {
                result = "C";
            } else if (f == 4) {
                result = "D";
            } else if (b == 4) {
                result = "E";
            }
            System.out.println(result);
        }
    }
}
