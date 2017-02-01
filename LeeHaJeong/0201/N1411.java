import java.util.Scanner;
public class N1411 {
	static int res[];
		
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		res = new int[n];
		res[0] = 0;
		res[1] = 0;
		res[2] = 3;
		int result = calTile(n);
		result %= 201005229;
		System.out.println(result);
	}
	
	public static int calTile(int n){
		int result = 0;
		if(n <= 2)
			return res[n];
		else{
			if(res[n]!=0)
				return res[n];
			else{
				res[n] = res[n-1]+(res[n-1]/2)+1;
				result = res[n];	
				return result;
			}
		}
	}
}
