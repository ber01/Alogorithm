package Algorithm.BaekJoon;

import java.util.*;
import java.io.*;

public class _1065 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        int cnt = 0;

        if(n >= 100){

            for(int i = 100; i <= n; i++){

                String str = String.valueOf(i);

                int[] as = new int[str.length()];

                for(int j = 0; j < str.length(); j++){

                    as[j] = Character.getNumericValue(str.charAt(j));
                }

                HashSet<Integer> set = new HashSet<>();
                for(int j = 0; j < as.length-1; j++){

                    set.add(as[j] - as[j+1]);
                    if(set.size() > 1){
                        break;
                    }
                }

                if(set.size() == 1){
                    cnt += 1;
                }
            }

            System.out.println(99 + cnt);

        } else{

            System.out.println(n);
        }
    }
}