package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10872 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int num = Integer.parseInt(br.readLine());

            System.out.println(factorial(num));

        } catch (Exception e) { e.printStackTrace(); }
    }

    public static int factorial(int num){

        int result = 1;
        for(int i = 1; i <= num; i++) result *= i;
        return result;
    }
}
