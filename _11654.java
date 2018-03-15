import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11654 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String c = br.readLine();

            System.out.println((int)c.charAt(0));

        } catch (IOException e) { e.printStackTrace(); }
    }
}