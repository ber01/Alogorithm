package Algorithm.BaekJoon;

import java.util.*;

public class _1371 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        HashMap<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();

        while(sc.hasNextLine()){

            String str = sc.nextLine().trim();

            for(int j = 0; j < str.length(); j++){

                if(map.containsKey(str.charAt(j))){

                    map.put(str.charAt(j), map.get(str.charAt(j)) + 1);
                } else if(str.charAt(j) == ' '){

                    continue;
                } else {
                    map.put(str.charAt(j), 1);
                }
            }
        }

        int max = 0;
        for(char c : map.keySet()){

            if(map.get(c) >= max){

                max = map.get(c);
            }
        }

        for(char c : map.keySet()){

            if(map.get(c) == max){
                list.add(c);
            }
        }

        Collections.sort(list);

        for(char c : list){
            System.out.print(c);
        }
    }
}
