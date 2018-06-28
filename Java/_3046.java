package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3046 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int R1 = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());

            System.out.println(2*S-R1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
