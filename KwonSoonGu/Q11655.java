package KwonSoonGu;

import java.util.Scanner;

/**
 * Created by Soongu on 2017-01-20.
 */
public class Q11655 {
    public char[] solve(String init) {
        char[] result = new char[init.length()];
        for (int i=0;i<init.length();i++) {
            if (init.charAt(i) != ' ') {
                if (init.charAt(i) >='a' && init.charAt(i) <='z') {
                    if ((char)(init.charAt(i) + 13) > 'z') {
                        result[i] = (char)('a' + (char)(13 - ('z' - init.charAt(i) + 1)));
                    } else {
                        result[i] = (char)(init.charAt(i) + 13);
                    }
                } else if (init.charAt(i) >='A' && init.charAt(i) <='Z') {
                    if ((char)(init.charAt(i) + 13) > 'Z') {
                        result[i] = (char)('A' + (char)(13 - ('Z' - init.charAt(i) + 1)));
                    } else {
                        result[i] = (char)(init.charAt(i) + 13);
                    }
                } else if (init.charAt(i) >='0' && init.charAt(i) <='9'){
                    result[i] = init.charAt(i);
                }
            } else {
                result[i] = ' ';
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s;
        Scanner input = new Scanner(System.in);

        s = input.nextLine();
        char[] result = new char[s.length()];
        Q11655 main = new Q11655();
        result = main.solve(s);

        for(int i=0;i<result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
