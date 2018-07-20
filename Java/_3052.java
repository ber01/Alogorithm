package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _3052 {

    public static final int MOD = 42;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < 10; i++){

            int n = Integer.valueOf(br.readLine().trim());

            set.add(n%42);
        }

        System.out.println(set.size());
    }
}
