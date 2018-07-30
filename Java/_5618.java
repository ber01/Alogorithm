package Baekjoon;

import java.io.*;
import java.util.*;

public class _5618 {

    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");

        int[] arr = new int[n];

        int index = 0;
        while(st.hasMoreTokens()){

            arr[index++] = Integer.valueOf(st.nextToken());
        }

        if(n == 2){

            gcd(arr[0], arr[1]);
        } else {

            gcd(arr[0], arr[1], arr[2]);
        }
    }

    private static void gcd(int n, int m){

        int min = 0;
        if(n > m){

            min = m;
        } else{

            min = n;
        }

        for(int i = 1; i <= min; i++){

            if(n%i == 0 && m%i == 0){

                sb.append(i + "\n");
            }
        }

        System.out.print(sb);
    }

    private static void gcd(int n, int m, int k){

        int min = 0;
        if(n > m && n > k){

            min = n;
        } else if (m > n && m > k){

            min = m;
        } else {

            min = k;
        }

        for(int i = 1; i <= min; i++){

            if(n%i == 0 && m%i == 0 && k%i == 0){

                sb.append(i + "\n");
            }
        }

        System.out.print(sb);
    }
}
