package Baekjoon;

import java.io.*;
import java.util.*;

public class _9506 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){

            int n = Integer.valueOf(br.readLine().trim());
            StringBuilder sb = new StringBuilder();

            List<Integer> divisor = new ArrayList<>();
            int sum = 0;

            if(n == -1) break;

            for(int i = 1; i < n; i++){

                if(n%i == 0){
                    sum += i;
                    divisor.add(i);
                }
            }

            if(n == sum){

                sb.append(n + " = ");
                for(int i = 0; i < divisor.size()-1; i++){
                    sb.append(divisor.get(i) + " + ");
                }
                sb.append(divisor.get(divisor.size()-1));
            } else{

                sb.append(n + " is NOT perfect.");
            }

            System.out.println(sb);
        }
    }
}
