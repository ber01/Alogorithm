package Algorithm.BaekJoon;

import java.util.*;

// 스택
public class _1874 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        int temp = 0;
        boolean tf = false;
        boolean isEmpty = true;
        // n 까지 오름차순, n 부터 내림차순
        for(int i = 1; i <= n; i++){

            int value = sc.nextInt();

            // 스택이 비어있을 때(초기)
            if(stack.isEmpty() && isEmpty){

                for(int j = 1; j <= value; j++){

                    stack.push(j);
                    //sb.append("push : " + j).append("\n");
                    sb.append("+").append("\n");
                }

                temp = stack.pop();
                //sb.append("pop : " + temp).append("\n");
                sb.append("-").append("\n");
                isEmpty = false;
            } else { // 스택이 비어있지 않을 때

                // n이 입력값 보다 크거나 같을 때
                if(n >= value){

                    // 스택에 이미 value가 push 되어 있을 때
                    if(stack.contains(value)){

                        // 스택의 top과 value가 같지 않으면 종료
                        if(stack.peek().intValue() != value){
                            System.out.println("NO");
                            tf = true;
                            break;
                        } else { // value 같으면 pop
                            stack.pop();
                            //sb.append("pop : " + stack.pop()).append("\n");
                            sb.append("-").append("\n");
                        }
                    } else{ // value가 스택에 없을 때

                        for(int j = temp+1; j <= value; j++){
                            stack.push(j);
                            //sb.append("push : " + j).append("\n");
                            sb.append("+").append("\n");
                        }

                        temp = stack.pop();
                        //sb.append("pop : " + temp).append("\n");
                        sb.append("-").append("\n");
                    }

                } else if(value > n){ // n보다 입력값이 작을 때

                    if(stack.peek().intValue() != value){
                        System.out.println("NO");
                        tf = true;
                        break;
                    } else{

                        System.out.println("실행");
                        //sb.append("pop : " + stack.pop());
                        stack.pop();
                        sb.append("-");
                    }
                }
            }
        }

        if(!tf){
            System.out.println(sb);
        }
    }
}