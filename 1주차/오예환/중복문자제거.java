import java.util.Scanner;

// 커밋명 변경
public class 중복문자제거 {
    public static String solution(String str) {
        int[] n = new int[26];
        char[] charArr = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();

        for (char c : charArr) {
            if (n[(int)c - 97] == 0) {
                stringBuilder.append(c);
                n[(int)c - 97] = 1;
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
