package javaCodeTest;

public class Fibo {

    public static void main(String[] args) {

        int arr[] = new int[10];

        arr[0] = 1;
        arr[1] = 1;

        for (int i= 2; i<arr.length; i++)
        {
            arr[i] = arr[i-1] + arr[i-2];
        }

        for (int a: arr) {
            System.out.println(a);

        }

    }


}
