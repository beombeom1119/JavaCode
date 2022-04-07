package javaCodeTest.backJun;

import java.util.Scanner;

public class back2525 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int bun = b + c;

        while (bun >= 60) {
            if (bun >= 60) {
                a = a + 1;
                bun = bun - 60;
            }

            if (a >= 24) {
                a = a - 24;
            }

        }


        System.out.print(a + "" + bun);


    }
}
