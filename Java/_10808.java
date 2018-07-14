package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _10808 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().trim().toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();

        int index = 0;
        for(char i = 'a'; i <= 'z'; i++){

            map.put(i, index++);
        }

        int[] alphabet = new int[26];

        for(int i = 0; i < s.length(); i++){

            index = map.get(s.charAt(i));
            if(alphabet[index] == 0){
                alphabet[index] = 1;
            } else{
                alphabet[index] += 1;
            }
        }

        for(int i : alphabet){

            System.out.print(i + " ");
        }
    }
}
