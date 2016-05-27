import java.util.Scanner;

public class Chessboard {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long x=1,y=1;
		long repeat=1;
		long num;
		
		long count = 1;
		num = sc.nextLong();
		
		//6개씩 패턴으로 반복
		while(true){
			y += 1;
			count++;
			if(num == count) break;
			
			
			for(int i=1 ; i<=repeat ; i++) {
				x += 1;
				count++;
				if(num == count) break;
			}
			if(num == count) break;
			
			
			for(int i=1 ; i<=repeat ; i++) {
				y -= 1;
				count++;
				if(num == count) break;
			}
			if(num == count) break;
			
			x += 1;
			count++;
			if(num == count) break;
			
			
			for(int i=1 ; i<=repeat+1 ; i++) {
				y += 1;
				count++;
				if(num == count) break;	
			}
			if(num == count) break;
			
			
			for(int i=1 ; i<=repeat+1 ; i++) {
				x -= 1;
				count++;
				if(num == count) break;
			}
			if(num == count) break;
			
			repeat += 2;
		}
		
		System.out.println(x + " " + y);
	}
}
