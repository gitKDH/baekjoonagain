import java.util.Scanner;

public class B2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = 0;
        int max = 0;

        for(int i = 0; i < 4; i++){
            int out = sc.nextInt();
            int in = sc.nextInt();

            people -= out;
            people += in;

            if(people >= max){
                max = people;
            }
        }
        System.out.println(max);
    }
}
