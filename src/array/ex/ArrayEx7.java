package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        int [][] arr = new int[3][4];
        while ( i < 4){
            System.out.println((i+1)+ "번 학생의 성적을 입력하세요: ");
            System.out.println("국어 점수: ");
            arr[0][i] = scanner.nextInt();
            System.out.println("영어 점수: ");
            arr[1][i] = scanner.nextInt();
            System.out.println("수학 점수: ");
            arr[2][i] = scanner.nextInt();
            i++;
        }

        int n = 0;
        int sum = 0;
        double average = 0;
        average = sum / 3;

        while (n < 4) {
            sum = arr[0][n] + arr[1][n] + arr[2][n];
            System.out.print((n + 1) + "번 학생의 총점: " + sum + ",  ");
            System.out.println((n + 1) + "번 학생의 평균: " + average);
            n++;
        }
    }
}
