import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 1; i <= n+1; i++) {
            sum = i+sum;
            list.add(sum);
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = (list.get(i) * i) + result ;
        }
        System.out.println(result);
    }
}