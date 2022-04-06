package javaCodeTest.backJun;

import java.util.Scanner;

public class back2480 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = 0;

        int cost =0;

        if (a==b && b==c )
        {
            cost = 10000+a*1000;
        }else if (a==c || a==b)
        {
            cost = 1000+a*100;
        }
        else if (b==a || b==c )
        {
            cost = 1000+b*100;
        }else if (c==a || c==b )
        {
            cost = 1000+c*100;
        }else
        {
           if (a>=b && a>=c)
           {
               max=a;
           }else if(b>=a && b>=c)
           {
            max=b;
           }
           else if(c>=a && c>=b)
           {
               max=c;
           }

           cost = max*100;

        }


        System.out.println(cost);
    }
}
