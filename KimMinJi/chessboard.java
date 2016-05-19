import java.util.Scanner;

public class chessboard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long x=1,y=1,count=1;
		
		while(n!=count){
			if(n==count){break;}
			y++;count++;
			if(n==count){break;}
			while(x!=y){
				x++;count++;
				if(n==count){break;}
			}if(n==count){break;}
			while(y!=1){
				--y;
				count++;if(n==count){break;}}
				
			if(n==count){break;}
			x++;
			count++;
			if(n==count){break;}
			while(x!=y){
				y++;
				count++;
				if(n==count){break;}
			}if(n==count){break;}
			while(x!=1){
				--x;
				count++;if(n==count){break;}}
				
		}		
	System.out.println(x+" "+y);
}
	}

