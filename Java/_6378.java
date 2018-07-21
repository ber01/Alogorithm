package Algorithm.BaekJoon;

import java.io.*;

public class _6378 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){

            String str = br.readLine();

            if(str.equals("0")) break;

            while(str.length() != 1){

                int result = 0;
                for(int i = 0; i < str.length(); i++){

                    result += Character.getNumericValue(str.charAt(i));
                }

                str = String.valueOf(result);
            }

            System.out.println(str);
        }
    }
}