package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _5543 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            List<Integer> buger = new ArrayList<>();
            List<Integer> drink = new ArrayList<>();

            for(int i = 0; i < 5; i++){
                if(i < 3) buger.add(Integer.parseInt(br.readLine().trim()));
                else drink.add(Integer.parseInt(br.readLine().trim()));
            }

            Collections.sort(buger);
            Collections.sort(drink);

            System.out.println(buger.get(0) + drink.get(0) - 50);

        } catch (Exception e) { e.printStackTrace(); }
    }
}
