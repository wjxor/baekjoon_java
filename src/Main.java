import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();
            String S = sc.next();

            // 결과 문자열을 저장할 변수
            StringBuilder result = new StringBuilder();

            // 문자열 S의 각 문자에 대해 R번 반복하여 result에 추가
            for (char c : S.toCharArray()) {
                for (int j = 0; j < R; j++) {
                    result.append(c);
                }
            }

            System.out.println(result);

        }

        sc.close();
    }
}