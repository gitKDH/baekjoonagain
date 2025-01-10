import java.util.Scanner;

public class B2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if(minute >= 45){
            minute = minute - 45;
        }else if(minute < 45){
            if(hour == 0){
                hour = 23;
            }else {
                hour = hour - 1;
            }
            minute = 60 - (45 - minute);
        }
        System.out.println(hour + " " + minute);
    }
}
