package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _2153 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> map = new HashMap<>();

        int value = 1;
        for(char i = 'a'; i <= 'z'; i++){
            map.put(i, value++);
        }

        for(char i = 'A'; i <= 'Z'; i++){
            map.put(i, value++);
        }

        String str = br.readLine();

        int result = 0;
        for(char c : str.toCharArray()){

            if(map.containsKey(c)){

                result += map.get(c);
            }
        }

        if(result <= 2){

            System.out.println("It is a prime word.");
        } else {

            boolean tf = true;
            double sqrtNum = Math.sqrt(result);
            for(int i = 2; i <= sqrtNum; i++){

                if(result%i == 0){

                    tf = false;
                    break;
                }
            }

            System.out.println(tf ? "It is a prime word." : "It is not a prime word.");
        }
    }
}
