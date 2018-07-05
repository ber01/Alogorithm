package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

// 스택
public class _10828 {

    public static void main(String[] args) throws IOException{

        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while(N-- > 0){

            String[] line = br.readLine().split(" ");

            if(line[0].equals("push")){
                stack.push(Integer.parseInt(line[1]));
            } else if(line[0].equals("pop")){
                if(!stack.isEmpty()){
                    System.out.println(stack.pop());
                } else{
                    System.out.println("-1");
                }
            } else if(line[0].equals("size")){
                System.out.println(stack.size());
            } else if(line[0].equals("empty")){
                if(stack.isEmpty()){
                    System.out.println("1");
                } else{
                    System.out.println("0");
                }
            } else if(line[0].equals("top")){
                if(!stack.isEmpty()){
                    System.out.println(stack.peek());
                } else{
                    System.out.println("-1");
                }
            }
        }
    }
}
