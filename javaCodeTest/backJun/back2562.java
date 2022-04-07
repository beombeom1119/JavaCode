package javaCodeTest.backJun;

import java.util.Scanner;

public class back2562 {

    public static void main(String[] args) {

        int[] arr = new int[9];
        int max = 0;
        int maxindex =0;

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i<arr.length; i++)
        {
            arr[i] =scanner.nextInt();
        }

        for (int i=0; i<arr.length; i++)
        {
            if (max<arr[i])
            {
                max = arr[i];
                maxindex =i+1;
            }

        }

        System.out.println(max);
        System.out.print(maxindex);

    }

}
