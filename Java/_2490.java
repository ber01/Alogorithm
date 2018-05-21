package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _2490 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            for(int i = 0; i < 3; i++){

                List<String> zero = new ArrayList<String>();
                List<String> one = new ArrayList<String>();

                for(String temp : br.readLine().split(" ")){
                    if(temp.equals("0")) zero.add(temp);
                    else if(temp.equals("1")) one.add(temp);
                }
                System.out.println(isResult(zero.size()));
            }

        } catch (Exception e) { e.printStackTrace(); }
    }

    public static String isResult(int num){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(0, "E");
        return map.get(num);
    }
}