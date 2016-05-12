import java.util.Scanner;
public class Clo {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		//30n+0.5x=6x
		//30n=5.5x
		//x=30n/5.5
		//x=60/11n
		
		if(n == 12)
			n=0;
		
		double x = 60/11.0*n;
		
		if(Math.ceil(x)<60)
			System.out.println(String.format("%.6f", x));
		else
			System.out.println("CAN'T SEE!");
	
	}
}
