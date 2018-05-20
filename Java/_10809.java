import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10809 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String Input_a = br.readLine();

            String alphabet = "abcdefghijklmnopqrstuvwxyz";

            String result = "";
            for(int i = 0; i < alphabet.length(); i++){

                if(Input_a.contains(String.valueOf(alphabet.charAt(i)))){
                    result += Input_a.indexOf(alphabet.charAt(i)) + " ";
                }
                else result += "-1 ";
            }

            System.out.println(result.trim());

        } catch (IOException e) { e.printStackTrace(); }
    }
}