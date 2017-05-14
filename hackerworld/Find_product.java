package hecker_earth;

import java.util.Scanner;

/**
 * Created by ameek on 4/3/17.
 * https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-product/
 */
public class Find_product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long A[] = new long[N];
        int i = 0;
        while(i < N ){
            A[i] = in.nextLong();
//            System.out.println(A[i]);
            i++;
        }
        System.out.println(product(A));
    }

    public static long product(long[] a) {
        long answer = 1;
        int mouldo = (int)Math.pow(10,9) + 7;
        for (int i = 0; i < a.length;i++){
            answer = (answer * a[i]) % mouldo;
        }
        return answer;
    }
}
