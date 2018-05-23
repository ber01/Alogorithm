package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10886 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            int cute = 0;
            for(int i = 0; i < num; i++){
                int value = Integer.parseInt(br.readLine());
                if(value == 0) cute -= 1;
                else cute += 1;
            }

            System.out.println(cute < 0 ? "Junhee is not cute!":"Junhee is cute!");

        } catch (Exception e) { }
    }
}
