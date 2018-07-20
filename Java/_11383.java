package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _11383 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());

        List<String> word = new ArrayList<>();

        for(int i = 0; i < n; i++){

            String str = br.readLine().trim();
            word.add(str);
        }

        List<String> d_word = new ArrayList<>();

        for(int i = 0; i < n; i++){

            String str = br.readLine().trim();
            d_word.add(str);
        }

        boolean tf = true;
        for(int i = 0; i < word.size(); i++){

            String result = "";
            String temp = word.get(i);
            for(int j = 0; j < temp.length(); j++){

                String a = temp.charAt(j) + "" + temp.charAt(j) + "";
                result += a;
            }

            if(result.equals(d_word.get(i))){

                tf = true;
            } else {

                tf = false;
                System.out.println("Not Eyfa"); break;
            }
        }

        if(tf){

            System.out.println("Eyfa");
        }
    }
}
