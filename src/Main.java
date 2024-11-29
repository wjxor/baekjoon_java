import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            2941번: 크로아티아 알파벳
            필요한것

            - 크로아티아 대체문구들 정의
            - 문자열 입력받기
            - 크로아티아 알파벳 일치하면 *로 대체시키기
            - 길이를 출력
         */

        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String input = sc.nextLine();

        for (String alphabet : croatia) {
            input = input.replace(alphabet, "*");
        }

        System.out.println(input.length());


        sc.close();
    }


}