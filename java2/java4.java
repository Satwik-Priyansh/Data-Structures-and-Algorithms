import java.util.*;
public class java4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        //mirrored rhombus
    /*for (int i=1;i<=n;i++){
        for(int j=1;j<=n+i-1;j++){
            if(j<i){
                System.out.print(" ");
            }else
                System.out.print("*");
        }
        System.out.println("");

        }*/
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n-i;j++){
                if(j<=n-i){
                    System.out.print(" ");
                }else
                    System.out.print("*");
            }
            System.out.println("");
        }
    }
}
