import java.util.Scanner;

public class Coci_tablica {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][2];
		double[] result = new double[4];
		double max=0; 
		int rotation_count=0;
		
		for(int j=1 ; j>=0 ; j--) {	// 2���� �迭 �Է�
			for(int i=0 ; i<2 ; i++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int k=0 ; k<4 ; k++) {	// ȸ���ϸ鼭 (a/c + b/d)�� ����Ͽ� result��� �迭�� �Է�
			if (calculate(arr) > max) {	// max���� ��ġ ã��
				max = calculate(arr);
				rotation_count = k;
			}
			
			rotation(arr);	// ȸ��
		}
		
		System.out.println(rotation_count);	// max���� �־��� ��ġ ���
	}
	
	public static double calculate(int[][] arr) {	// a/c + b/d�� ����ϴ� �޼ҵ�
		return (double)arr[0][1]/arr[0][0] + (double)arr[1][1]/arr[1][0];
	}
	
	public static void rotation(int[][] arr) {	// ����� ȸ���ϴ� �޼ҵ�
		int temp=0;
		temp = arr[0][0];
		arr[0][0] = arr[1][0];
		arr[1][0] = arr[1][1];
		arr[1][1] = arr[0][1];
		arr[0][1] = temp;
	}
}
