import java.util.Scanner;
public class can {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int black = kbd.nextInt();
		int white = kbd.nextInt();		
		
	}
	
	public static void random_bean(int black, int white){
		int one, two = 0;
		while(black != 0 && white != 0){
			one = (int)Math.round(Math.random()*(black+white))+1;
			while(one != (two = (int)Math.round(Math.random()*(black+white))+1));
			if(one<black && two<black){
				black -= 2;
				black += 1;
			}
			else if(one>=black && two>=black){
				white -= 2;
				black += 1;
			}
			else
				black -= 1;
		}
		if(black == 0)
			System.out.println("white");
		else
			System.out.println("black");
	}
}
