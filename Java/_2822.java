package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class _2822 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Map<Integer, Integer> map = new HashMap<>();
            List<Integer> score_list = new ArrayList<>();

            for(int i = 0; i < 8; i++){
                int score = Integer.parseInt(br.readLine().trim());
                map.put(score, i+1);
                score_list.add(score);
            }

            Collections.sort(score_list);

            int sum = 0;
            for(int i = 3; i < 8; i++){
                sum += score_list.get(i);
            }

            List<Integer> num_list = new ArrayList<>();
            for(int i = 3; i < 8; i++){
                num_list.add(map.get(score_list.get(i)));
            }

            Collections.sort(num_list);

            String num_str = "";
            for(int i : num_list){
                num_str += String.valueOf(i) + " ";
            }

            System.out.println(sum);
            System.out.println(num_str);

        } catch (Exception e) { e.printStackTrace(); }
    }
}
