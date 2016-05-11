import java.util.Scanner;

public class queen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n,m;
		n=sc.nextLong();
		m=sc.nextLong();
		if(n!=m){
			System.out.println(n>m? m: n);
		}else {
			System.out.println(n);

		}
	
}
}

