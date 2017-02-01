import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LIS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case = 0;
		int temp = 0;
		int lengthA = 0, lengthB = 0;
		List listA = new ArrayList();
		List listB = new ArrayList();
		LIS lis = new LIS();
		
		test_case = sc.nextInt();
		
		while (temp < test_case) {
			lengthA = sc.nextInt();
			lengthB = sc.nextInt();
			listA.clear(); 
			listB.clear();	// list 초기화
			
			for(int i=0 ; i<lengthA ; i++) {
				listA.add(sc.nextInt());
			}
			for(int i=0 ; i<lengthB ; i++) {
				listB.add(sc.nextInt());
			}
			
			listA.addAll(listB);	// 두 개의 리스트를 합친다.
			
			lis.LISalgorithm(listA);
			
			temp++;
		}
	}
	
	void LISalgorithm(List list) {
		//list : 수열, number : 갯수, pos : 위치, path : 경로저장
		int[] number = new int[list.size()];
		int[] pos = new int[list.size()];
		int[] path = new int[list.size()];
		int n=0 , cnt=0;
		int mmax=0, idx=0;
		
		Arrays.fill(pos, -1);	// 메모리 초기화, pos 배열을 전부 -1로 초기화
		
		for(int i=0 ; i<list.size() ; i++) {
			//자신 부터 시작해도 1개이므로 1개로 초기화
			number[i] = 1;
			
			for(int j=0 ; j<i ; j++) {
				//자신의 현재 값보다 작으면서 (a[i]>a[j])
				//갯수가 최대인 값 찾기
				if((int)list.get(j) < (int)list.get(i) && number[i] < number[j] + 1) {
				    //갯수 갱신
					number[i] = number[j] + 1;
				    //위치 갱신
					pos[i] = j;
				}
			}
			
			//최대 개수 위치와 갯수 저장
			if(mmax < number[i]) {
				mmax = number[i];
				idx = i;
			}
		}
			
		//최대 개수인 경우의 수열 역추적
		path[cnt++] = idx;
		while(pos[idx] != -1) {
			path[cnt++] = pos[idx];
			idx = pos[idx];
		}
			
		//경로 출력
		for(int i=cnt-1 ; i>= 0 ; i--) {
			System.out.print(list.get(path[i]) + " ");
		}
		
		System.out.println("");
		//LIS 길이 출력
		System.out.println(mmax);
	}
}
// http://blog.naver.com/PostView.nhn?blogId=infoefficien&logNo=220013754482&parentCategoryNo=&categoryNo=176&viewDate=&isShowPopularPosts=true&from=search 참고.... 했음... 모르겠음....


//import java.util.Scanner;
//
//public class LIS {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int test_case = 0;
//		int temp = 0;
//		int lengthA = 0, lengthB = 0;
//		int[] arrA, arrB;
//		int[] result;
//		
//		test_case = sc.nextInt();
//		result = new int[test_case];
//		
//		while (temp < test_case) {
//			lengthA = sc.nextInt();
//			lengthB = sc.nextInt();
//			
//			arrA = new int[lengthA];
//			arrB = new int[lengthB];
//			
//			for(int i=0 ; i<lengthA ; i++) {
//				arrA[i] = sc.nextInt();
//			}
//			for(int i=0 ; i<lengthB ; i++) {
//				arrB[i] = sc.nextInt();
//			}
//			
//			result[temp] = arrA.length + arrB.length;
//			
//			for(int i=0 ; i<arrA.length ; i++) {
//				for(int j=0 ; j<arrB.length ; j++) {
//					if(arrA[i] == arrB[j]) {
//						result[temp] -= 1;
//					}
//				}
//			}
//			
//			temp++;
//		}
//		
//		for(int i=0 ; i<test_case ; i++) {
//			System.out.println(result[i]);
//		}
//
//	}
//}