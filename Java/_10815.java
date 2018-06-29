package Baekjoon;

import java.util.*;
import java.io.*;

public class _10815 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line);

        HashSet<Integer> set = new HashSet<>();

        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            set.add(num);
        }

        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());

        String line2 = br.readLine();

        st = new StringTokenizer(line2);

        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            if(set.contains(num)){
                sb.append("1 ");
            } else{
                sb.append("0 ");
            }
        }

        System.out.println(sb);
    }
}
