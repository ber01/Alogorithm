package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _1158 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.valueOf(st.nextToken());
        int m = Integer.valueOf(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        StringBuilder sb = new StringBuilder("<");
        for(int i = 1; i <= n; i++){
            queue.offer(i);
        }

        for(int i = 1; i <= n-1; i++){

            for(int j = 1; j <= m-1; j++){

                queue.offer(queue.peek());
                queue.poll();
            }

            sb.append(queue.poll() + ", ");
        }

        sb.append(queue.poll() + ">");
        System.out.println(sb);
    }
}
