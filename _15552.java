import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _15552 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());

            for(int i = 0; i < num; i++){

                String[] list = br.readLine().split(" ");

                System.out.println(Integer.parseInt(list[0]) + Integer.parseInt(list[1]));
            }
        }

        catch(Exception e){
            e.printStackTrace();
        }
    }
}
