// OutOfMemoryError ����
//
//import java.util.Scanner;
//
//public class Dfreq {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n, num;
//		int count=0;
//		
//		n = sc.nextInt();
//		num = sc.nextInt();
//		
//		StringBuffer sb = new StringBuffer();
//		
//		for(int i=1 ; i<=n ; i++) {
//			sb.append(i);
//		}
//		
//		for(int j=0 ; j<sb.length() ; j++ ) {
//			if (sb.charAt(j) == (char)(num+48)) {	// �����ڵ� (1�� �����ڵ�� 49)
//				count++;
//			}
//		}
//		
//		System.out.println(count);
//	}
//}


// �ð��ʰ� - 65330339 3
//
//import java.util.Scanner;
//
//public class Dfreq {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n, num;
//		int count=0;
//		
//		n = sc.nextInt();
//		num = sc.nextInt();
//		
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i=1 ; i<=n ; i++) {
//			sb.append(i);
//			for (int j=0 ; j<sb.length() ; j++) {
//				if (sb.charAt(j) == (char)(num+48)) {	// �����ڵ� (1�� �����ڵ�� 49)
//					count++;
//				}
//			}
//			sb.delete(0, sb.length());
//		}
//		
//		System.out.println(count);
//	}
//}


// ����...... �̰͵� ����...
import java.util.Scanner;

public class Dfreq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, num;
		int count=0;
		
		n = sc.nextInt();
		num = sc.nextInt();
		
		for (int i=1 ; i<=n ; i++) {
			int temp = i;
			for(double j=Math.pow(10, String.valueOf(i).length()) ; j>=10 ; j/=10) {
				if (temp/(int)j == num) {
					count++;
				}
				if (temp%(int)j == num) {
					count++;
				}
				temp = temp%(int)j;
			}
		}

		System.out.println(count);
	}
}






