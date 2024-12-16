import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
            1316번: 그룹 단어 체커
            필요한것

            - 그룹 단어의 갯수를 입력받을 변수 선언
            - 반복문으로 그룹 단어의 갯수만큼 루프
            - 연속된 문자인지 확인하는 메소드 작성
            - 연속된 문자면 카운트+1

         */

        int n = sc.nextInt();
        int groupWordCount = 0;

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (isGroupWord(word)) {
                groupWordCount++;
            }
        }

        System.out.println(groupWordCount);
    }

    private static boolean isGroupWord(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) != word.charAt(i + 1)) { // 연속된 문자가 아닐 때
                if (word.substring(i + 1).contains(String.valueOf(word.charAt(i)))) {
                    return false; // 이후에 동일 문자가 또 나오면 그룹 단어가 아님
                }
            }
        }
        return true;
    }


}