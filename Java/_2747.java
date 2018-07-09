package Algorithm.BaekJoon;

import java.util.*;

// DP
public class _2747 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(fibo(n));

        sc.close();
    }

    static int fibo(int n){

        // f0 = 0, f1 = 1
        if(n <= 1){
            return n;
        } else{ // n >= 2
            return fibo(n-1) + fibo(n-2);
        }
    }
}
