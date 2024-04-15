import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            필요한 것

            - 수 입력

            - 첫째 줄부터 2*N-1번째 줄까지 별 출력

                *        N-1개 공백
               ***       N-2개 공백
              *****      N-3개 공백
             *******     N-4개 공백
            *********    N-5개 공백
             *******
              *****
               ***
                *


         */

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }


}