import java.util.ArrayList;
import java.util.Scanner;
public class WatchingPeople {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		
		final double PI = 3.141;
		int result = 0;
		int people = kbd.nextInt();
		
		ArrayList<double[]> p_locate = new ArrayList<double[]>(); 
				
		double radar1_x = kbd.nextDouble();
		double radar1_y = kbd.nextDouble();
		
		double radar2_x = kbd.nextDouble();
		double radar2_y = kbd.nextDouble();
		
		double K = kbd.nextDouble() / PI;
		
		for(int i=0; i<people; i++){
			double temp[] = new double[2];
			temp[0] = kbd.nextDouble();
			temp[1] = kbd.nextDouble();
			p_locate.add(temp);	
		}
		
		double r1 = 0;
		double r2 = 0;	
		
		while(true){
			double min1 = 999999999;
			double min2 = 999999999;
			
			int index1 = 0;
			int index2 = 0;
			
			for(int i=0; i<p_locate.size(); i++){
				double temp1 = distance(p_locate.get(i), radar1_x, radar1_y);
				if(min1 > temp1){
					min1 = temp1;
					index1 = i;
				}
			}
			
			for(int i=0; i<p_locate.size(); i++){
				double temp2 = distance(p_locate.get(i), radar2_x, radar2_y);
				if(min2 > temp2){
					min2 = temp2;
					index2 = i;
				}	
			}
			
			
			if(min1 > min2)//radar2
				r2 = min2;
			else
				r1 = min1;
			
			if(Math.pow(r1, 2)+ Math.pow(r2, 2) <= K){
				if(min1 > min2){//radar2
					p_locate.remove(index2);
					result++;
				}else{//radar1
					p_locate.remove(index1);
					result++;
				}
			}else
				break;
				
		}	
		System.out.println((int)people-result);
	}
	
	public static double distance(double[] p_lo, double x_rd, double y_rd){
		double result = 0;
		result = Math.pow(p_lo[0]-x_rd,2) + Math.pow(p_lo[1]-y_rd, 2);
		result = Math.sqrt(result);
		return result;
	}
}
