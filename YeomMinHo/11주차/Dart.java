package dart;
import java.util.Scanner;

public class Dart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case;
		int[] arr = new int[5];
		int num;
		int x,y;
		
		double temp=0;
		double radius=0;
		int sum;
		
		test_case = sc.nextInt();
		int[] result = new int[test_case];
		
		for (int i=0 ; i<test_case ; i++) {
			sum = 0;
			
			for (int j=0 ; j<5 ; j++) {
				arr[j] = sc.nextInt();
			}
			num = sc.nextInt();
			
			for (int n=0 ; n<num ; n++) {
				x = sc.nextInt();
				y = sc.nextInt();
				
				radius = Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2)));
				temp = Math.pow(radius, 2) * Math.PI;
				
				if (temp >= Math.pow(arr[4], 2) * Math.PI) {
					continue;
				} else if (temp >= Math.pow(arr[3], 2) * Math.PI) {
					sum += score(arr,x,y)*2;
				} else if (temp >= Math.pow(arr[2], 2) * Math.PI) {
					sum += score(arr,x,y);
				} else if (temp >= Math.pow(arr[1], 2) * Math.PI) {
					sum += score(arr,x,y)*3;
				} else {
					sum += 50;
				}
			}
			
			result[i] = sum;
		}
		
		for (int i=0 ; i<test_case ; i++) {
			System.out.println("Case #" + (i+1));
			System.out.println(result[i]);
		}
	}
	
	public static int score(int[] arr, int x, int y) {
		int[] score = {20, 1, 1, 18, 18, 4, 4, 13, 13, 6, 6, 10, 10, 15, 15, 2, 2, 17, 17, 3, 3, 19, 19, 7, 7, 16, 16, 8, 8, 11, 11, 14, 14, 9, 9, 12, 12, 5, 5, 20};
		double tempG;
		int result=0;

		tempG = (double)y/x;
		for (int i=0 ; i<40 ; i++) {
			if (tempG > Math.tan(Math.toRadians(90-9*(i+1)))){
				result = score[i];
				break;
			}
		}

		if ( x == 0 ) {
			if (y>0) { result = 20; }
			else { result = 3; }
		} 
		if ( y == 0 ) {
			if (x>0) { result = 6; }
			else { result = 11; }
		}

		return result;
	}
}
