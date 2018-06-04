package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _5596 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int S = result(new StringTokenizer(br.readLine(), " "));
            int T = result(new StringTokenizer(br.readLine(), " "));

            System.out.println((S>=T)?S:T);

        } catch (IOException e) { e.printStackTrace(); }
    }

    public static int result(StringTokenizer st){
        int r = 0;
        while(st.hasMoreTokens()){
            r += Integer.parseInt(st.nextToken());
        }
        return r;
    }
}
