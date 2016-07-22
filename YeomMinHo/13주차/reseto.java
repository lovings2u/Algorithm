package reseto;
import java.util.Scanner;

public class reseto {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, inputNum;		// 입력 값
		int[] arr;				// 배열 입력 (2부터 num 까지)
		int arrNum = 2;			// 배열 내부에 들어가는 수
		int countD=0;
		int i=0;
		int multiNum=0;
		int result=0;
		int temp=0;
		
		num = sc.nextInt();
		inputNum = sc.nextInt();
		
		arr = new int[num-1];		// 입력 값에 따라 배열의 크기가 정해짐.
		
		for (int j=0 ; j<num-1 ; j++) {
			arr[j] = arrNum;			// 2부터 입력값 num까지 배열에 하나씩 입력. 
			arrNum++;
		}

		while (countD != inputNum) {
			if (arr[i] != 0) {
				temp = arr[i];	
				for (int j=0 ; j<num-1 ; j++) {
					if (arr[j] % temp == 0 && arr[j] !=0) {
						countD++;
						if (countD == inputNum) {			// 지금까지 count했던 수와 입력했던 inputNum과 같으면 while문 탈출
							result = arr[j];		// 마지막 값을 result에 입력.
							break;
						}
						arr[j] = 0;				// 이미 지나친 곳이면 0으로 값을 변경
					}
				}
			}
			
			i++;		// 0이 아닌 배열 안에 있는 최소 값의 배수를 정하기 위한 인수 i
		}
		
		System.out.println(result);
	}
}
