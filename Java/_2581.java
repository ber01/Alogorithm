package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _2581 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        int m = Integer.valueOf(br.readLine().trim());
        int n = Integer.valueOf(br.readLine().trim());

        int sum = 0;
        for(int i = m; i <= n; i++){

            if(i == 1) continue;

            boolean tf = true;
            double sqrtNum = Math.sqrt(i);
            for(int j = 2; j <= sqrtNum; j++){

                if(i%j == 0){

                    tf = false;
                    break;
                }
            }

            if(tf){

                list.add(i);
                sum += i;
            }
        }

        if(!list.isEmpty()){
            System.out.print(sum + "\n" + list.get(0));
        } else{
            System.out.println(-1);
        }
    }
}
