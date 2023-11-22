import java.util.Scanner;

public class 암호 {
    public static int stringToNumber(String str) {
        int answer = 0;

        for (int i=0; i<str.length(); i++) {
             int a = str.charAt(i) - '0';
             answer += (int) (a * Math.pow(2.0, 6-i));
        }

        return answer;
    }
    public static String solution(int n, String str) {
        StringBuilder answer = new StringBuilder();
        String[] strArr = new String[n];

        for (int i=0; i<n; i++) {
            StringBuilder stringBuilder = new StringBuilder(
                    str.substring(i * 7, (i+1) * 7)
                            .replace("#", "1")
                            .replace("*", "0"));

            strArr[i] = stringBuilder.toString();
        }

        for (int i=0; i<n; i++) {
            answer.append((char)stringToNumber(strArr[i]));
        }


        return answer.toString();
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        String str = kb.nextLine();

        System.out.println(solution(n, str));
    }
}
