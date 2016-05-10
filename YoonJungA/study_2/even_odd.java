package level1_2;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		System.out.println(check(first)+"+"+check(second)+"="+check(first+second));
		System.out.println(check(first)+"*"+check(second)+"="+check(first*second));
	}
	public static String check(int a){
		if(a%2==0)return "even"; 
		else return "odd";
	}
}