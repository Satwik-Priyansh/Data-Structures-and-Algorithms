
import java.io.*;
import java.util.*;

public class hackerank1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t>0){
            int a=input.nextInt();
            int b=input.nextInt();
            int c=input.nextInt();
            int p=input.nextInt();
            int q=input.nextInt();
            int r=input.nextInt();
             if((a+b>=120000) && (b+c>=120000) && (a+c>=120000)){
                System.out.println(Math.min(p+q,Math.min(q+r,r+p)));
            }
             else if((a+b>=120000) && (b+c>=120000))
                 System.out.println(Math.min(p+q,q+r));
             else if((b+c>=120000) && (a+c>=120000))
                 System.out.println(Math.min(q+r,r+p));
             else if((a+c>=120000) && (a+b>=120000))
                 System.out.println(Math.min(r+p,p+q));
             else if(a+c>=120000)
                System.out.println(p+r);
             else if(a+b>=120000)
                System.out.println(p+q);
             else if(b+c>=120000)
                System.out.println(q+r);


            else
                System.out.println(p+q+r);
            t--;

        }

    }
}