package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _5585 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int change = 1000 - Integer.parseInt(br.readLine().trim());
            int[] money = {500, 100, 50, 10, 5, 1};
            int cnt = 0;

            for(int i : money){
                cnt += change/i;
                change %= i;
            }

            System.out.println(cnt);
        } catch (Exception e) { e.printStackTrace(); }
    }
}
