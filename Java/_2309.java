package Algorithm.BaekJoon;

import java.io.*;
import java.util.Arrays;

public class _2309 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dwarf = new int[9];
        int sum = 0;

        for(int i = 0; i < 9; i++){

            int temp = Integer.valueOf(br.readLine().trim());
            dwarf[i] = temp;
            sum += temp;
        }

        Arrays.sort(dwarf);

        boolean tf = false;
        for(int i = 0; i < 9; i++){

            for(int j = i+1; j < 9; j++){

                int value = dwarf[i] + dwarf[j];
                if(sum - value == 100){

                    dwarf[i] = 0;
                    dwarf[j] = 0;
                    tf = true;
                    break;
                }
            }

            if(tf) break;
        }

        for(int x : dwarf){

            if(x == 0) continue;
            System.out.println(x);
        }
    }
}
