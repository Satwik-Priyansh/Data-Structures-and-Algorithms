package HackeRank;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
        String str=sc.nextLine();
        String re="(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
        String pattern = re + "\\." + re+ "\\." + re+ "\\." + re;
        Pattern pt=Pattern.compile(pattern);
        Matcher mt=pt.matcher(str);
        boolean result=mt.matches();
        System.out.println(result);}
    }
}
