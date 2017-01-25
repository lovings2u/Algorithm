import java.util.Scanner;

public class q10824 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		String A=Integer.toString(a)+Integer.toString(b);
		String B=Integer.toString(c)+Integer.toString(d);
		System.out.println((long)(Integer.parseInt(A)+Integer.parseInt(B)));
	}

}
