import java.util.Scanner;
public class pie {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int a_eat = kbd.nextInt();
		int a = kbd.nextInt();
		int b_eat = kbd.nextInt();
		int b = kbd.nextInt();
		int gcd = 0;
		int lcm = 0;
		if(a<b){
			gcd = euclid(b,a);
		}else{
			gcd = euclid(a,b);
		}
		lcm = (a*b)/gcd;
		int result = lcm - a_eat*(b/gcd) - b_eat*(a/gcd);
		if(result == 0)
			System.out.println(0);
		else{
			gcd = euclid(lcm,result);
			if(gcd != 1){
				lcm /= gcd;
				result /= gcd;
			}
			System.out.println(result+"/"+lcm);
		}
	}
	public static int euclid(int a, int b){
		if(b == 0) return a;
		else return euclid(b, a%b);
	}

}
