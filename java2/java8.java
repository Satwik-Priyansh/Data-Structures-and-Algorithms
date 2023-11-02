import java.io.*;
public class java8 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
       // BufferedReader br=new BufferedReader(fr);
        int n=10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || (i == j && j > n / 2) || (i + j == n + 1 && j < n / 2+1) )
                    System.out.print("* ");
                    else
                System.out.print("  ");
            }
            System.out.println();
        }

    }
}





