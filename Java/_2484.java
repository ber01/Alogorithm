package Baekjoon;

import java.io.*;
import java.util.*;

public class _2484 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine().trim());

        List<Integer> list = new ArrayList<>();

        while(n-- > 0){

            int reward = 0;

            Map<Integer, Integer> map = new HashMap<>();

            StringTokenizer st = new StringTokenizer(br.readLine().trim(), " ");

            while(st.hasMoreTokens()){

                int temp = Integer.valueOf(st.nextToken());
                if(map.containsKey(temp)){

                    map.put(temp, map.get(temp)+1);
                } else {

                    map.put(temp, 1);
                }
            }

            if(map.size() == 1){

                for(int i : map.keySet()){

                    reward += 50000 + i * 5000;
                }
            } else if(map.size() == 2){

                boolean isTwo = false;
                for(int i : map.keySet()){

                    if(map.get(i) == 3){

                        reward += 10000 + i * 1000;
                    } else if(map.get(i) == 2){

                        reward += i * 500;
                        isTwo = true;
                    }
                }

                if(isTwo){

                    reward += 2000;
                }
            } else if(map.size() == 3){

                for(int i : map.keySet()){

                    if(map.get(i) == 2){

                        reward += 1000 + i * 100;
                    }
                }
            } else {

                int max = 0;
                for(int i : map.keySet()){

                    if(i > max){

                        max = i;
                    }
                }

                reward += max * 100;
            }

            list.add(reward);
        }

        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
    }
}
