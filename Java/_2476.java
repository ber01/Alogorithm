package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _2476 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine().trim());
        List<Integer> list = new ArrayList<>();

        while(n-- > 0){

            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int[] dic = new int[st.countTokens()];
            Map<Integer, Integer> map = new HashMap<>();

            int index = 0;
            while(st.hasMoreTokens()){
                int temp = Integer.valueOf(st.nextToken());
                dic[index++] = temp;
                if(map.containsKey(temp)){
                    map.put(temp, map.get(temp)+1);
                } else{
                    map.put(temp, 1);
                }
            }

            if(map.size() == 1){

                int temp = 0;
                for(int i : map.keySet()){
                    temp = i;
                }

                list.add(10000 + temp * 1000);
            } else if(map.size() == 2){

                int temp = 0;
                for(int i : map.keySet()){

                    if(map.get(i) == 2){
                        temp = i;
                    }
                }

                list.add(1000 + temp * 100);
            } else if(map.size() == 3){

                int max = 0;
                for(int i : map.keySet()){

                    if(i > max){

                        max = i;
                    }
                }

                list.add(max * 100);
            }
        }

        Collections.sort(list);

        System.out.println(list.get(list.size()-1));
    }
}
