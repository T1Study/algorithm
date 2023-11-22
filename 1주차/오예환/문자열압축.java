import java.util.Scanner;

public class 문자열압축 {
    public static String solution(String str) {
        int len = str.length();
        int lt = 1;
        int count = 1;
        char prevChar = str.charAt(0);
        StringBuilder stringBuilder = new StringBuilder();


        while (lt < len) {
            if (prevChar == str.charAt(lt)) {
                count += 1;
                lt += 1;
            } else {
                if (count == 1) {
                    stringBuilder.append(prevChar);
                } else {
                    stringBuilder.append(prevChar + (count + ""));
                }
                prevChar = str.charAt(lt);
                count = 1;
                lt += 1;
            }
        }

        if (count == 1) {
            stringBuilder.append(prevChar);
        } else {
            stringBuilder.append(prevChar + (count + ""));
        }

        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(solution(str));
    }
}
