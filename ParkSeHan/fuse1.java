import java.util.Scanner;
public class fuse1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(((a*5)+(b*4)+(c*1))%10 == 0)
			System.out.println((a*5)+(b*4)+(c*1) + " amperes");
		else
			System.out.println(((a*5)+(b*4)+(c*1))-(((a*5)+(b*4)+(c*1))%10) + 10 + " amperes");
	}
}
