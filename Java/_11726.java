package Algorithm.BaekJoon;

import java.util.*;

// 다이나믹 프로그래밍
public class _11726 {

    // 10007
    public static final int DIV = 10007;

    public static void main(String[] args){

        // dp[n], n => 2*n 크기의 직사각형을 채우는 방법의 수

        Scanner sc = new Scanner(System.in);

        // 1 <= n <= 1000
        int n = sc.nextInt();
        int[] dp = new int[1001];

        // n = 0, 2*0 크기의 직사각형을 채우는 방법 0회
        dp[0] = 0;

        // n=1, 2*1 크기의 직사각형을 채우는 방법 1회
        dp[1] = 1;

        // n=2, 2*2 크기의 직사각형을 채우는 방법 2회
        dp[2] = 2;

        for(int i = 3; i <= n; i++){
            dp[i] = (dp[i-1] + dp[i-2])%DIV;
        }

        System.out.println(dp[n]);
    }
}
