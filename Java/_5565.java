package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class _5565 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            List<Integer> book = new ArrayList<>(10);
            int sum = 0;
            for(int i = 0; i < 10; i++){
                int temp = Integer.parseInt(br.readLine().trim());
                book.add(temp);
                if(i != 0) sum += temp;
            }

            System.out.println(book.get(0) - sum);

        } catch (Exception e) { e.printStackTrace(); }
    }
}
