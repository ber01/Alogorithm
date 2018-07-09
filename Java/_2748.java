package Algorithm.BaekJoon;

import java.util.*;

public class _2748 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println(fibo(sc.nextInt()));

        sc.close();
    }

    public static long[] dp = new long[91];
    private static long fibo(int n){

        if(n <= 1){
            return n;
        } else{

            if(dp[n] > 0){
                return dp[n];
            }

            dp[n] = fibo(n-1) + fibo(n-2);
            return dp[n];
        }
    }
}
