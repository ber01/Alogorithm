package Algorithm.BaekJoon;

import java.io.*;

public class _1032 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine().trim());
        String[] dir = new String[n];

        for(int i = 0; i < n; i++){

            dir[i] = br.readLine().trim();
        }

        StringBuilder sb = new StringBuilder(dir[0]);
        for(int i = 0; i < dir[0].length(); i++){

            char temp = dir[0].charAt(i);
            for(int j = 1; j < dir.length; j++){

                if(!(temp == dir[j].charAt(i))){
                    sb.setCharAt(i, '?');
                }
            }
        }

        System.out.println(sb);
    }
}
