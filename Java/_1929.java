package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _1929 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int m = Integer.valueOf(st.nextToken());
        int n = Integer.valueOf(st.nextToken());

        int cnt = 0;
        for(int i = m; i <= n; i++){

            if(i == 1) continue;

            int j;
            boolean tf = true;
            for(j = 2; j <= Math.sqrt(i); j++){

                if(i%j == 0){

                    tf = false;
                    break;
                }
            }

            if(tf){

                sb.append(i + "\n");
            }
        }

        System.out.print(sb);
    }
}
