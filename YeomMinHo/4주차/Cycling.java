import java.util.Scanner;

public class Cycling {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int num;
		num = sc.nextInt();
		int[] arr = new int[num];
		int height=0;
		int max_height=0;
		
		for(int i=0 ; i<num ; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=1 ; i<num ; i++){
			if(arr[i-1]<arr[i]){
				height += arr[i]-arr[i-1];
				max_height = Math.max(max_height, height);
			} else {
				height = 0;
			}
		}
		
		System.out.println(max_height);
	}
}
