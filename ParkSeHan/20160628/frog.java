import java.io.FileInputStream;
import java.util.Scanner;

class frog {
	
	public static void main(String args[]) throws Exception	{

		Scanner s = new Scanner(System.in);     
		for(int t = s.nextInt(), tc = 1; tc <= t; tc ++) {

			int n = s.nextInt();
			int[] stone = new int[n];
			for(int i = 0; i < n; i ++) stone[i] = s.nextInt();
			System.out.println("Case #" + tc);
			System.out.println(move(0, 0, 0, s.nextInt(), stone));
			
		}
		s.close();
		
	}

	public static int move(int i, int frog, int count, int k, int[] stone) {
		
		if(i == stone.length) 
			return count;
		
		while(i < stone.length && frog + k >= stone[i]) 
			i ++;
		
		if(frog == stone[i - 1]) 
			return -1;
		
		return move(i, stone[i - 1], count + 1, k, stone);
	
	}
	
}