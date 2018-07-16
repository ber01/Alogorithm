package Algorithm.BaekJoon;

import java.io.*;

public class _10844 {

    static int MOD = 1000000000;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine().trim());

        int[][] dp = new int[101][10];

        // dp[n][i] = n : 자리 계단수, i : 마지막 수
        // 기본 : dp[n][i] = dp[n-1][i-1] + dp[n-1][i+1]
        // 예외 : dp[n][0] = dp[n-1][1], dp[n][9] = dp[n-1][8]

        // 자리수가 1개인 계단수는 마지막 자리수 1~9 까지 1개
        for(int i = 1; i <= 9; i++){

            dp[1][i] = 1;
        }

        for(int i = 2; i <= n; i++){

            for(int j = 0; j <= 9; j++){

                if(j == 0){

                    // 예외 1번 i자리 계단수를 만들 때 마지막 수가 0인 경우, i-1번째 계단수를 만드는 방법 + 마지막 자리수에 1이 오는 경우
                    dp[i][0] = (dp[i-1][1]) % MOD;
                    System.out.println("dp[" + i + "][" + j + "] : " + "dp[" + (i-1) + "][1]");
                } else if(j == 9){

                    // 예외 2번 i자리 계단수를 만들 때 마지막 수가 9인 경우, i-1번째 계단수를 만드는 방법 + 마지막 자리수에 8이 오는 경우
                    dp[i][9] = (dp[i-1][8]) % MOD;
                    System.out.println("dp[" + i + "][" + j + "] : " + "dp[" + (i-1) + "][8]");
                } else{

                    // 그 외, i자리 계단수를 만드는 방법 : i-1자리 계단수를 만드는 방법 + 마지막 자리수에 j-1이 오는 경우 + i-1자리 계단수를 만드는 방법 + 마지막 자리수에 j+1이 오는 경우
                    dp[i][j] = (dp[i-1][j+1] + dp[i-1][j-1]) % MOD;
                    System.out.println("dp[" + i + "][" + j + "] : " + "dp[" + (i-1) + "][" + (j+1) + "]" + " + dp[" + (i-1) + "][" + (j-1) + "]");
                }

            }

            System.out.println();
        }

        int result = 0;

        // n자리 계단수에 마지막 수가 0~9까지 오는 경우를 모두 더함 → n 자리 계단수의 총 개수
        for(int i = 0; i <= 9; i++){

            result += dp[n][i];
            result %= MOD;
        }

        System.out.println(result);
    }
}
