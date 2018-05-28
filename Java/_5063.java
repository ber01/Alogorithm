package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _5063 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());

            while(num-- > 0){
                String[] adv = br.readLine().split(" ");
                int r = Integer.parseInt(adv[0]);
                int benefit = Integer.parseInt(adv[1]) - Integer.parseInt(adv[2]);
                if(benefit > r){
                    System.out.println("advertise");
                }
                else if(benefit == r){
                    System.out.println("does not matter");
                }
                else{
                    System.out.println("do not advertise");
                }
            }

        } catch (Exception e) { e.printStackTrace(); }
    }
}
