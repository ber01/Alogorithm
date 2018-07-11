package Algorithm.BaekJoon;

import java.io.*;

public class _11365 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){

            String line = br.readLine().trim();
            StringBuilder sb = new StringBuilder();

            if(line.equals("END")){
                break;
            }

            for(int i = line.length()-1; i >= 0; i--){
                sb.append(line.charAt(i));
            }

            System.out.println(sb);
        }
    }
}
