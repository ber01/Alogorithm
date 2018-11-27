package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _11931 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine().trim());

        Integer[] arr = new Integer[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.valueOf(br.readLine().trim());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(arr[i]).append("\n");
        }

        System.out.print(sb);

        br.close();
    }
}
