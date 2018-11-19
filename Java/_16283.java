package Algorithm.BaekJoon;

import java.util.*;

public class _16283 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a, b, n, w;

        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        w = sc.nextInt();

        int sheep = 0, goat = 0, cnt = 0;

        for(int i = 1; i < n; i++){

            int res = (a * i) + (b * (n-i));

            if(res == w){
                cnt++;
                sheep = i;
                goat = n-i;
            }
        }

        if(cnt == 1){
            System.out.print(sheep + " " + goat);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}
