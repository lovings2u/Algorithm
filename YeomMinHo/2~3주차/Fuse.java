import java.util.Scanner;

public class Fuse {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int numC, numP, numR;
		double scale;
		
		numC = sc.nextInt();
		numP = sc.nextInt();
		numR = sc.nextInt();
		
		scale = numC*5 + numP*4 + numR*1;
		
		System.out.println((int)Math.ceil(scale/10)*10 + " amperes");
	}

}
