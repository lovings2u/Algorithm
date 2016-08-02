import java.util.Arrays;
import java.util.Scanner;

public class Coin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inputPrice;
		int[] coinNum= new int[6];
		int[] coinPrice = {500, 100, 50, 10, 5, 1};
		int resultSum=0;
		int[] resultNum = new int[6];
		int temp=0;
		int[] testArr = new int[6];
		
		inputPrice = sc.nextInt();
		
		for (int i=0 ; i<6 ; i++) {
			coinNum[i] = sc.nextInt();
			
			if ((inputPrice / coinPrice[i]) >= 1) {
				resultNum[i] = inputPrice / coinPrice[i];
				inputPrice = inputPrice % coinPrice[i];
				coinNum[i] -= resultNum[i];	// 더 채워 질 수 있는 coin 각 동전 개수
			}
		}

		while (true) {
			testArr = resultNum.clone();
			
			for (int i = 4 ; i>=0 ; i--) {
				temp = coinPrice[i+1] * coinNum[i+1] / coinPrice[i];
				
				if (resultNum[i] <= temp && resultNum[i] != 0) {
					resultNum[i+1] += coinPrice[i] * resultNum[i] / coinPrice[i+1];
					coinNum[i+1] -= coinPrice[i] * resultNum[i] / coinPrice[i+1];
					coinNum[i] += resultNum[i];
					resultNum[i] = 0;					
				} else if (resultNum[i] > temp && resultNum[i] != 0){
					resultNum[i+1] += coinPrice[i] * temp / coinPrice[i+1];
					coinNum[i+1] -= coinPrice[i] * temp / coinPrice[i+1];
					coinNum[i] += temp;	
					resultNum[i] -= temp;				
				}
			}			
			
			if (Arrays.equals(testArr, resultNum)) {
				break;
			}
			
		}

		
		for (int i=0 ; i<6 ; i++) {
			resultSum += resultNum[i];
		}
		
		System.out.println(resultSum);
		
		for (int i=0 ; i<6 ; i++) {
			System.out.print(resultNum[i] + " ");
		}
	}
}
