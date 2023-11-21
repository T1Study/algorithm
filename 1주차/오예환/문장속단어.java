import java.util.Scanner;

public class 문장속단어 {

    public static String solution(String s) {
        String[] strArr = s.split(" ");
        String answer = "";
        for (String a : strArr) {
            if (a.length() > answer.length()) {
                answer = a;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));

    }
}
