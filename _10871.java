import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _10871 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] num = br.readLine().split(" ");
            String[] seq = br.readLine().split(" ");

            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < Integer.parseInt(num[0]); i++){
                if(Integer.parseInt(num[1]) > Integer.parseInt(seq[i])){
                    sb.append(seq[i] + " ");
                }
            }

            System.out.print(sb);

        } catch (Exception e) { e.printStackTrace(); }
    }
}
