import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int result = 0;
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
            list1.add(i, sum);
            result += list1.get(i);
        }
        System.out.println(result);
    }
}