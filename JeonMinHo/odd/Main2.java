package odd;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> sort = new TreeSet<>(); //Java 7버전? 부터  우항에 Integer 필요없음
		for(int i = 0; i < 7; i++) {
			int n = sc.nextInt();
			if(odd(n))
				sort.add(n);
		}
		if(sort.isEmpty()){
			System.out.println(-1);
			return;
		}
		
		Iterator<Integer> ite = sort.iterator();
		int result = 0;
		while(ite.hasNext()) 
			result += ite.next();
			

		System.out.println(result + "\n" + sort.first());
		
	}
	
	static boolean odd(int a){
		return a%2==1;
	}
}
