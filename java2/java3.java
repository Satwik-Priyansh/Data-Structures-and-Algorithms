import java.util.*;

public class java3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        /*
         * int n=scn.nextInt();
         * for(int i=1;i<=n;i++){
         * for(int j=1;j<=n;j++){
         * if(j==n+1-i){
         * System.out.println("*");
         * }else
         * System.out.print("\t");
         * }System.out.println("");
         * }
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || j == 1 || i == 5 || j == 5 || i == j) {
                    System.out.print("*");

                } else
                    System.out.print(" ");
            }
            System.out.println("");
        }

    }
}