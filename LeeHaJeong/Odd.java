import java.util.Scanner;
public class Odd {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int num[] = new int[7];
		int sum=0;
		int min=100;
		for(int i=0; i<7; i++)
			num[i] = kbd.nextInt();
		for(int i=0; i<7;i++){
			if(num[i]%2 == 1){
				sum += num[i];
				if(min>num[i])
					min = num[i];
			}
		}
		if(sum == 0)
			System.out.println(-1);
		else{
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
