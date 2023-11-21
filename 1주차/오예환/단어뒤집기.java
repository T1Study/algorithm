import java.util.Scanner;

public class 단어뒤집기 {

    public static String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];

        for (int i=0; i< strArr.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(strArr[i]);
            answer[i] = stringBuilder.reverse().toString();
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        String[] strArr = new String[n];

        for (int i=0; i<n; i++) {
            strArr[i] = kb.nextLine();
        }

        String[] answer = solution(strArr);

        for (String str : answer) {
            System.out.println(str);
        }
    }
}
