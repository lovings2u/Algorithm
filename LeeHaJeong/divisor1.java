import java.util.Scanner;
public class divisor1 {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int a = (int)Math.sqrt(kbd.nextInt());
		int b = (int)Math.sqrt(kbd.nextInt());
		int count = 0;
		int sum = 0;
		//for(int i=a; i<=b; i++){
			//if(divide(i)%2 == 1){
				//count++;
				//sum += Math.pow(i, 2);
				//sum %= 100000003;
			//}
		//}
		for(int i=a; i<=b; i++){
			if(isSquare(i) == true){
				count++;
				sum += Math.pow(i, 2);
				sum %= 100000003;
			}
		}
		System.out.println(count+" "+sum);
	}
	public static int divide(int num){
		int result = 0;
		for(int i=1; i< Math.sqrt(num); i++){
			if(num%i == 0)
				result++;
		}
		result *= 2;
		if(num%Math.sqrt(num)==0)
			result++;
					
		return result;
	}
	public static boolean isSquare(int num){
		boolean result = false;
		int temp = (int)(Math.sqrt((double)num)+0.5);
		return temp*temp == num;
	}
}
