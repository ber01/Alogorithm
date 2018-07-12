package Algorithm.BaekJoon;

import java.io.*;

public class _9095 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();
        while(t-- > 0){

            int n = Integer.parseInt(br.readLine().trim());

            int[] dp = new int[11];

            dp[0] = 1;
            dp[1] = 1;
            dp[2] = 2;

            for(int i = 3; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }

            sb.append(dp[n] + "\n");
        }

        System.out.print(sb);
    }
}
