import java.util.Scanner;

public class 숫자만추출 {
    public static boolean isNumber(char c) {
        return 48 <= c && c <= 57;
    }
    public static int solution(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0; i<str.length(); i++) {
            if (isNumber(str.charAt(i))) {
                stringBuilder.append(str.charAt(i));
            }
        }

        return Integer.parseInt(stringBuilder.toString());
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(solution(str));
    }
}
