package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _5554 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int N = 4;
            int time = 0;

            while(N-- > 0){

                time += Integer.parseInt(br.readLine());
            }

            sb.append(time/60).append("\n").append(time%60);

            System.out.println(sb);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
