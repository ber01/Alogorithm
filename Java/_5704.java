package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _5704 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String temp = "abcdefghijklmnopqrstuvwxyz";

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < temp.length(); i++){

            map.put(temp.charAt(i), 1);
        }

        while(true){

            String str = br.readLine().trim();

            if(str.equals("*")) break;

            Set<Character> set = new HashSet<>();

            for(int i = 0; i < str.length(); i++){

                set.add(str.charAt(i));
            }

            Iterator<Character> it = set.iterator();

            int result = 0;

            while(it.hasNext()){

                if(map.containsKey(it.next())){

                    result += 1;
                }
            }

            if(result == 26){

                System.out.println("Y");
            } else{

                System.out.println("N");
            }
        }
    }
}

