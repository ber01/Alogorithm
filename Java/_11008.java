package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _11008 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.valueOf(br.readLine().trim());

        StringBuilder sb = new StringBuilder();
        while(t-- > 0){

            StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");

            String s = st.nextToken();
            String p = st.nextToken();

            s = s.replace(p, " ");

            sb.append(s.length()).append("\n");
        }

        System.out.print(sb);
    }
}
