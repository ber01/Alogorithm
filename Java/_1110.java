import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1110 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String num = br.readLine();

            int num_i = Integer.parseInt(num);

            if(num_i < 0) num = "0";
            else if(num_i > 99) num = "99";

            if(num_i >= 0 && num_i < 10) num = "0" + num;

            int count = 0;
            while(true){

                String test = String.valueOf(Integer.parseInt(String.valueOf(num.charAt(0))) + Integer.parseInt(String.valueOf(num.charAt(1))));
                num = String.valueOf(num.charAt(1)) + test.charAt(test.length()-1);
                count = count + 1;
                if(Integer.parseInt(num) == num_i){
                    System.out.println(count); break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
