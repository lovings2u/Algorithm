import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            list.add(i, sc.nextInt());
        }
        Collections.sort(list);
        int minimum = list.get(0) - (total-list.get(1)) - (total-list.get(2));
        if(minimum<0){
            System.out.println(list.get(0)+ " "+ 0);
        }else{
            System.out.print(list.get(0)+ " " + minimum);
        }
    }
}