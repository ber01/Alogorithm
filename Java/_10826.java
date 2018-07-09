package Algorithm.BaekJoon;

import java.math.BigInteger;
import java.util.*;

public class _10826 {

    static final int INDEX = 10001;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        BigInteger[] dp = new BigInteger[n+1];

        BigInteger result = BigInteger.ZERO;
        for(int i = 0; i <= n; i++){

            if(i == 0){
                dp[0] = BigInteger.ZERO;
            } else if(i == 1){
                dp[1] = BigInteger.ONE;
            } else{
                dp[i] = dp[i-1].add(dp[i-2]);
            }
        }

        System.out.println(dp[n]);
    }
}
