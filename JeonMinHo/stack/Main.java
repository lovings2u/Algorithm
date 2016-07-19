package stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		for(int i = 0; i < count; i++) {
			String command = sc.next();
			switch(command) {
			case "push":
				st.add(sc.nextInt());
				break;
			case "pop":
				if(st.isEmpty())
					System.out.println(-1);
				else
				System.out.println(st.pop());
				break;
			case "size":
				System.out.println(st.size());
				break;
			case "empty":
				if(st.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
				break;
			case "top":
				if(st.isEmpty())
					System.out.println(-1);
				else 
					System.out.println(st.lastElement());
				break;
			}
		}
	}
}
