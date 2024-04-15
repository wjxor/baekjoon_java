import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            필요한 것

            - 문자 입력 최대 100줄
            - 입력받은 그대로 출력

         */

        // 입력이 더 이상 없을 때까지 계속 읽고 출력
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            System.out.println(str);
        }



        sc.close();
    }


}