import java.util.Scanner;
public class QuickSort {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int num[] = {5,3,7,6,2,1,4};
		int result[] = quickSort(num, 0, num.length-1);
		for(int i=0; i<result.length; i++)
			System.out.print(result[i]+" ");
	}
	
	public static int[] quickSort(int[] num, int left, int right){
		int numLen = num.length;
		int pivot = num[(left+right)/2];
		int i = left;
		int j = right;
		
		while(i<=j){
			while(num[i]<pivot)
				i++;
			while(num[j]>pivot)
				j--;
			
			if(i<=j){
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
				i++;
				j--;
			}
		}
		
		if(left<j)
			quickSort(num,left,j);
		if(i<right)
			quickSort(num,i,right);
		
		return num;
	}
}
