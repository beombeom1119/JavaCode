package javaCodeTest.backJun;

import java.util.Scanner;

public class back4344 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int C = scanner.nextInt();
        int[] score = new int[C];


        for (int i = 0; i < C; i++) {
            int N = scanner.nextInt();
            int[] arr = new int[N];


            for (int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
                score[i] = score[i] + arr[j];
            }
        }




        for (int j = 0; j < C; j++) {



        }



    }
}
