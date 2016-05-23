package algo;
import java.util.Scanner;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		int x=1;
		int y=1;
		boolean isX=false;
		int result = -1;
		while(result!=sec)
		{
			
				x++;
				for(int i=1; i<x+1;i++){
					
					y++;
					result++;
				}
				
				for(int j=x; j<y;j++){
					
					x++;
					result++;
				}
				if(x==y){
					
					y--;
				}
			
		}
	}	
}
