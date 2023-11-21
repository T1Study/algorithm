import java.util.Scanner;

public class 대소문자변환 {

    public static String solution(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] cArr = str.toCharArray();

        for (char c : cArr) {
            if (65 <= c && c <= 90) {
                stringBuilder.append((char)(c + 32));
            } else if (97 <= c && c <= 122) {
                stringBuilder.append((char)(c - 32));
            }
        }
        return stringBuilder.toString();

    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
    }
}
