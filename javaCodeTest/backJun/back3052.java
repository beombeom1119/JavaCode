package javaCodeTest.backJun;

import java.util.Scanner;

public class back3052 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];                       //수의 배열
        int[] restArr = new int[42];                   // 나머지 배열
        int result=0 ;                                    //나머지 값

        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] % 42;
            restArr[arr[i]]++;

        }

        for (int i = 0; i < restArr.length; i++) {
            if (restArr[i]!=0)
            {
                result ++;
            }
        }

        System.out.println(result);





    }


}
