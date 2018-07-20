package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _5789 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine().trim());

        while(n-- > 0){

            String str = br.readLine().trim();

            boolean tf = true;
            for(int i = 0, j = str.length()-1; i < str.length()/2; i++, j--){

                char front = str.charAt(i);
                char back = str.charAt(j);

                if(front == back){

                    tf = true;
                } else{

                    tf =false;
                }
            }

            System.out.println(tf ? "Do-it" : "Do-it-Not");
        }
    }
}