package javaCodeTest.backJun;


import java.util.Scanner;

public class back2577 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = a * b * c;
        String resultString = Integer.toString(result);
        System.out.println(resultString);

        int arr[] = new int[10];


        while (result>0)
        {
            arr[result%10] = arr[result%10]+1;
            result = result/10;
        }


        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }


        }


    }
