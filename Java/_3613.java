package Baekjoon;

import java.io.*;

public class _3613 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean isUnder = false;
        boolean isSmall = false;
        boolean isCapital = false;

        boolean isJava = false;
        boolean isC = false;

        String str = br.readLine().trim();

        if ((int) str.charAt(0) >= 65 && (int) str.charAt(0) < 97){
            System.out.println("Error!"); return;
        }

        String[] temp = str.split("");

        for (int i = 1; i < temp.length; i++){
            if (temp[i].equals("_") && temp[i - 1].equals("_")){
                System.out.println("Error!"); return;
            }
        }

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c == '_') isUnder = true;
            else if ((int) c >= 97 && c <= 122) isSmall = true;
            else if ((int) c >= 65 && (int) c < 97) isCapital = true;
            else{
                System.out.println("Error!"); return;
            }
        }

        if ((isUnder && isCapital) || (isUnder && !isCapital && !isSmall) || (isCapital && !isUnder && !isSmall) || str.charAt(str.length() - 1) == '_'){
            System.out.println("Error!");
        } else if (isSmall && !isUnder && !isCapital){
            System.out.println(str);
        } else if (isUnder && isSmall){
            isC = true;
        } else if (isSmall && isCapital){
            isJava = true;
        }


        if (isC) cToJava(str);

        if (isJava) javaToC(str);

    }

    private static void javaToC(String str) {

        String res = "";
        for (String s : str.split("")){
            char c = s.charAt(0);
            if ((int) c >= 65 && (int) c < 97){
                res += "_" + String.valueOf((char)((int) c + 32));
            } else {
                res += String.valueOf(c);
            }
        }
        System.out.println(res);
    }

    private static void cToJava(String str) {

        String[] arr = str.split("_");

        String sentence = arr[0];

        for (int i = 1; i < arr.length; i++){
            arr[i] = String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1, arr[i].length());
            sentence += arr[i];
        }

        System.out.println(sentence);
    }
}
