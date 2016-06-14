import java.util.Scanner;
public class luckynum {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int num = kbd.nextInt();
		int i;
		int locate1 = 0;
		for(i=1; ; i++){
			locate1 += (int)Math.pow(2, i);
			if(locate1>num)
				break;
		}
		System.out.println(i);
		System.out.println(lucky(i,num));
		
	}
	public static String lucky(int locate1, int num){
		System.out.println("locate1 : "+locate1);
		if(locate1 == 1 && num == 1)
			return "4";
		else if(locate1 == 1 && num == 0)
			return "7";
		else{
			int locate2 = num;
			for(int i=1; i<locate1; i++)
				locate2 -= (int)Math.pow(2, i);
			System.out.println("locate2 : "+locate2);
			
			//int locate3 = (int)Math.pow(2, locate1)%locate2;
			//System.out.println("locate3 :"+locate3);
			
			if(locate2 > (int)Math.pow(2, locate1-1))
				return "7"+lucky(locate1-1, locate2);
			else
				return "4"+lucky(locate1-1, locate2);			
		}
	}
}
