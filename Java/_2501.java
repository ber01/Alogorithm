package Baekjoon;

import java.util.*;
import java.io.*;

public class _2501 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int n = Integer.valueOf(st.nextToken());
        int k = Integer.valueOf(st.nextToken());

        List<Integer> divisor = new ArrayList<>();

        for(int i = 1; i <= n; i++){

            if(n%i == 0){
                divisor.add(i);
            }
        }

        System.out.println(k > divisor.size()? 0 : divisor.get(k-1));
    }
}
