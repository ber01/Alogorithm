package Algorithm.BaekJoon;

import java.io.*;

public class _11057 {

    static final int MOD = 10007;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine());

        long[][] dp = new long[n+1][10];

        // 오르막수가 1이고 마지막 수가 0~9인 오르막수의 개수 : 1개
        for(int i = 0; i <= 9; i++){

            dp[1][i] = 1;
        }

        for(int i = 2; i <= n; i++){

            for(int j = 0; j <= 9; j++){

                // System.out.print("dp[" + i +"][" + j + "] : ");
                for(int k = 0; k <= j; k++){

                    // System.out.print("dp[" + (i-1) + "][" + k + "] + ");
                    dp[i][j] = (dp[i][j] + dp[i-1][k]) % MOD;
                }

                // System.out.println();
            }

            // System.out.println();
        }

        long result = 0;

        for(int i = 0; i <= 9; i++){

            // System.out.println("result : " + result + ", dp[" + n + "][" + i + "] : " + dp[n][i] );
            result += dp[n][i];
            result %= MOD;
        }

        System.out.println(result);
    }
}
