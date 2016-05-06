import java.util.Scanner;
public class Calorie {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		
		int burger [] = {461, 431, 420, 0};
		int drink [] = {130, 160, 118, 0};
		int side [] = {100, 57, 70, 0};
		int dessert [] = {167, 266, 75, 0};
		
		int arr[] = new int [4];
		
		for(int i=0; i<4; i++)
			arr[i] = kbd.nextInt()-1;
		
		System.out.print("Your total Calorie count is ");
		System.out.print(burger[arr[0]]+drink[arr[1]]+side[arr[2]]+dessert[arr[3]]+".");
			
	}

}
