package Baekjoon;

import java.io.*;

public class _1834 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long result = 0;
        long n = Long.valueOf(br.readLine().trim());

        for(long i = 1; i < n; i++){

            result += (n+1) * i;
        }

        System.out.println(result);
    }
}
