package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _5800 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.valueOf(br.readLine().trim());

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= k; i++){

            String[] line = br.readLine().split(" ");

            int[] arr = new int[Integer.valueOf(line[0])];

            for(int j = 1; j < line.length; j++){

                arr[j-1] = Integer.valueOf(line[j]);
            }

            Arrays.sort(arr);

            sb.append("Class " + i +"\nMax " + arr[arr.length-1] + ", Min " + arr[0] + ", Largest gap " + gap(arr) + "\n");
        }

        System.out.print(sb);
    }

    private static int gap(int[] arr){

        int max = 0;
        for(int i = 1; i < arr.length; i++){

            if(arr[i] - arr[i-1] > max){

                max = arr[i] - arr[i-1];
            }
        }

        return max;
    }
}
