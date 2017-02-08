import java.util.Scanner;
public class N2112_Tile {
	static long arr[] = new long[15];
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		for(int i=0; i<15; i++)
			arr[i] = -1;
		arr[0] = 1;
		arr[1] = 3;
		//arr[2] = 11;
		//arr[4] = 153;
		//arr[5] = 571;
		//arr[6] = 2131;
		if(n%2 == 1)
			System.out.println(0);
		else{
			long result = calcTile(n/2);
			System.out.println(result);
		}
	}
	public static long calcTile(int n){
		if(arr[n]!=-1)
			return arr[n];
		else{
			arr[n] = calcTile(n-1)*3;
			for(int i=n-2; i>=0; i--)
				arr[n] += calcTile(i)*2;
			return arr[n];
		}
	}
}
