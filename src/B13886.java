import java.util.Scanner;

public class B13886 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length-1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int sum1 = arr[0] + arr[3];
        int sum2 = arr[1] + arr[2];

        int result = 0;
        if(sum1 > sum2){
            result = sum1 - sum2;
        } else if (sum2 > sum1) {
            result = sum2 - sum1;
        } else if (sum1 == sum2) {
            result = 0;
        }

        System.out.println(result);

    }
}
