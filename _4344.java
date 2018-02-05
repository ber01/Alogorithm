import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _4344 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());

            String[] score;
            for(int i = 0; i < num; i++) {
                score = br.readLine().split(" ");

                int sum = 0;
                for(int j = 1; j < Integer.parseInt(score[0])+1; j++) {
                    sum += Integer.parseInt(score[j]);
                }

                double avrg = (double)sum/Integer.parseInt(score[0]);

                int cnt = 0;
                for(int k = 1; k < Integer.parseInt(score[0])+1; k++){
                    if(Integer.parseInt(score[k]) > avrg) cnt += 1;
                }

                int len = Integer.parseInt(score[0]);
                avrg = (double)cnt/len * 100;
                System.out.printf("%.3f%%\n", avrg);
            }

        } catch (Exception e) { e.printStackTrace(); }
    }
}