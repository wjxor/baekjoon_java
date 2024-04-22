import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            1157번: 단어 공부
            필요한것

            - 문자열 입력후 대문자로 변환
            - 알파벳 26자리의 공간을 만듦
            - 입력한 알파벳 개수 확인
            - 값을 하나씩 가져와서 대문자 - A(65)
            - 해당 26자리 공간에 ++

            - max 초기값 -1 ==> 배열 초기값이 0이기 떄문
            - 최대값 찾기
            - 최대값이 1개면 그 문자 출력, 여러개면 ? 출력
         */

        String str = sc.nextLine().toUpperCase();

        int[] alphabet = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int temp = str.charAt(i) - 'A';
            alphabet[temp]++;
        }

        int max = -1;
        char ch = '?';
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] > max) {
                max = alphabet[i];
                ch = (char)(i + 'A');
            } else if (alphabet[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);


        sc.close();
    }


}