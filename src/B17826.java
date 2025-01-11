import java.util.Scanner;

public class B17826 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int my = sc.nextInt();
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(my == arr[i]){
                count = i+1;
            }
        }
        switch (count) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("A+");
                break;
            case 6: case 7: case 8: case 9: case 10:
            case 11: case 12: case 13: case 14: case 15:
                System.out.println("A0");
                break;
            case 16: case 17: case 18: case 19: case 20:
            case 21: case 22: case 23: case 24: case 25:
            case 26: case 27: case 28: case 29: case 30:
                System.out.println("B+");
                break;
            case 31: case 32: case 33: case 34: case 35:
                System.out.println("B0");
                break;
            case 36: case 37: case 38: case 39: case 40:
            case 41: case 42: case 43: case 44: case 45:
                System.out.println("C+");
                break;
            case 46: case 47: case 48:
                System.out.println("C0");
                break;
            case 49: case 50:
                System.out.println("F");
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
