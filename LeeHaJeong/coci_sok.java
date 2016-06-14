import java.util.Scanner;
public class coci_sok {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		
		int juice [] = new int[3];
		for(int i=0; i<3; i++)
			juice[i] = kbd.nextInt();
		
		int ratio [] = new int [3];
		for(int i=0; i<3; i++)
			ratio[i] = kbd.nextInt();
		
		double result [] = new double[3];
		
		int max = 0;
		int max_index = 0;
		while(true){
			for(int i=0; i<3; i++)
				if(max < ratio[i]){
					max = ratio[i];
					max_index = i;
				}
			double x = juice[max_index]/(double)max;
			for(int i=0; i<3; i++){
				result[i] = juice[i] - x*ratio[i];
			}
			for(int i=0; i<3; i++){
				if(result[i] < 0)
			}
		}
		double x = juice[max_index]/(double)max;
		System.out.println(x);
		for(int i=0; i<3; i++){
			double result = juice[i] - x*ratio[i];
			if(result%1 == 0)
				System.out.printf("%d : %d ",i,(int)result);
			else
				System.out.printf("%d : %.7f ",i, result);
		}
		
		
		
		
		
		
	}
}
