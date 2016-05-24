import java.util.Scanner;
public class flea {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int s = kbd.nextInt();
		int x = kbd.nextInt();
		int y = kbd.nextInt();
		int dx = kbd.nextInt();
		int dy = kbd.nextInt();
		int current_x = 0;
		int current_y = 0;
		int i=-1;
		int isPossible=0;
		while(i<10000){
			i++;
			current_x = x+i*dx;
			current_y = y+i*dy;
			if(current_x%(2*s)!=0 && current_y%(2*s)!=0 && current_x%(2*s)>s && current_y%(2*s)<s){
				isPossible = 1;
				break;
			}
			if(current_x%(2*s)!=0 && current_y%(2*s)!=0 && current_x%(2*s)<s && current_y%(2*s)>s){
				isPossible = 1;
				break;
			}	
		}
		if(isPossible == 1)
			System.out.println("After "+i+" jumps the flea lands at ("+current_x+", "+current_y+").");
		else
			System.out.println("The flea cannot escape from black squares.");
	}
}
