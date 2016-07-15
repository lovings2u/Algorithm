import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		String order;
		List list = new ArrayList();
		
		num = sc.nextInt();
		sc.nextLine();
		
		for (int i=0 ; i<num ; i++) {
			order = sc.nextLine();
			
			switch(order) {
				case "pop" :
					pop(list);	
					break;
				case "size" :
					size(list);	
					break;
				case "empty" :
					empty(list);	
					break;
				case "top" :
					top(list);	
					break;
				default :
					push(list, order);	
					break;
			}
		}
	}

	public static void push(List list, String order) {
		list.add(order.substring(5, order.length()));
	}
	
	public static void pop(List list) {
		if (list.isEmpty()) {
			System.out.println("-1");
		} else {
			System.out.println(list.get(list.size()-1));
			list.remove(list.size()-1);
		}
	}
	
	public static void size(List list) {
		System.out.println(list.size());
	}
	
	public static void empty(List list) {
		if (list.isEmpty()) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
	
	public static void top(List list) {
		if (list.isEmpty()) {
			System.out.println("-1");
		} else {
			System.out.println(list.get(list.size()-1));
		}
	}
}
