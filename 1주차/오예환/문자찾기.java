import java.util.Scanner;

public class 문자찾기 {
    public static int solution(String word, String c) {
        int answer = 0;
        char lc = c.toLowerCase().charAt(0);
        char[] lword = word.toLowerCase().toCharArray();

        for (char lw : lword) {
            if (lw == lc) answer += 1;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        String c = kb.nextLine();

        int answer = solution(s, c);
        System.out.println(answer);
    }
}
