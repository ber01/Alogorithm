package Algorithm.BaekJoon;

import java.util.*;

class T{

    private int index;
    private int value;

    public T(int index, int value){
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" + index + "," + value +")";
    }
}

public class _2493 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Stack<T> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++){

            int value = sc.nextInt();

            while(!stack.isEmpty()){

                T t = stack.peek();
                if(t.getValue() >= value){
                    sb.append(t.getIndex() + " ");
                    break;
                }

                stack.pop();
            }

            if(stack.isEmpty()){
                sb.append(0 + " ");
            }

            stack.push(new T(i, value));
        }

        System.out.println(sb);
    }
}