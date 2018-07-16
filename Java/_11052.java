package Algorithm.BaekJoon;

import java.util.*;

public class _11052 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] fish = new int[n+1];

        for(int i = 1; i <= n; i++){

            fish[i] = sc.nextInt();
        }

        int[] dp = new int[n+1];
        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= i; j++){

                if(dp[i] >= dp[i-j] + fish[j]) continue;

                else {

                    dp[i] = dp[i-j] + fish[j];
                }
            }
        }

        System.out.println(dp[n]);
    }
}