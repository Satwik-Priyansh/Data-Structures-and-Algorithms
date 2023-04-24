package GFGDSA;

public class Bitmagic {
    //Look up table method theta(1) complexity
    static int[] table = new int[256];//initialize an array that stores 8 bits of the number

    //checking if the kth bit of a number is set using left shift
    static boolean checkBit(int n, int k) {
        int a = (1 << (k - 1));//key idea is to left shift the number "1" by "k-1" bit so that it only has kth bit set to 1
        return (n & a) != 0;

    }

    //checking if the kth bit of a number is set using right shift
    static boolean checkBit1(int n, int k) {
        //key idea is to shift the original number by "k-1" bit and use "&" with "1"
        return ((n >> (k - 1)) & 1) == 1;
    }

    //count set bits
    static int countsetBits(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 != 0)
                count += 1;
            n /= 2;

        }
        return count;

    }

    //Brian Kerningam's Algorithm
    static int countBits(int n) {
        int count = 0;
        while (n > 0) {
            n = (n & (n - 1));
            count++;
        }
        return count;
    }

    static void initialize() {
        table[0] = 0;
        for (int i = 1; i < 256; i++) {
            table[i] = (i & 1) + table[i / 2];
        }
    }

    static int count(int n) {
        int res = table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        return res;
    }

    //naive solution for checking if a number is power of 2
    static boolean powerOf2(int n) {
        if (n == 0)
            return false;
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n /= 2;

        }
        return true;
    }

    //efficient solution for checking if a number is power of 2
    //idea is that if the number is a power of 2 than it only has 1 set bit
    static boolean powOf2(int n) {
        if (n == 0)
            return false;
        else
            return ((n & (n - 1)) == 0);
    }

    //function to find only odd occurring number in a given array
    static int findOdd(int[] arr, int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = res ^ arr[i];

        }
        return res;
    }

    //variation of the above problem
    static int findMissing(int[] arr, int n) {
        int comp = 1, arrcomp = 1;
        for (int i = 0; i <= n + 1; i++) {
            comp ^= i;
        }
        for (int i = 0; i < n; i++) {
            arrcomp ^= arr[i];
        }
        return (comp ^ arrcomp);
    }

    //efficient solution
    static void oddAppearing(int[] arr, int n) {
        int XOR = 0, res1 = 0, res2 = 0;
        for (int i = 0; i < n; i++) {
            XOR = XOR ^ arr[i];
        }
        int sn = XOR & ~(XOR - 1);//it gives a number with only rightmost bit set to 1
        for (int i = 0; i < n; i++) {
            if ((arr[i] & sn) != 0)
                res1 = res1 ^ arr[i];
            else
                res2 = res2 ^ arr[i];
        }
        System.out.println(res1 + " " + res2);
    }

    //function to print power set from a given set
    static void printpowerSet(String str) {
        int n = str.length();
        int powSize = (int) Math.pow(2, n);
        for (int count = 0; count < powSize; count++) {
            for (int j = 0; j < n; j++) {
                if ((count & (1 << j)) != 0)
                    System.out.print(str.charAt(j));

            }
            System.out.println();

        }

    }


    public static void main(String[] args) {
        int x = 5;
        System.out.println(checkBit(5, 3));
        System.out.println(checkBit1(13, 3));
        System.out.println(countsetBits(63));
        System.out.println(countBits(63));
        initialize();//need to initialize the table first otherwise output will be 0
        System.out.println(count(63));
        System.out.println(powerOf2(4));
        System.out.println(powOf2(256));
        int[] arr = {4, 3,3, 4, 4, 4, 5, 5};
        System.out.println(findOdd(arr, arr.length));
        int[] arr2 = {1, 5, 3, 2};
        System.out.println(findMissing(arr2, arr2.length));
        int[] arr3 = {3, 4, 3, 4, 8, 4, 4, 32, 7, 7};
        oddAppearing(arr3, arr3.length);
        printpowerSet("abc");

    }
}
