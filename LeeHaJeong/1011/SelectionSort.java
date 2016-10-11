import java.util.Scanner;
public class SelectionSort {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int num[] = {9,1,6,8,4,3,2,0};
		int result[] = selectionSort(num);
		for(int i=0; i<result.length; i++)
			System.out.print(result[i]+" ");
	}
	public static int[] selectionSort(int[] num){
		int numLen = num.length;
		
		for(int i=0; i<numLen-1; i++){
			int min = num[i];
			int minIndex = i;
			for(int j=i+1; j<numLen; j++){
				if(min > num[j]){
					minIndex = j;
					min = num[j];
				}
			}
			swap(num, i, minIndex);
		}
		return num;
	}
	
	public static void swap(int[] num, int index1, int index2){
		int temp = num[index1];
		num[index1] = num[index2];
		num[index2] = temp;
	}
}
