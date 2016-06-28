import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    static List<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list2 = new ArrayList<Integer>();
        while(true){
            int num = sc.nextInt();
            if(num<2){
                break;
            }else{
                list2.add(num);
            }
        }
        int a = 1, b = 1, c = 0;
        list.add(0, 1);
        list.add(1, a);
        list.add(2, b);
        for (int i = 3; i <= 41; i++) {
            c = a+ b;
            list.add(i, c);
            a = b;
            b = c;
        }
        for (int i = 0; i < list2.size(); i++) {
            int k = i+1;
            System.out.println("Case #"+k+":");
            if(list2.get(i) % 2 ==0){
                System.out.print(list.get(list2.get(i)+1) + ", ");
                System.out.println(list.get(list2.get(i)));
                System.out.println();
            }else{
                System.out.print(list.get(list2.get(i)) + ", ");
                System.out.println(list.get(list2.get(i)+1));
                System.out.println();
            }
        }
    }
}