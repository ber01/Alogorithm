package Algorithm.BaekJoon;

import java.util.*;

// 다이나믹 프로그래밍
public class _1463 {

    public static void main(String[] args){

        // dp[n], n => n을 1로 만드는데 필요한 연산의 최솟값
        /*
        1. n을 3으로 나누어 떨어지면 3으로 나눈다. => n을 3으로 나눈 후 1로 만드는 연산의 최솟값 => d[n/3]+1(n => n/3)
        2. n을 2로 나누어 떨어지면 2로 나눈다. => n을 2로 나눈 후 1로 만드는 연산의 최솟값 => d[n/2]+1(n => n/2)
        3. n에서 1을 빼는 경우 => n에서 1을 뺀 후 1로 만드는 연산의 최솟값 => d[n-1]+1(n => n-1)
         */

        // bottom-up 방식
        Scanner sc = new Scanner(System.in);

        // 1 <= n <= 10^6
        int n = sc.nextInt();

        int[] dp = new int[n+1];

        // dp[1], 1을 1로 만드는데 필요한 연산의 최소값
        dp[1] = 0;

        // dp[2] ~ dp[n],
        for(int i = 2; i <= n; i++){

            dp[i] = dp[i-1] + 1;

            if(i%3 == 0){
                dp[i] = Math.min(dp[i], dp[i/3]+1);
            }

            if(i%2 == 0){
                dp[i] = Math.min(dp[i], dp[i/2]+1);
            }
        }

        System.out.println(dp[n]);
        sc.close();
    }
}