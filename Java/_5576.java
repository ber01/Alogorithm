package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _5576 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int[] W = new int[10];
            int[] K = new int[10];

            for(int i = 0; i < 10; i++){
                W[i] = Integer.parseInt(br.readLine());
            }

            for(int i = 0; i < 10; i++){
                K[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(W);
            Arrays.sort(K);

            int W_sum = 0;
            int K_sum = 0;
            for(int i = W.length-1; i >= W.length-3; i--){
                W_sum += W[i];
                K_sum += K[i];
            }

            System.out.println(W_sum + " " + K_sum);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
