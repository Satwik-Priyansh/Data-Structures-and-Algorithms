import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        A=A.toLowerCase(Locale.ROOT);
        B=B.toLowerCase(Locale.ROOT);
        char[] chx = A.toCharArray();
        Arrays.sort(chx);
        char[] chy = B.toCharArray();
        Arrays.sort(chy);
        if (A.length() == B.length()) {
            if (Arrays.equals(chx, chy))
                System.out.println("Anagrams");
            else
                System.out.println("Not Anagrams");
        }else
            System.out.println("Not Anagrams");}
    }


