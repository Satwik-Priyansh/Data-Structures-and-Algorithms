package GFGDSA;

import java.util.Arrays;
import java.util.Scanner;

public class maths {
    static double customLog(double base, double logNumber) {
        return Math.log(logNumber) / Math.log(base);
    }
    //count trailing number of zeroes in n factorial

    static int count_5(int n) {
        int count = 0;
        for (int i = 5; i <= n; i *= 5) {
            count = count + n / i;

        }
        return count;
    }

    //gcd calculation using my approach
    static int gcd(int x, int y) {
        for (int i = Math.max(x, y); i >= 1; i--) {
            if ((x % i == 0) && (y % i == 0))
                return i;

        }
        return 1;

    }

    //gcd calculation using efficient approach
    static int gcd1(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd1(b, a % b);
    }

    //lcm calculation using my approach
    static int lcm(int p, int q) {
        for (int i = p; i <= p * q; i += p) {
            if (i % q == 0)
                return i;

        }
        return p * q;
    }

    //lcm calculation using efficient approach
    static int lcm1(int s, int t) {
        return (s * t) / gcd1(s, t);
    }

    //to check if the given number is prime
    static boolean isPrime(int x) {
        if (x == 1)
            return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    //print prime factors naive solution
    static void primeFactors(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                int x = i;
                while (n % x == 0) {
                    System.out.print(i + " ");
                    x *= i;
                }
            }

        }
    }
    //efficient implementation for printing prime factors of a number
    static void printPrimefactors(int n){
        if(n<=1)return;
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                System.out.println(i);
                n/=i;
            }
        }if(n>1) System.out.println(n);

    }
    //print all divisors of a given number
    static void printDivisors(int n){
        if(isPrime(n)){
            System.out.print(1+" "+n);
        }else
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    System.out.print(i+" ");
            }
    }
    //efficient solution for printing divisors
    static void printDivisors1(int n){
        int i;
        for(i=1;i*i<=n;i++) {
            if (n % i == 0)
                System.out.println(i);
        }
        for(;i>=1;i--){
            if(n%i==0)
                System.out.println(n/i);
        }

    }
    //sieve of eratosthenes algorithm for printing prime numbers upto n
    static void sieveOfEratosthenes(int n){
        boolean[] prime= new boolean[n];
        Arrays.fill(prime,0,n,true);
        int p=2;
        while(p*p<=n){
            if(prime[p])
                for(int i=p*p;i<n;i+=p){
                    prime[i]=false;
                }p++;
        }for(int i=2;i<n;i++){
            if(prime[i])
                System.out.println(i);
        }
    }
    //to compute power of a number
    static int power(int x,int y){
        if(y==0)
            return 1;
        else
            return x*power(x,y-1);
    }
    //efficient soulution to compute power
    static int power1(int x,int y){
        if(y==0)
            return 1;
        int temp=power(x,y/2);
        temp=temp*temp;
        if(y%2==0){
            return temp;
        }else
            return temp*x;
    }
    //Binary exponentiation method
    static int binaryExp(int x , int n){
        int res=1;
        while(n>0){
            if(n%2!=0)
                res = res * x;
                x *= x;
                n /= 2;

        }return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /*  System.out.println(gcd(4, 6));
        System.out.println(gcd1(270, 192));
        System.out.println(lcm1(4, 6));
        System.out.println(lcm1(2, 8));
        System.out.println(lcm1(12, 15));
        System.out.println(lcm1(7, 3));
        System.out.println(isPrime(297));
        System.out.println(isPrime(3));
        //primeFactors(12);
        printPrimefactors(12);
        printDivisors(100);
        printDivisors1(25);*/
        sieveOfEratosthenes(50);
        System.out.println(power1(3,4));
        System.out.println(power1(5,0));
        System.out.println(binaryExp(2,3));


    }
}
