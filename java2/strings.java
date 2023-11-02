import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int orignal_num= sc.nextInt();
        int reverse_num=0;
        int num=orignal_num;
        while(num!=0){
            int digit=num%10;
            reverse_num=reverse_num*10+digit;
            num=num/10;

        }if(reverse_num==orignal_num)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");*/
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));
        for (int i = 100; i < 10000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i+" ");
            }
        }


    }

    static boolean isArmstrong(int n) {
        int no_digit=(int)Math.log10(n)+1;
        int digit;
        int sum = 0;
        int num = n;
        while (num != 0) {
            digit = num % 10;
            sum = sum + (int) Math.pow(digit, no_digit);
            num /= 10;


        }
        return sum == n;


    }
}
