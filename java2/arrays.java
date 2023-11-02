import java.util.Scanner;
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();//test cases input
        while (T > 0) {
            int N = sc.nextInt();//number of elements input
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();//elements input
            }
            for (int i = 0; i < N / 2; i++) {//loop should run half times as each iteration swaps 2 elements
                int temp = arr[i];//code to swap for two elements
                arr[i] = arr[(N-1) - i];
                arr[(N-1) - i] = temp;
            }for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");//printing the modified array
            }

            T--;
        }



    }
}

