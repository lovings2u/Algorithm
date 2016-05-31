import java.util.Scanner;

public class can {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int black=sc.nextInt();
		int white=sc.nextInt();
		
		System.out.println(white%2==1?"white":"black");

	}

}
