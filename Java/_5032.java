package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _5032 {

    public static void main(String[] args){

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // 빈 병의 개수, 그 날 발견한 빈병의 개수, 교환하는데 필요한 빈병의 개수
            // 9개의 빈병을 가지고 있고 3개당 1개로 바꾸어 준다고 하면 3개의 새것 + 3개로 받은 1개로 인하여 +1 해서 4개

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int e = Integer.parseInt(st.nextToken());
            int f = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int quo = (e+f)/c; // 몫
            int rem = (e+f)%c; // 나머지

            int result = quo;

            int total = quo+rem;

            while(total >= c){

                result += (total)/c;
                quo = total/c;
                rem = total%c;
                total = quo+rem;
            }

            System.out.println(result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
