import java.util.Scanner;

public class B20492 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prize = n / 100 * 78;
        int expense = n / 100 * 80; // 경비
        int expensePrize1 = n - expense; // 경비를 뺀 나머지 상금
        int expensePrize2 = expense + (expensePrize1 / 100 * 78); // 경비를 뺀 나머지 상금에서 제세공과금을 낸 상금

        System.out.println(prize+" "+expensePrize2);
    }
}
