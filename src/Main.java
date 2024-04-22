import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            10988번: 팰린드롬인지 확인하기
            필요한것

            - 문자열 입력
            - 입력받은 문자열이 뒤집은 문자열과 같은지 확인
            - 같으면 팰린드롬이므로 1 출력, 다르면 0 출력
         */

        String str = sc.nextLine();

        String reversed = reverseStr(str);

        if (str.equals(reversed))
            System.out.println(1);
        else
            System.out.println(0);

        sc.close();
    }

    private static String reverseStr(String str) {
        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        return sb.toString();
    }


}