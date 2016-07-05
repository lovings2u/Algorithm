package egyptian_fraction;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int den = sc.nextInt();
		int a = 1, b = 2;
		LinkedList<Integer> result = new LinkedList<Integer>();
		while(num != 1) {
			for(int i = num; i > 1; i--) { // 기약분수만들기
				if(num%i == 0 && den%i == 0){
					num /= i;
					den /= i;
				}
			}
			int tmp1 = num*b; 
			int tmp2 = den*a;
			if(tmp1>tmp2) { // 공통분모 만들어서 빼기
				result.add(b);
				num = tmp1-tmp2;
				den = den*b;
			}
			b++;
		}
		result.add(den);
		Iterator<Integer> iter = result.iterator();
		while(iter.hasNext()) {
			System.out.print("1/" + iter.next() + " ");
		}
	}
}
