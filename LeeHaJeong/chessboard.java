import java.util.Scanner;
public class chessboard {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int num = kbd.nextInt();
		int locate = 0;
		int locate2 = 0;
		int x, y = 0;
		for(int i=1; ;i++){
			if(i*i >= num){
				locate = i;
				break;
			}	
			else
				continue;
		}
		
		locate2 = (int)(num - Math.pow((locate-1), 2));
		
		if(locate%2 == 1){
			if(locate2 ==  locate){
				x = locate;
				y = locate;
			}else if(locate2 > locate){
				y = locate;
				x = locate - (int)Math.abs(locate-locate2);
			}else{
				x = locate;
				y = locate - (int)Math.abs(locate-locate2);
			}
		}else{
			if(locate2 ==  locate){
				x = locate;
				y = locate;
			}else if(locate2 > locate){
				x = locate;
				y = locate - (int)Math.abs(locate-locate2);
			}else{
				y = locate;
				x = locate - (int)Math.abs(locate-locate2);
			}
		}
		System.out.println(x+" "+y);
			
		}
}
