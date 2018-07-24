package Algorithm.BaekJoon;

import java.io.*;

public class _5613 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.valueOf(br.readLine().trim());

        while(true){

            String str = br.readLine().trim();

            if(str.equals("=")) break;

            int n2 = Integer.valueOf(br.readLine().trim());

            n1 = cal(n1, n2, str);
        }

        System.out.println(n1);
    }

    private static int cal(int n1, int n2, String str){

        if(str.equals("*")){
            return n1 * n2;
        } else if(str.equals("+")){
            return n1 + n2;
        } else if(str.equals("-")){
            return n1 - n2;
        } else{
            return n1 / n2;
        }
    }
}
