import java.util.Scanner;

public class PhoneCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String phoneNumber;
		int plusNumber;
		int inputDummyNum;
		int dummyCount=0;
		int count = 1;
		int index = 0;
		int tempResult=0;
		String result = "";
		boolean numberCheck = true;

		phoneNumber = sc.next();
		plusNumber = sc.nextInt();
		inputDummyNum = sc.nextInt();

		for (int i = 0; i < phoneNumber.length(); i++) {

			dummyCount++;								// - 사이의 숫자더미가 몇 자리 수인지 저장하는 변수
			
			if (phoneNumber.charAt(i) == '-') {
				count++;							// 숫자 더미의 위치 count
				dummyCount=0;
				if (count == inputDummyNum) {
					index = i+1;					// 입력받은  숫자더미 위치를 index 변수에 저장
				}
			}
			
			if (dummyCount > 4) {					// 숫자 더미 크기가 4보다 크면 for문 탈출
				numberCheck = false;
				break;
			}
		}
		
		if ( numberCheck == false) {				// 숫자 더미 크기가 4보다 크면  false, 4보다 작으면 true
			System.out.println("INPUT ERROR!");	// 결과 출력
		} else {
			while (true) {			// 받은 숫자 더미 위치에서 각 자리에 더해질 숫자(plusNumber)를 더함.
				if (index == phoneNumber.length() || phoneNumber.charAt(index) == '-') {
					break;
				}
				
				tempResult = (int)(phoneNumber.charAt(index) - 48) + plusNumber;
				if (tempResult >= 10) {
					tempResult = tempResult - 10;
				}
				
				result = result.concat(String.valueOf(tempResult));
				index++;
			}

			
			if (result.length() < 4) {	// 결과 출력
				for (int i = 4 - result.length() ; i > 0 ; i--) {
					result = (String.valueOf(plusNumber)).concat(result);
				}
				System.out.println(result);
			} else {
				System.out.println(result);
			}
		}
	}
}
