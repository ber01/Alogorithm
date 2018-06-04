package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _1159 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            List<Character> player = new ArrayList<>();
            Set<Character> setP = new HashSet<>();

            int N = Integer.parseInt(br.readLine());

            while(N-- > 0){
                player.add(br.readLine().trim().charAt(0));
            }

            for(Character i : player){
                setP.add(i);
            }

            String result = "";
            for(Character i : setP){
                if(cntWord(player, i) >= 5){
                    result += i;
                }
            }

            if(result != ""){
                System.out.println(result);
            }

            else System.out.println("PREDAJA");


        } catch (Exception e) { e.printStackTrace(); }
    }

    public static int cntWord(List<Character> list, char c){
        int cnt = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == c) cnt += 1;
        }

        return cnt;
    }
}
