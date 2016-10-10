import java.util.Scanner;
public class BubbleSort {
	public static void main(String[] args){
		int num[] = {2,7,9,3,4,1,6,5,8};
		int result[] = bubbleSort(num);
		for(int i=0; i<result.length; i++)
			System.out.print(result[i]+" ");
		
	}
	
	public static int[] bubbleSort(int[] num){
		int numLen = num.length;
		for(int i=numLen-1; i>0; i--){
			for(int j=0; j<i; j++){
				if(num[j]>num[j+1])
					swap(num,j,j+1);
			}
		}
		return num;
	}
	
	public static void swap(int[] num, int index1, int index2){
		int temp = num[index1];
		num[index1] = num[index2];
		num[index2] = temp;
	}
}
