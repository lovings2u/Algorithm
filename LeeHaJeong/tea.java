import java.util.Scanner;
public class tea {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		if(n%2 ==1){
			n = (n+1)/2;
			System.out.println((n-1)*(n-1));
		}
		else{
			n = n/2;
			System.out.println(n*(n-1));
		}
	}
}
