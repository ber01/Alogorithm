package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10824 {

    public static void main(String[] args){

        try {

            // A, B, C, D 는 100만 이하 Long
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] line = br.readLine().split(" ");

            String num1 = line[0] + line[1];
            String num2 = line[2] + line[3];

            // System.out.println(num1 + " " + num2);

            long result = Long.parseLong(num1) + Long.parseLong(num2);

            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
