import java.util.Scanner;

public class Sc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=0,B=0,C=0,D=0,F=0;
		int count=0;
		int score[] = new int[100];
		
		for (int i=0 ; i<100 ; i++) {	// 데이터 입력
			score[i] = sc.nextInt();
			if(score[i] == -1) {	// 데이터 입력이 -1이면 입력 종료
				break;
			}
			count++;	// 입력 갯수
		}

//		for (int i=0 ; i<count ; i++) {
//			if (score[i] >=90) {
//				A++;
//			} else if (score[i] >= 80) {
//				B++;
//			} else if (score[i] >=70) {
//				C++;
//			} else if (score[i] >=60) {
//				D++;
//			} else {
//				F++;
//			}	
//		}

		for(int i=0 ; i<count ; i++) {
			switch(score[i]/10) {
			case 10 : A++; break;
			case 9  : A++; break;
			case 8  : B++; break;
			case 7  : C++; break;
			case 6  : D++; break;
			default : F++; break;
			}
		}
		
		System.out.println(count);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		System.out.println(F);
	}
}
