import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2577 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            int C = Integer.parseInt(br.readLine());

            String result = String.valueOf(A*B*C);
            int[] result_l = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

            for(int i = 0; i < result.length(); i++){
                if(result.charAt(i) == '0') result_l[0]++;
                if(result.charAt(i) == '1') result_l[1]++;
                if(result.charAt(i) == '2') result_l[2]++;
                if(result.charAt(i) == '3') result_l[3]++;
                if(result.charAt(i) == '4') result_l[4]++;
                if(result.charAt(i) == '5') result_l[5]++;
                if(result.charAt(i) == '6') result_l[6]++;
                if(result.charAt(i) == '7') result_l[7]++;
                if(result.charAt(i) == '8') result_l[8]++;
                if(result.charAt(i) == '9') result_l[9]++;
            }

            for(int i = 0; i < result_l.length; i++) System.out.println(result_l[i]);

        } catch (IOException e) { e.printStackTrace(); }
    }
}
