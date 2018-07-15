package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _6502 {

    public static void main(String[] args) throws  IOException{

        // r : 식탁의 반지름, w : 피자의 너비, l : 피자의 높이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        while(true){

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int r = Integer.valueOf(st.nextToken());
            if(r == 0) break;
            int w = Integer.valueOf(st.nextToken());
            int l = Integer.valueOf(st.nextToken());

            double value = Math.sqrt(Math.pow(w, 2) + Math.pow(l, 2))/2;

            String result = (r >= value) ? ("Pizza " + cnt + " fits on the table.\n") : ("Pizza " + cnt + " does not fit on the table.\n");
            sb.append(result);

            cnt += 1;
        }

        System.out.print(sb);
    }
}