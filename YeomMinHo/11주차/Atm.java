import java.util.Arrays;
import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pNum;
		int sum=0, temp=0;;
		
		pNum = sc.nextInt();
		int[] arr = new int[pNum];
		
		for (int i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
//		arr = bubbleSort(arr);
		Arrays.sort(arr);
		
		for (int i=0 ; i<arr.length ; i++) {
			temp += arr[i];
			sum += temp;
		}
		System.out.println(sum);
	}
	
//	public static int[] bubbleSort(int[] arr) {
//		for(int i=0; i<arr.length-1; i++) {             // 10개의 값이 있으면 두 개의 값을 비교하는 과정은 9번만 진행한다   
//			for(int j=0; j<(arr.length-i)-1; j++) {     //가장 큰 값을 뒤로 보내면 마지막 값 고정이되는데 i++만큼 증가하므로 -i 해준다
//			
//				if(arr[j] > arr[j+1])        //가장 큰값을 뒤로 보내준다
//				{
//					int tmp = arr[j+1];
//					arr[j+1] = arr[j];
//					arr[j] = tmp;
//				}	
//			}
//		}
//		
//		return arr;
//	}
}
