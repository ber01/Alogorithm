package Algorithm.BaekJoon;

import java.io.*;

public class _4948 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){

            int n = Integer.valueOf(br.readLine().trim());
            int m = 2*n;
            if(n == 0) break;

            int cnt = 0;

            if(n <= 1){

                System.out.println(1);
            } else {
                for(int i = n+1; i <= m; i++){

                    boolean tf = true;
                    for(int j = 2; j*j <= i; j++){

                        if(i%j == 0){

                            tf = false;
                            break;
                        }
                    }

                    if(tf){

                        cnt += 1;
                    }
                }

                System.out.println(cnt);
            }
        }
    }
}
