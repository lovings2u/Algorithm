package KwonSoonGu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Soongu on 2017-01-20.
 */
public class Q11656 {
    public static void main(String[] args) {
        String s;
        ArrayList<String> words = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        s = input.nextLine();

        for (int i=0;i<s.length();i++) {
            words.add(s.substring(i,s.length()));
        }

        Collections.sort(words);

        for (int i=0;i<words.size();i++) {
            System.out.println(words.get(i));
        }
    }
}
