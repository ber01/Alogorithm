import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2920 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] music = br.readLine().split(" ");
            String[] result = new String[8];
            String[] result_r = new String[8];

            for(int i = 1, j = 0; i < 9; i++, j++) result[j] = String.valueOf(i);
            for(int i = 8, j = 0; i > 0; i--, j++) result_r[j] = String.valueOf(i);

            if(Arrays.equals(music, result)) System.out.println("ascending");

            else if(Arrays.equals(music, result_r)) System.out.println("descending");

            else System.out.println("mixed");

        } catch (IOException e) { e.printStackTrace(); }
    }
}