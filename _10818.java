import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10818 {

    public static void main(String[] args){

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int num = Integer.parseInt(br.readLine());

            String[] list = br.readLine().split(" ");
            int[] list_int = new int[num];

            for(int i = 0; i < num; i++) list_int[i] = Integer.parseInt(list[i]);

            Arrays.sort(list_int);

            System.out.println(list_int[0] + " " + list_int[list_int.length-1]);

        } catch (IOException e) { e.printStackTrace(); }

    }
}
