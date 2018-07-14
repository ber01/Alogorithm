package Algorithm.BaekJoon;

import java.io.*;

public class _11655 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < line.length(); i++){

            int value = line.charAt(i);

            if(value == 32){
                sb.append((char)32);
            } else if(value >= 48 && value <= 57){
                sb.append((char)value);
            } else if(value >= 97 && value+13 <= 122){
                sb.append((char)(value+13));
            } else if(value+13 > 122){
                sb.append((char)(value-13));
            } else if(value >= 65 && value+13 <= 90){
                sb.append((char)(value+13));
            } else if(value+13 > 90){
                sb.append((char)(value-13));
            }
        }

        System.out.println(sb);
    }
}
