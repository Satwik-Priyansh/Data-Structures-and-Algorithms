package java2;
import java.util.*;
public class BinarytoDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: " );
        String s = sc.nextLine();
            int m = 0, k = 1;
            for (int i = s.length() - 1; i >= 0; i--) {
                m += (s.charAt(i) - '0') * k;    //implicit type conversion from char to int
                k *= 2;
            }
            System.out.println(m);


        }
    }
