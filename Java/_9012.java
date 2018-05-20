package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class _9012 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());

            for(int i = 0; i < n; i++){
                String str = br.readLine();
                System.out.println(VPS(str.trim()));
            }

        } catch (Exception e) { e.printStackTrace(); }
    }

    public static String VPS(String str){

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                stack.push(str.charAt(i));
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    return("NO");
                }
            }
        }

        if(stack.isEmpty()){
            return("YES");
        }
        else{
            return("NO");
        }
    }
}
