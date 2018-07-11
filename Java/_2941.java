package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _2941 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = Arrays.asList("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");

        String str = br.readLine().trim();

        for (String key : list) {

            if (str.contains(key)) {

                str = str.replace(key, "#");
            }
        }

        System.out.println(str.length());
    }
}