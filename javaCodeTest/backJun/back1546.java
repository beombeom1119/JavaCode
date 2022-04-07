package javaCodeTest.backJun;

import java.util.Arrays;
import java.util.Scanner;

public class back1546 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[] scoreList = new double[N];
        double score = 0;
        double result = 0;



        for (int i = 0; i < N; i++) {
            scoreList[i] = scanner.nextInt();
        }

        for (int i = 0; i < scoreList.length; i++) {
            if (score < scoreList[i]) {
                score = scoreList[i];
            }
        }

        for (int i = 0; i < scoreList.length; i++) {
            scoreList[i] = scoreList[i] / score * 100;
            result = result + scoreList[i];
        }

        System.out.println(result / N);
    }
}
