import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1152 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] sentence_l = br.readLine().trim().split("\\s+");

            if(sentence_l[0].isEmpty()) System.out.println(0);
            else System.out.println(sentence_l.length);

            br.close();

        } catch (IOException e) { e.printStackTrace(); }
    }
}