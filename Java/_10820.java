package Algorithm.BaekJoon;

import java.util.*;

public class _10820 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextLine()){

            String s = sc.nextLine();

            int[] result = new int[4];
            for(int i = 0; i < s.length(); i++){

                int value = s.charAt(i);

                if(value >= 95 && value <= 122){
                    result[0] += 1;
                } else if(value >= 65 && value <= 90){
                    result[1] += 1;
                } else if(value >= 48 && value <= 57){
                    result[2] += 1;
                } else if(value == 32){
                    result[3] += 1;
                }
            }

            for(int x : result){

                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
