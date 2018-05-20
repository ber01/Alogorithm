import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1157 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String word = br.readLine().toUpperCase();
            char[] alphabet = new char[26];
            int[] check = new int[26];
            int[] check2 = new int[26];

            for(char i = 'A', j = 0; i <= 'Z'; i++, j++) alphabet[j] = i;

            for(int i = 0; i < check.length; i++){
                check[i] = searchCnt(word, alphabet[i]);
                check2[i] = searchCnt(word, alphabet[i]);
            }

            Arrays.sort(check);

            int max = check[check.length-1];

            if(searchCnt(check, max) != 1) System.out.println("?");

            else {

                int index = 0;
                for(int i = 0; i < check2.length; i++) {
                    if (check2[i] == max){
                        index = i; break;
                    }
                }

                System.out.println(alphabet[index]);
            }


        } catch (IOException e) { e.printStackTrace(); }
    }

    public static int searchCnt(String word, char c){

        int cnt = 0;
        for(int i = 0; i < word.length(); i++) if(word.charAt(i) == c) cnt = cnt+1;

        return cnt;
    }

    public static int searchCnt(int[] check, int max){

        int cnt = 0;
        for(int i = 0; i < check.length;i ++) if(check[i] == max) cnt = cnt+1;

        return cnt;
    }
}