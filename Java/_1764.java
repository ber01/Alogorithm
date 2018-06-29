package Baekjoon;

import java.util.*;
import java.io.*;

public class _1764 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");

        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        Map<String, String> map = new HashMap<>();

        for(int i = 0; i < N; i++){
            String name = br.readLine();
            map.put(name, "듣");
        }

        List<String> result = new ArrayList<>();

        for(int i = 0; i < M; i++){
            String name = br.readLine();
            if(map.containsKey(name)){
                result.add(name);
            }
        }

        Collections.sort(result);

        System.out.println(result.size());
        for(String i : result){
            System.out.println(i);
        }
    }
}
