package Baekjoon;

import java.util.*;
import java.io.*;

public class _2750 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<Integer>();

        while(N-- > 0){
            list.add(Integer.parseInt(br.readLine().trim()));
        }

        Collections.sort(list);

        for(int i : list){
            System.out.println(i);
        }
    }
}
