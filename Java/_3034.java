package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _3034 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());
            double D = Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));

            while(N-- > 0){

                if(Integer.parseInt(br.readLine()) > D){
                    bw.write("NE" + "\n");
                }

                else bw.write("DA" + "\n");
            }

            bw.flush();
        } catch (Exception e) { e.printStackTrace(); }
    }
}
