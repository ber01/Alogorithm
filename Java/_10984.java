package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10984 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int N = Integer.parseInt(br.readLine());
            while (N-- > 0){

                int credit = 0;
                double gpa = 0.0;

                int S = Integer.parseInt(br.readLine());
                while(S-- > 0){

                    StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");
                    int temp1 = Integer.parseInt(st.nextToken());
                    double temp2 = Double.parseDouble(st.nextToken());

                    credit += temp1;
                    gpa += temp1 * temp2;
                }

                double avg = Math.round(gpa / credit * 10);
                avg /= 10;

                sb.append(credit).append(" ").append(avg).append("\n");
            }

            System.out.println(sb);
            br.close();
        } catch (Exception e) { e.printStackTrace(); }
    }
}
