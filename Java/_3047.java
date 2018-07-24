package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _3047 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[3];

        int index = 0;
        while(st.hasMoreTokens()){

            arr[index] = Integer.valueOf(st.nextToken());
            index++;
        }

        Arrays.sort(arr);

        Map<Character, Integer> map = new HashMap<>();
        map.put('A', arr[0]);
        map.put('B', arr[1]);
        map.put('C', arr[2]);

        String line = br.readLine();
        for(int i = 0; i < line.length(); i++){
            System.out.print(map.get(line.charAt(i)) + " ");
        }
    }
}
