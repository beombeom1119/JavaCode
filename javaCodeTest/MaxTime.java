package javaCodeTest;

import java.util.Scanner;

public class MaxTime {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }


        int mode[] = new int[10];

        for (int j = 0; j < mode.length; j++)
        {
            mode[arr[j]]++;
        }

        for (int i = 0; i < mode.length ; i++) {
            System.out.print(mode[i]);
        }

        int maxValue = 0;
        int maxTime = 0;

        for (int i = 0; i < mode.length; i++) {

            if (maxTime<mode[i])
            {
                maxTime = mode[i];
                maxValue= i;
            }

        }





            System.out.println("최빈값은"+maxTime);
            System.out.println("최빈값 배열 값은"+maxValue);

















    }


}
