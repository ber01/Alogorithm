package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _3053 {

    public static void main(String[] args){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            double radius = Double.parseDouble(br.readLine().trim());

            System.out.printf("%.6f\n", radius * radius * Math.PI);

            radius = (Math.sqrt(Math.pow(radius, 2) + Math.pow(radius, 2)));

            System.out.printf("%.6f", radius * radius);

        } catch (Exception e) { e.printStackTrace(); }
    }
}
