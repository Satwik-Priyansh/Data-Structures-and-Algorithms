package GFGDSA;

public class Recursion {
    static void fun(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        fun(n - 1);
        System.out.println(n);

    }

    static int fun1(int n) {// this function returns floor of log(n) to the base 2
        if (n == 1)
            return 0;
        else
            return 1 + fun1(n / 2);/* we change it n/3 also by changing the base
                                     condition to (n<3) then it will log3(n)*/
    }

    static void fun2(int n) {//this function prints the binary equivalent for n>0
        if (n == 0)
            return;
        fun2(n / 2);
        System.out.print(n % 2);
    }

    //recursive function to print to all the integers from n to 1
    static void printInt(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printInt(n - 1);
    }

    //recursive function to print to all integers from 1 to n
    static void printInt1(int n) {
        if (n == 0)
            return;
        printInt1(n - 1);
        System.out.print(n + " ");
    }

    //factorial of an integer n>0 using recursion
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    // function to print nth fibonacci term
    static int fibo(int n) {
        if (n <= 1)
            return n;
        else
            return fibo(n - 1) + fibo(n - 2);
    }

    //cool solution for nth fibonacci term
    static long coolFibo(int n) {
        return (long) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }

    //sum of first n natural numbers using recursion
    static int sumOf(int n) {
        if (n == 0)
            return 0;
        else
            return n + sumOf(n - 1);
    }

    //check if a string is palindrome using recursion
    static boolean isPalindrome(String s, int i) {
        if (i > s.length() / 2) {
            return true;
        }

        return s.charAt(i) == s.charAt(s.length() - i - 1) && isPalindrome(s, i + 1);

    }

    //sum of digits of a number using recursion
    static int sumDigits(int n) {
        if (n < 10)
            return n;
        else
            return n % 10 + sumDigits(n / 10);

    }

    //rope cutting problem-cutting a rope into maximum number of segments
    static int cutSegments(int n, int a, int b, int c) {
        if (n == 0)
            return 0;//base case
        if (n < 0)
            return -1;//for invalid result
        int result = Math.max(Math.max(cutSegments(n - a, a, b, c), cutSegments(n - b, a, b, c)), cutSegments(n - c, a, b, c));
        if (result == -1)
            return -1;
        return result + 1;  //final output

    }

    //string subset problems using recursion
    static void powerSet(String str, int index, String curr) {
        int n = str.length();

        // base case
        if (index == n) {
            System.out.println(curr);
            return;
        }
        // Two cases for every character
        // (i) We consider the character
        // as part of current subset
        // (ii) We do not consider current
        // character as part of current
        // subset
        powerSet(str, index + 1, curr + str.charAt(index));
        powerSet(str, index + 1, curr);
    }

    //solution for Tower Of Hanoi
    static void TOH(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println("Move 1 from " + A + " to " + C);
            return;
        }
        TOH(n - 1, A, C, B);
        System.out.println("Move " + n + " from " + A + " to " + C);
        TOH(n - 1, B, A, C);
    }

    //solution to josephus problem
    static int jos(int n, int k) {
        if (n == 0)
            return 0;
        else
            return (jos(n - 1, k) + k) % n;
    }//if index starts from 1 then we use

    static int myJos(int n, int k) {
        return jos(n, k) + 1;
    }

    //solution to array sum subset problem
    static int countSubsets(int[] arr, int n, int sum) {
        if (n == 0)
            return (sum == 0) ? 1 : 0;
        return countSubsets(arr, n - 1, sum) + countSubsets(arr, n - 1, sum - arr[n - 1]);

    }

    //recursive function to print all permutations of a given string
    static String swap(String a, int i, int j) {
        {
            char temp;
            char[] charArray = a.toCharArray();
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
        }
    }

    static void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }


    public static void main(String[] args) {
        /*fun(3);
        System.out.println(fun1(16));
        fun2(5);
        System.out.println();
        printInt(6);
        System.out.println();
        printInt1(6);
        System.out.println();
        System.out.println(factorial(5));
        System.out.println(fibo(5));
        System.out.println(coolFibo(72));
        System.out.println(sumOf(10));
        String str = "abcba";
        System.out.println(isPalindrome(str, 0));
        System.out.println(sumDigits(253));
        System.out.println(cutSegments(9,2,2,2));
        int index = 0;
        String curr = "";
        powerSet(str, index, curr);
        TOH(3,'A','B','C');
        System.out.println(jos(7,3));
        int a[]={10,5,2,3,6};
        int sum=8;
        System.out.println(countSubsets(a,a.length,sum));
        System.out.println();*/
        String str = "ABC";
        permute(str, 0, str.length() - 1);


    }
}
