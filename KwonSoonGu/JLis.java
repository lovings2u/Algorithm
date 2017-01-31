import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Soongu on 2017-01-30.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        for (int i=0;i<testcase;i++) {
            HashSet<Integer> array = new HashSet<>();

            int aSize = sc.nextInt();
            int bSize = sc.nextInt();

            for (int j = 0; j < aSize; j++) {
                array.add(sc.nextInt());
            }

            for (int j = 0; j < bSize; j++) {
                array.add(sc.nextInt());
            }

            System.out.println(array.size());
        }

    }


}
