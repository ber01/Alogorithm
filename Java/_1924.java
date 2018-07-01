package Baekjoon;

import java.io.*;

public class _1924 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");

        int M = Integer.parseInt(line[0]);
        int D = Integer.parseInt(line[1]);

        int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] result = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        for(int i = 0; i < M-1; i++){
            D += month[i];
        }

        System.out.println(result[D%7]);
    }
}
