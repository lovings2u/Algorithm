import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
                 
        for (int i = 0; i < num; i++) {
            list1.add(i, sc.nextInt());
            list2.add(i, sc.nextInt());
        }
        for (int i = 0; i < list1.size()-1; i++) {
            for (int j = i+1; j < list1.size(); j++) {
                if(((list1.get(i)+list1.get(j))%2) == 0 && ((list2.get(i)+list2.get(j))%2)==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


import java.util.Scanner;
public class midp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a=0, b=0, c=0, d=0;
		for (int i = 0; i < num; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			if(x%2 != 0){
				if(y%2 != 0){
					c++; // x, y Ȧ��
				}else{
					a++; // x Ȧ��, y ¦��
				}
			}else{
				if(y%2 != 0){
					b++; //x ¦��, y Ȧ��
				}else{
					d++; //x, y ¦��
				}
			}
		}
		System.out.println((a*(a-1) + b*(b-1) + c*(c-1) + d*(d-1))/2);
	}
}
