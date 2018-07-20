package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _10773 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int result = 0;

        int k = Integer.valueOf(br.readLine().trim());

        while(k-- > 0){

            int n = Integer.valueOf(br.readLine().trim());

            if(n != 0){

                result += n;
                stack.push(n);
            } else if(n == 0){

                result -= stack.pop();
            }
        }

        System.out.println(result);
    }
}
