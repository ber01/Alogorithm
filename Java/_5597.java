package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _5597 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            List<Integer> list = new ArrayList<>();

            for(int i = 1; i <= 30; i++){
                list.add(i);
            }

            for(int i = 0; i < 28; i++){
                list.remove(list.indexOf(Integer.parseInt(br.readLine().trim())));
            }

            Collections.sort(list);
            for(int i : list){
                System.out.println(i);
            }

        } catch (Exception e) { e.printStackTrace(); }
    }
}
