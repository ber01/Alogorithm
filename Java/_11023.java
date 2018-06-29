package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11023 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // " "을 기준으로 나누는 것이 아니라 공백 기준이므로 뒤에 파라미터 " " 하면 안됨
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int sum = 0;
            while(st.hasMoreTokens()){
                // Tokenizer 객체는 valueOf 이용
                sum += Integer.valueOf(st.nextToken());
            }
            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
