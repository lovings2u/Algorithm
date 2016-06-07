import java.util.Scanner;

public class Coci_tablica {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][2];
		double[] result = new double[4];
		double max=0; 
		int rotation_count=0;
		
		for(int j=1 ; j>=0 ; j--) {	// 2차원 배열 입력
			for(int i=0 ; i<2 ; i++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int k=0 ; k<4 ; k++) {	// 회전하면서 (a/c + b/d)를 계산하여 result라는 배열에 입력
			if (calculate(arr) > max) {	// max값인 위치 찾기
				max = calculate(arr);
				rotation_count = k;
			}
			
			rotation(arr);	// 회전
		}
		
		System.out.println(rotation_count);	// max값이 있었던 위치 출력
	}
	
	public static double calculate(int[][] arr) {	// a/c + b/d를 계산하는 메소드
		return (double)arr[0][1]/arr[0][0] + (double)arr[1][1]/arr[1][0];
	}
	
	public static void rotation(int[][] arr) {	// 행렬을 회전하는 메소드
		int temp=0;
		temp = arr[0][0];
		arr[0][0] = arr[1][0];
		arr[1][0] = arr[1][1];
		arr[1][1] = arr[0][1];
		arr[0][1] = temp;
	}
}
