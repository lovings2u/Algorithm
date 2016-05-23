import java.util.Scanner;
public class reduction {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int x = kbd.nextInt();
		int y = kbd.nextInt();
		int copy_x = kbd.nextInt();
		int copy_y = kbd.nextInt();
		int temp = 0;
		
		if(x<y){
			temp = x;
			x = y;
			y = temp;
		}
		
		if(copy_x<copy_y){
			temp = copy_x;
			copy_x = copy_y;
			copy_y = temp;
			
		}
		
		int r_x = (int)(copy_x/(double)x*100);
		int r_y = (int)(copy_y/(double)y*100);
		
		
		if(r_x>100 && r_y>100)
			System.out.println("100%");
		else{
			if(r_x < r_y)
				System.out.println(r_x+"%");
			else
				System.out.println(r_y+"%");
		}
	}
}
