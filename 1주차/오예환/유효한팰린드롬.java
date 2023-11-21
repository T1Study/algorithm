import java.util.Scanner;

public class 유효한팰린드롬 {
    public static boolean isAlpha(char c) {
        return (48 <= c && c <= 57) || (97 <= c && c <= 122) || (65 <= c && c <= 90);
    }
    public static String solution(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.toLowerCase().replace(" ", ""));
        String cStr = stringBuilder.toString();

        int lt = 0;
        int rt = stringBuilder.length() - 1;

        while (lt < rt) {
            if (isAlpha(cStr.charAt(lt)) && isAlpha(cStr.charAt(rt))) {
                if (cStr.charAt(lt) != cStr.charAt(rt)) {
                    return "NO";
                } else {
                    lt += 1;
                    rt -= 1;
                }
            } else if (!isAlpha(cStr.charAt(lt))) {
                lt += 1;
            } else if (!isAlpha(cStr.charAt(rt))) {
                rt -= 1;
            }
        }

        return "YES";
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(solution(str));

    }
}
