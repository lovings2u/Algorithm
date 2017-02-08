package JungOl;

import java.util.Scanner;

public class Q2112 {
	public static void main(String[] args) {new Q2112();}
	public Q2112() {
		int index = new Scanner(System.in).nextInt();
		if(index%2 == 1) System.out.println(0);
		else{
			index /= 2;
			int arr[] = new int[index];
			arr[0] = 3;
			arr[1] = 11;
			
			for(int i = 2; i<index; i++){
				int a = 1;
				for(int j = 0; j<i-1; j++){
					a += arr[j];
				}
				arr[i] = 3*arr[i-1] + 2*a;
			}
			System.out.println(arr[index-1]);
		}
	}
}