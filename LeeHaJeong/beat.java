import java.util.Scanner;
public class beat {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int s = kbd.nextInt();
		int d = kbd.nextInt();
		
		double a = 0;
		int b = 0;
		
		if(s<d){
			System.out.println("impossible");
		}else{
			a = (s+d)/2.0;
			b = s-(int)a;
			if(a%1 != 0)
				System.out.println("impossible");
			else if(a<0 || b<0)
				System.out.println("impossible");
			else
				System.out.println((int)a+" "+b);
		}
		
	}
}
