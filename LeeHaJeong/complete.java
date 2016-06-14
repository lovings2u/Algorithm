import java.util.Scanner;
public class complete {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int num = kbd.nextInt();
		int div[] = new int[num];
		int count = 0;
		for(int i=1; i<=num; i++){
			if(num%i == 0)
				div[count++] = i;	
		}
		int result = 0;
		for(int i=0; i<count-1; i++)
			result += div[i];
		
		if(result == num)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
