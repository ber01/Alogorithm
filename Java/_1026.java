package Algorithm.BaekJoon;

import java.io.*;
import java.util.Arrays;

public class _1026 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine().trim());

        String[] temp = br.readLine().split(" ");

        int[] a = new int[temp.length];
        for(int i = 0; i < temp.length; i++){

            a[i] = Integer.valueOf(temp[i]);
        }

        temp = br.readLine().split(" ");

        int[] b = new int[temp.length];
        for(int i = 0; i < temp.length; i++){

            b[i] = Integer.valueOf(temp[i]);
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int result = 0;
        for(int i = 0, j = a.length-1; i < a.length; i++, j--){

            result += a[i] * b[j];
        }

        System.out.println(result);
    }
}
