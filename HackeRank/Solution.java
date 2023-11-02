package HackeRank;
import java.sql.Struct;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] tokens = str.split("[^a-zA-Z]");
        int numTokens = 0;

        for (int i=0; i<tokens.length; ++i)
            if (tokens[i].length() > 0)
                numTokens++;

        System.out.println(numTokens);

        for (int i=0; i<tokens.length;++i)
            if (tokens[i].length() > 0)
                System.out.println(tokens[i]);
        

    }
}
