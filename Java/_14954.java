package Algorithm.BaekJoon;

import java.io.*;
import java.util.HashSet;

public class _14954 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine().trim());

        System.out.print(isHappy(n));
    }

    private static String isHappy(int n){

        boolean ish = true;
        String s = String.valueOf(n);

        HashSet<Integer> set = new HashSet<>();

        while(true){

            int temp = 0;

            for(int i = 0; i < s.length(); i++){

                temp += (Integer.valueOf(s.charAt(i) - '0') * Integer.valueOf(s.charAt(i) - '0'));
            }

            if(temp == 1){
                ish = true; break;
            } else if(set.contains(temp)){
                ish = false; break;
            }

            set.add(temp);

            s = String.valueOf(temp);
        }

        return ish? "HAPPY" : "UNHAPPY";
    }
}
