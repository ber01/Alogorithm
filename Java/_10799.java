package Algorithm.BaekJoon;

import java.util.*;
import java.io.*;

// 스택
public class _10799 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        System.out.println(cntBar(line));
    }

    static int cntBar(String line){

        int result = 0;

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) == '('){
                stack.push(i);
            } else if(line.charAt(i) == ')'){
                if(stack.peek() == i-1){
                    stack.pop();
                    result += stack.size();
                } else{
                    stack.pop();
                    result += 1;
                }
            }
        }
        return result;
    }
}
