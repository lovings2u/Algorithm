import java.util.Scanner;
public class cycling {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int num = kbd.nextInt();
		int array[] = new int[num];
		int index = -1;
		int isIncrease = 0;
		int result = 0;
		int preResult = 0;
		int start = 0;
		int end = 0;
		
		for(int i=0; i<num; i++)
			array[i] = kbd.nextInt();
		
		while(index != (num-2)){
			index++;
			if(array[index] < array[index+1] && isIncrease == 0){
				isIncrease = 1;
				start = array[index];
				end = array[index+1];
			}else if(array[index] < array[index+1] && isIncrease == 1){
				end = array[index+1];
			}else if(array[index] >= array[index+1] && isIncrease == 1){
				result = end - start;
				isIncrease = 0;
				if(preResult > result)
					continue;
				else{
					preResult = result;
				}
			}else
				continue;
		}
		
		if(isIncrease == 1)
			if(preResult < end - start)
				preResult = end -start;
		
		System.out.println(preResult);
	}
}
