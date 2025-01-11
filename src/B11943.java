import java.util.Scanner;

public class B11943 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int e = a + d;
        int f = b + c;

        if(e > f){
            System.out.println(f);
        }else if(e < f){
            System.out.println(e);
        }else if(e == f){
            System.out.println(e);
        }
    }
}
