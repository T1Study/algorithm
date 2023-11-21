import java.util.Scanner;

// 번호 번경
public class 특정문자뒤집기 {

    public static boolean isAlpha(char c) {
        boolean answer = false;

        if ((65 <= c && c <= 90) || (97 <= c && c <= 123)) {
            answer = true;
        }

        return answer;
    }

    public static String solution(String str) {
        char[] strArr = str.toCharArray();

        int lt = 0;
        int rt = strArr.length - 1;

        while (lt < rt) {
            if (!isAlpha(strArr[lt])) {
                lt += 1;
            } else if (!isAlpha(strArr[rt])) {
                rt -= 1;
            } else if (isAlpha(strArr[lt]) && isAlpha(strArr[rt])) {
                char tmp = strArr[lt];
                strArr[lt] = strArr[rt];
                strArr[rt] = tmp;
                lt += 1;
                rt -= 1;
            }
        }

        return new String(strArr);
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
    }
}
