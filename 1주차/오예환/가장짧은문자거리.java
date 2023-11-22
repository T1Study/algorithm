import java.util.Scanner;

public class 가장짧은문자거리 {
    public static void solution(String s, String t) {
        int[] answer = new int[s.length()];
        char[] chrArr = s.toCharArray();
        char tChar = t.charAt(0);

        for (int i=0; i<s.length(); i++) {
            answer[i] = 999;
        }

        for (int i=0; i<s.length(); i++) {
            if (chrArr[i] == tChar) {
                answer[i] = 0;

                for (int j=0; j<s.length(); j++) {

                    if (answer[j] > Math.abs(i-j)) {
                        answer[j] = Math.abs(i-j);
                    }
                }
            }
        }

        for (int i=0; i<s.length(); i++) {
            System.out.print(answer[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String s = kb.next();
        String t = kb.next();


        solution(s,t);

    }
}
