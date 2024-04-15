import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 필요한 것
        /*
            - 수 입력받을 변수 두 변수
            - 뒤집기
            - 크기 비교
            - 젤 큰 수 출력

         */

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int reversed1 = reverseNumber(num1);
        int reversed2 = reverseNumber(num2);

        if (reversed1 > reversed2) {
            System.out.println(reversed1);
        } else {
            System.out.println(reversed2);
        }

        sc.close();
    }

    private static int reverseNumber(int num) {
        StringBuilder sb = new StringBuilder();

        sb.append(num);
        sb.reverse();

        return Integer.parseInt(sb.toString());
    }
}