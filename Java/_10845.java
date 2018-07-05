package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _10845 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new LinkedList<Integer>();

        int n = Integer.parseInt(br.readLine());

        while(n-- > 0){

            String[] line = br.readLine().split(" ");

            String cmd = line[0];

            switch (cmd){

                case "push" : {
                    int value = Integer.parseInt(line[1]);
                    queue.offer(value);
                } break;

                case "pop" : {
                    if(!queue.isEmpty()){
                        System.out.println(queue.poll());
                    } else{
                        System.out.println(-1);
                    }
                } break;

                case "size" : {
                    System.out.println(queue.size());
                } break;

                case "empty" : {
                    if(queue.isEmpty()){
                        System.out.println(1);
                    } else{
                        System.out.println(0);
                    }
                } break;

                case "front" : {
                    if(queue.isEmpty()){
                        System.out.println(-1);
                    } else{
                        System.out.println(queue.peek());
                    }
                } break;

                case "back" : {
                    if(queue.isEmpty()){
                        System.out.println(-1);
                    } else{
                        System.out.println(((LinkedList<Integer>) queue).get(queue.size()-1));
                    }
                } break;
            }
        }
    }
}
