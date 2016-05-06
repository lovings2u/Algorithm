import java.util.Scanner;
public class Nsubset {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		double n,m=0;
		n = kbd.nextDouble();
		m = kbd.nextDouble();
		System.out.printf("%.0f",Math.pow(m,n));
	}
}
