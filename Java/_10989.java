package Algorithm.BaekJoon;

import java.io.*;

public class _10989 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine().trim());
        int[] arr = new int[n];
        int[] cnt = new int[10001];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.valueOf(br.readLine().trim());
        }

        for(int i = 0; i < n; i++){
            cnt[arr[i]]++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < cnt.length; i++){
            while(cnt[i]-- > 0){
                sb.append(i).append("\n");
            }
        }

        System.out.print(sb);

        br.close();
    }
}
