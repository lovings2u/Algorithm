package study4;

import java.util.Scanner;

public class flea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt();
		int x=sc.nextInt(); int y=sc.nextInt();
		int dx=sc.nextInt(); int dy=sc.nextInt();
		int fx=0; int fy=0; int jump=0;
		int i=0;
		
		if(x==y&&dx==dy){
			System.out.println("The flea cannot escape from black squares.");
		}else{
		while(true){
			
			int row = x+(i*dx);
			int col = y+(i*dy);			
			if(row%s==0&&col%s==0){
				System.out.println("The flea cannot escape from black squares.");
				break;
			}
			else if((((row/s)%2==0)&&((col/s)%2!=0))||(((row/s)%2!=0)&&((col/s)%2==0))){
				//°¡·Î¸¦ s·Î ³ª´«°Ô È¦¼ö¸é ¼¼·Î¸¦ s·Î ³ª´«°Å´Â Â¦¼ö¿©¾ßÇÏ°í,
				//¼¼·Î¸¦ s·Î ³ª´«°Ô Â¦¼ö¸é È¦¼ö¸¦ s·Î ³ª´«°Å´Â È¦¼ö¿©¾ßÇÔ
				fx=row; fy=col; jump=i;
				System.out.println("After "+jump+" jumps the flea lands at ("+fx+", "+fy+").");
				break;
			}
			i++;
		}

	
	}
}}
