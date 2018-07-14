package Algorithm.BaekJoon;

import java.io.*;
import java.util.Arrays;

public class _11656 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int index = s.length();

        String[] arr = new String[s.length()];
        for(int i = 0; i < s.length(); i++){

            String temp = new String();
            for(int j = i; j < s.length(); j++){

                temp += s.charAt(j);
            }
            arr[i] = temp;
        }

        Arrays.sort(arr);

        for(String x : arr){

            System.out.println(x);
        }
    }
}

