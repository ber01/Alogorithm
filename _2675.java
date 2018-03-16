import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2675 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());

            for(int i = 0; i < num; i++){
                String[] test = br.readLine().split(" ");

                String result = "";
                for(int j = 0; j < test[1].length(); j++){
                    char c = test[1].charAt(j);
                    for(int k = 0; k < Integer.parseInt(test[0]); k++) result += c;
                }

                System.out.println(result);
            }

        } catch (IOException e) { e.printStackTrace(); }
    }
}
