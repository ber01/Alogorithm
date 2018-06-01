package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _5532 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            List<Integer> list = new ArrayList<>(5);
            for(int i = 0; i < 5; i++) list.add(i, Integer.parseInt(br.readLine()));
            int temp1 = chocie(list.get(1), list.get(3));
            int temp2 = chocie(list.get(2), list.get(4));

            if(temp1 > temp2) System.out.println(list.get(0) - temp1);
            else System.out.println(list.get(0) - temp2);

            br.close();
        } catch (Exception e) { e.printStackTrace(); }
    }

    public static int chocie(int a, int b){

        if(a%b != 0){
            return a/b+1;
        }
        else return a/b;
    }
}
