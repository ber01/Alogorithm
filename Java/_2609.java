package Baekjoon;

import java.io.*;
import java.util.*;

public class _2609 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
        StringBuilder sb = new StringBuilder();

        int a = Integer.valueOf(st.nextToken());
        int b = Integer.valueOf(st.nextToken());

        int g = gcd(a, b);
        sb.append(g + "\n");
        sb.append(lcm(g, a, b) + "\n");

        System.out.print(sb);
    }

    private static int gcd(int a, int b){

        if(b == 0){

            return a;
        } else{

            return gcd(b, a%b);
        }
    }

    private static int lcm(int g, int a, int b){

        return (a*b)/g;
    }
}
