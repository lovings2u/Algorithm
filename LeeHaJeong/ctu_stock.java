import java.util.Scanner;
public class ctu_stock {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int d = kbd.nextInt();
		int m = kbd.nextInt();
		int p [] = new int [d];
		int profit[] = new int[d];
		
		for(int i=0; i<d; i++)
			p[i] = kbd.nextInt();
		
		int index = 0;
		int result = 0;
		while(index < d-1){
			int max = 0;
			for(int i=index+1; i<d; i++){
				result = (p[i]-p[index])*(m/p[index]);
				if(result > max){
					profit[index] = result;
					max = result;
				}
			}
			index++;
		}
		
		int final_max = 0;
		for(int i=0; i<d; i++)
			final_max = Math.max(profit[i], final_max);
		System.out.println(final_max);		
	}
}
