package Algorithm.BaekJoon;

import java.util.*;
import java.math.*;

// 다이나믹 프로그래밍
public class _1793 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){

            int n = sc.nextInt();
            BigInteger[] dp = new BigInteger[251];

            dp[0] = BigInteger.ONE;
            dp[1] = BigInteger.ONE;
            dp[2] = BigInteger.valueOf(3);
            for(int i = 3; i <= n; i++){
                dp[i] = dp[i-1].add(dp[i-2].multiply(BigInteger.valueOf(2)));
            }

            System.out.println(dp[n]);
        }

        sc.close();
    }
}
