package Baekjoon;

import java.util.*;
import java.io.*;

public class _1927 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        while(N-- > 0){

            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                if(queue.isEmpty()){
                    System.out.println("0");
                }
                else{
                    System.out.println(queue.poll());
                }
            }
            else{
                queue.offer(x);
            }
        }

        /* 배열을 이용하여 입력받을 때 마다 정렬을 하면서 풀면 시간초과가 된다.
        List<Integer> list = new ArrayList<>();

        while(N-- > 0){

            int x = Integer.parseInt(br.readLine());
            Collections.sort(list);
            if(x == 0){
                if(list.isEmpty()){
                    System.out.println("0");
                }
                else{
                    System.out.println(list.get(0));
                    list.remove(0);
                }
            }
            else{
                list.add(x);
            }
        } */
    }
}
