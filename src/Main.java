import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            필요한 것

            - 문자 입력을 대문자로 받기
            - 총 시간을 저장할 변수
            - 각 문자에 대한 다이얼 시간 계산
            - 총 시간 출력

         */

        String str = sc.nextLine().toUpperCase();
        int total = 0;

        for (int i = 0; i < str.length(); i++) {
            total += getDialTime(str.charAt(i));
        }

        System.out.println(total);

        sc.close();
    }

    // 문자에 따라 필요한 시간을 반환하는 메소드
    private static int getDialTime(char ch) {
        if (ch >= 'A' && ch <= 'C')
            return 3;
        if (ch >= 'D' && ch <= 'F')
            return 4;
        if (ch >= 'G' && ch <= 'I')
            return 5;
        if (ch >= 'J' && ch <= 'L')
            return 6;
        if (ch >= 'M' && ch <= 'O')
            return 7;
        if (ch >= 'P' && ch <= 'S')
            return 8;
        if (ch >= 'T' && ch <= 'V')
            return 9;
        if (ch >= 'W' && ch <= 'Z')
            return 10;
        return 0; // 입력에 대문자 A~Z외의 다른 문자가 있을 경우를 대비

    }
}