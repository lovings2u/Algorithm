import java.util.Scanner;
public class insubunE {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int a = kbd.nextInt();
		int b = kbd.nextInt();
		
		int p = 0;
		int q = 0;
		double aa_4b = 0;	
		
		if(Math.sqrt(a*a - 4*b)%1 == 0){
			p = a+(int)Math.sqrt(a*a-4*b);
			p /= 2;
			q = a-(int)Math.sqrt(a*a-4*b);
			q /= 2;
		}else{
			p = 0;
			q = 0;
		}
		
		if(p >= q){
			int temp = p;
			p = q;
			q = temp;
		}
		if(p==0 && q==0)
			System.out.println("impossible");
		else
			System.out.printf("(x%+d)(x%+d)",-p,-q);
	}
}
