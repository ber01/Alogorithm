package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _11024 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.valueOf(br.readLine().trim());

        while(t-- > 0){

            System.out.println(Arrays.stream(br.readLine().split(" ")).mapToInt(i -> Integer.valueOf(i)).sum());
        }
    }
}