package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

// 스택
public class _1406 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for(Character c : str.toCharArray()){
            left.push(c);
        }

        int N = Integer.parseInt(br.readLine());

        while(N-- > 0){

            String[] line = br.readLine().split(" ");
            String c = line[0];

            if(c.equals("L")){
                if(left.isEmpty()){
                    continue;
                } else {
                    right.push(left.pop());
                }
            } else if(c.equals("D")){
                if(right.isEmpty()){
                    continue;
                } else{
                    left.push(right.pop());
                }
            } else if(c.equals("B")){
                if(left.isEmpty()){
                    continue;
                } else{
                    left.pop();
                }
            } else if(c.equals("P")){
                left.push(line[1].charAt(0));
            }
        }

        while(!left.isEmpty()){
            right.push(left.pop());
        }

        StringBuilder sb = new StringBuilder();
        while(!right.isEmpty()){
            sb.append(right.pop());
        }

        System.out.println(sb);
    }
}
