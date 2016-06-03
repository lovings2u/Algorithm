import java.util.Scanner;
public class log {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int num = kbd.nextInt();
		int count = 0;
		int ceil = 0;
		int i;
		for(i=1; ;i++){
			count += i;
			if(count == num){
				ceil = 1;
				break;
			}
			if(count > num)
				break;
		}
		
		if(count != num){
			count = 0;
			for(int j=i; j>0; j--){
				count += j;
				if(num < count){
					ceil = num - (count-j);
					break;
				}
				else if(num == count){
					ceil = j;
					break;
				}
			}
		}
		System.out.println(i+" "+ceil);
	}
}
