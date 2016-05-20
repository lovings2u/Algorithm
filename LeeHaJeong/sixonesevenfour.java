import java.util.Scanner;

public class sixonesevenfour {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int year = kbd.nextInt();
		int index = 0;
		int temp = 0;
		int array1[] = new int[4];
		int array2[] = new int[4];
		
		while(year != 6174){
			
			array1[0] = (year/1000);
			year = year%1000;
			array1[1] = (year/100);
			year = year%100;
			array1[2] = (year/10);
			year = year%10;
			array1[3] = year;
		
			for(int i=0; i<3; i++){
				for(int j=0; j<3; j++){
					if(array1[j]>array1[j+1]){
						temp = array1[j];
						array1[j] = array1[j+1];
						array1[j+1] = temp;					
					}
				}
			}
			
			for(int i=3; i>=0; i--){
				array2[i] = array1[3-i];
			}
			
			int min = array1[0]*1000 + array1[1]*100 + array1[2]*10 + array1[3];
			int max = array2[0]*1000 + array2[1]*100 + array2[2]*10 + array2[3];
			
			year = max - min;			
			index++;
		}
		
		System.out.println(index);
		
		
	}
}
