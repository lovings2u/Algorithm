import java.util.Scanner;
public class Tiles {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		int m = kbd.nextInt();
		
		System.out.print("The number of whole tiles is "+(n/8)*(m/8)+" part tiles is ");
		if(n%8 !=0 && m%8 != 0)
			System.out.println((m/8)+(n/8)+1);
		else if(m%8 != 0)
			System.out.println(n/8);
		else if(n%8 != 0)
			System.out.println(m/8);
		else
			System.out.println(0);

	}

}
