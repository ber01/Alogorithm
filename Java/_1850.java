package Baekjoon;

import java.io.*;
import java.util.*;

public class _1850 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long a = Long.valueOf(st.nextToken());
        long b = Long.valueOf(st.nextToken());

        long n = gcd(a, b);

        while(n-- > 0) {

            bw.write("1");
        }

        bw.flush();
    }

    private static Long gcd(Long a, Long b){

        if(b == 0){

            return a;
        } else {

            return gcd(b, a%b);
        }
    }
}
