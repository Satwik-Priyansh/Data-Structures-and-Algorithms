import java.util.*;
public class java1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int q= input.nextInt();
        do{int result=0;
            int a= input.nextInt();
            int b= input.nextInt();
            int n= input.nextInt();
            double term=a; //so that a term does not get added every time the loop runs
            for(int i=0;i<n;i++){
                term+=(Math.pow(2,i))*b;

                System.out.printf( "%d ",(int)term);

            }System.out.print("\n");
            q--;
        }while(q>0);

    }




}
