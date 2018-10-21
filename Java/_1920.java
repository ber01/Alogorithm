package Algorithm.BaekJoon;

import java.util.*;

public class _1920 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrN = new int[n];
        createArray(arrN, n, sc);

        Arrays.sort(arrN);

        n = sc.nextInt();
        int[] arrM = new int[n];
        createArray(arrM, n, sc);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < arrM.length; i++){
            sb.append(binarySearch(arrN, arrM[i])).append("\n");
        }

        System.out.print(sb);

        sc.close();
    }

    private static void createArray(int[] arr, int n, Scanner sc) {

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
    }

    private static int binarySearch(int[] arr, int n){

        int left = 0, right = arr.length-1, middle = (left+right)/2;

        while(right-left >= 0){
            if(arr[middle] == n){
                return 1;
            } else if(arr[middle] > n){
                right = middle-1;
            } else{
                left = middle+1;
            }
            middle = (left+right)/2;
        }

        return 0;
    }
}
