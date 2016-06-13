//시간 초과....
//
//import java.util.Scanner;
//
//public class Luckynum {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num;
//		int p=0;
//		int count=0;
//		String binary="";
//		int gap=0;
//		
//		num = sc.nextInt();
//		
//		while (count!=num) {
//			for(int i=0 ; i<Math.pow(2, p+1) ; i++) {
//				count++;
//				
//				if (count == num) {	//	입력된 num과 반복하고 있는 count의 값이 같으면 while문에서 빠져나감.
//					binary = String.valueOf(i);	//	p번째에서 i번째의 값을 binary에 입력 (p는 자리수, i는 그 자리수에서의 몇번 째인지)
//					break;
//				}
//			}
//			
//			p++;
//		}
//
//		//2진수 변환
//		binary = Integer.toBinaryString(Integer.valueOf(binary));
//		
//		gap = p-binary.length();	// binary 스트링에 0이 몇개 들어가야하는지 gap을 계산
//		if(binary.length() != p) {	//	자리수(p)가 맞지 않으면 0을 더해 줌 - 예를 들어 011 을 표현할 때 11로 표현되므로 0을 앞에다 붙여줌.
//			for(int i=0 ; i< gap ; i++) {
//				binary = "0"+ binary;
//			}
//		}
//		
//		binary = binary.replace('0', '4');	//	0 문자를 4로 변경
//		binary = binary.replace('1', '7');	//	1 문자를 7로 변경
//		
//		System.out.println(binary);
//	}
//}

import java.util.Scanner;

public class Luckynum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int sum=0;
		int n=1;
		int count=0;
		String binary="";
		int gap=0;
		
		num = sc.nextInt();
		
		while (num > Math.pow(2,n+1)) {
			sum += Math.pow(2,n);
			n++;
		}

		//숫자를 String 형으로 변환
		binary = String.valueOf(num-sum-1);
		//2진수 변환
		binary = Integer.toBinaryString(Integer.valueOf(binary));
		
		gap = n-binary.length();	// binary 스트링에 0이 몇개 들어가야하는지 gap을 계산
		if(binary.length() != n) {	//	자리수(p)가 맞지 않으면 0을 더해 줌 - 예를 들어 011 을 표현할 때 11로 표현되므로 0을 앞에다 붙여줌.
			for(int i=0 ; i< gap ; i++) {
				binary = "0"+ binary;
			}
		}
		
		binary = binary.replace('0', '4');	//	0 문자를 4로 변경
		binary = binary.replace('1', '7');	//	1 문자를 7로 변경
		
		System.out.println(binary);
	}
}