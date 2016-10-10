import java.util.Scanner;
public class InsertionSort {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int num[] = {3,7,2,5,1,4};
		int result[] = insertionSort(num);
		for(int i=0; i<result.length; i++)
			System.out.print(result[i]+" ");
	}
	
	public static int[] insertionSort(int[] num){
		for(int i=1; i<num.length; i++){
			int temp = num[i];
			int pre = i-1;
			while(pre>=0 && num[pre]>temp){
				num[pre+1] = num[pre];
				pre--;
			}
			num[pre+1] = temp;
		}
		return num;
	}
}
