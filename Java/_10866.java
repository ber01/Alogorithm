package Algorithm.BaekJoon;

import java.io.*;
import java.util.*;

public class _10866 {

    public static void main(String[] args) throws  IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deque = new LinkedList<>();

        int n = Integer.valueOf(br.readLine().trim());

        while(n-- > 0){

            String[] line = br.readLine().split(" ");

            String cmd = line[0];

            switch (cmd){

                case "push_front" : {
                    deque.addFirst(Integer.valueOf(line[1]));
                } break;

                case "push_back" : {
                    deque.addLast(Integer.valueOf(line[1]));
                } break;

                case "pop_front": {
                    System.out.println((deque.isEmpty()) ? -1 : deque.removeFirst());
                } break;

                case "pop_back" : {
                    System.out.println((deque.isEmpty()) ? -1 : deque.removeLast());
                } break;

                case "size" : {
                    System.out.println(deque.size());
                } break;

                case "empty" : {
                    System.out.println((deque.isEmpty()) ? 1 : 0);
                } break;

                case "front" : {
                    System.out.println((deque.isEmpty()) ? -1 : deque.getFirst());
                } break;

                case "back" : {
                    System.out.println((deque.isEmpty()) ? -1 : deque.getLast());
                } break;
            }
        }
    }
}
