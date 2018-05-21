package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10797 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String num = br.readLine().trim();
            String[] car = br.readLine().split(" ");

            System.out.println(cntViolate(num, car));

        } catch (Exception e) { e.printStackTrace(); }
    }

    public static int cntViolate(String num, String[] car){
        int cnt = 0;
        for(String i : car) if(i.equals(num)) cnt += 1;
        return cnt;
    }
}
