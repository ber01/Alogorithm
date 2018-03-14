import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class _8958 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());

            for(int i = 0; i < num; i++) {
                String quiz = br.readLine();
                ArrayList<Integer> result = new ArrayList<>(quiz.length());
                for(int j = 0; j < quiz.length(); j++){
                    if(j == 0){
                        if(quiz.charAt(0) == 'O') result.add(0, 1);
                        else result.add(0, 0);
                    }
                    else{
                        if(quiz.charAt(j) == 'O'){
                            if(quiz.charAt(j-1) == 'O') result.add(j, result.get(j-1)+1);
                            else result.add(j, 1);
                        }
                        else result.add(j, 0);
                    }
                }

                int sum = 0;
                for(int ele : result) sum += ele;

                System.out.println(sum);
            }
        } catch (IOException e) { e.printStackTrace(); }
    }
}