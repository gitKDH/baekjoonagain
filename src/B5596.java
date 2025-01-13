import java.util.Scanner;

public class B5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int t = 0;

        int exam = 0;


        for(int i = 0; i < 4; i++){
            exam = sc.nextInt();
            s += exam;
        }
        for(int i = 0; i < 4; i++){
            exam = sc.nextInt();
            t += exam;
        }
        if(s > t){
            System.out.println(s);
        } else if (t > s) {
            System.out.println(t);
        } else if (s == t) {
            System.out.println(s);
        }
    }
}
