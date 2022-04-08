package javaCodeTest.backJun;

import java.util.Scanner;

public class back8958 {








    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String[] scoreArr = new String[N];


        for (int i = 0; i < N; i++) {
            scoreArr[i] = scanner.next();
        }


        for (int i = 0; i < scoreArr.length; i++) {
            int plus = 0;               /// 같다면
            int score = 0;              /// 플러스 점수


            for (int j = 0; j < scoreArr[i].length(); j++) {


                if (scoreArr[i].charAt(j)=='O')
                {
                    plus++;
                }else {
                    plus = 0;
                }

                score = score+plus;

            }
            System.out.println(score);
        }

    }
}
