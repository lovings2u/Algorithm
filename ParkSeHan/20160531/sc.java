import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        boolean run = true;
        while(run){
            int x = sc.nextInt();
            if(x != -1){
                list.add(x);
            }else if(x == -1){
                run = false;
            }
        }
        int a = 0, b = 0, c = 0, d = 0, f = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<=100 && list.get(i)>=90){
                a++;
            }else if(list.get(i)<90 && list.get(i)>=80){
                b++;
            }else if(list.get(i)<80 && list.get(i)>=70){
                c++;
            }else if(list.get(i)<70 && list.get(i)>=60){
                d++;
            }else {
                f++;
            }
        }
        System.out.println(list.size());
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + f);
    }
}