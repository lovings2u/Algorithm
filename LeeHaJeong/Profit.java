import java.util.Scanner;
public class Profit {
	public static void main (String[] args){
		Scanner kbd = new Scanner(System.in);
		int a = kbd.nextInt();
		int b = kbd.nextInt();
		int c = kbd.nextInt();
		
		double p = a*(100+b)/100.0;
		p *= (100-c)/100.0;
		
		if(p>a)
			System.out.println((int)(p-a));
		else
			System.out.println("loss");
		
	}
}
