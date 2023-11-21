import java.util.Scanner;

public class 회문문자열 {
    public static String solution(String str) {
        String lstr = str.toLowerCase();
        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (lstr.charAt(lt) == lstr.charAt(rt)) {
                lt += 1;
                rt -= 1;
            } else {
                return "NO";
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
