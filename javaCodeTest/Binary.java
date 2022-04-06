package javaCodeTest;

import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {

        System.out.println("원하는 값을 입력");
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int rest[] = new int[10];

        int i = 0;

        while (input > 0) {
            rest[i] = input % 2;
            input = input / 2;
            i++;
        }

        i--;

        for (; i >= 0; i--) {
            System.out.print(rest[i]);
        }

    }

}
