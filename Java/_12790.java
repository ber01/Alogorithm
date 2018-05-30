package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _12790 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());

            for(int i = 0; i < num; i++){
                String[] ability = br.readLine().trim().split(" ");
                int hp = max(Integer.parseInt(ability[0]) + Integer.parseInt(ability[4]), 1);
                int mp = max(Integer.parseInt(ability[1]) + Integer.parseInt(ability[5]), 1);
                int power = max(Integer.parseInt(ability[2]) + Integer.parseInt(ability[6]), 0);
                int armor = Integer.parseInt(ability[3]) + Integer.parseInt(ability[7]);
                System.out.println(hp + 5 * mp + 2 * power + 2 * armor);
            }

        } catch (Exception e) { e.printStackTrace(); }
    }

    public static int max(int v1, int v2){
        if(v1 > v2) return v1;
        else return v2;
    }
}
