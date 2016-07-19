import java.util.Scanner;
public class DistributedProcessing {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int t = kbd.nextInt();
		
		int result = 0;
		
		int two [] = {6,2,4,8};
		int three[] = {1,3,9,7};
		int four[] = {6,4};
		int seven[] = {1,7,9,3};
		int eight[] = {6,8,4,2};
		int nine[] = {1,9};
		
		while(t>0){
			
			int a = kbd.nextInt()%10;
			int b = kbd.nextInt();
						
			switch(a){
			case 1:
			case 5:
			case 6:
				result = a;
				break;
			case 2:
				result = two[b%4];
				break;
			case 3:
				result = three[b%4];
				break;
			case 7:
				result = seven[b%4];
				break;
			case 8:
				result = eight[b%4];
				break;
			case 4:
				result = four[b%2];
				break;
			case 9:
				result = nine[b%2];
				break;
			case 0:
				result = 10;
				break;
			}
			
			System.out.println(result);
			t--;
		}
	}
}
