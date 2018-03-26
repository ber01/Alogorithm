import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2908 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] num = br.readLine().split(" ");

            String[] num_r = new String[2];

            for(int i = 0; i < num_r.length; i++) num_r[i] = reverseNum(num[i]);

            System.out.println((Integer.parseInt(num_r[0]) > Integer.parseInt(num_r[1])?num_r[0]:num_r[1]));

        } catch (IOException e) { e.printStackTrace(); }
    }

    public static String reverseNum(String num){

        String num_r = "";

        for(int i = num.length()-1; i >= 0; i--) num_r += num.charAt(i);

        return num_r;
    }
}
