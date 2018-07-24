package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _1978 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine().trim());
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){

            int t = Integer.valueOf(st.nextToken());

            int i;
            for(i = 2; i < t; i++){

                if(t%i == 0) break;
            }

            if(t == i) {

                cnt += 1;
            }
        }

        System.out.println(cnt);
    }
}
