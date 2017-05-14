package hecker_earth;

import java.util.Scanner;

/**
 * Created by ameek on 4/4/17.
 */
public class Factorial {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        System.out.println(factorial(N));
    }

    public static long factorial(long n) {
        if(n <= 1)
            return n;
        else
            return n*factorial(n-1);
    }
}
