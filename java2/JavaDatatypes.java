import java.util.Scanner;

public class JavaDatatypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        String str;
        while (sc.hasNextLine()) {
            System.out.println(n + " " +sc.nextLine());
            n = n + 1;


        }sc.close();
    }
}