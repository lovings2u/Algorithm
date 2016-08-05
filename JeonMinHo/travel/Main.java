package travel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	private static boolean checkDiff(int a, int b) {
		char[] x = String.valueOf(a).toCharArray();
		char[] y = String.valueOf(b).toCharArray();
		int count = 0;
		for(int i = 0; i < x.length; i ++) {
			if(x[i] == y[i])
				count++;
		}
		if(count == 3)
			return true;
		else
			return false;
	}
	
	private static boolean isPrime(int i) {
		for(int j = 2; j < i; j++) {
			if(i % j == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int from = sc.nextInt();
		int to = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i = 1000; i < 10000; i++) {
			if(isPrime(i))
				list.add(i);
		}
		int count = 0;
		Queue<Integer> q = new LinkedList<>();
		int[] check = new int[10000];
		q.add(from);
		while(true) {
			while(!q.isEmpty()) {
				for(int i = 0; i < q.size(); i++) {
					int a = q.poll();
					System.out.println(a);
					if(a == to) {
						System.out.println(count);
						return;
					}
					if(check[a] == 1) 
						continue;
					else 
						check[a] = 1;
					Iterator<Integer> iter = list.iterator();
					while(iter.hasNext()) {
						int tmp = iter.next();
						if(checkDiff(tmp, a))
							q.add(tmp);
					}
				}
				count++;
			}
		}
		
	}
}
