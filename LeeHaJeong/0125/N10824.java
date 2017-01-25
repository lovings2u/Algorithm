import java.util.Scanner;
public class N10824 {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		
		int n[] = new int[4];
		
		for(int i=0; i<4; i++)
			n[i] = kbd.nextInt();
		
		int index1 = 0;
		for(int i=1; ; i*=10){
			if(n[1]==0){
				index1++;
				break;
			}
			if(n[1]/i==0){
				break;
			}
			index1++;
		}
		
		int index2 = 0;
		for(int i=1; ; i*=10){
			if(n[3]==0){
				index2++;
				break;
			}
			if(n[3]/i==0){
				break;
			}
			index2++;
		}
				
				
		int ab = n[0]*(int)Math.pow(10, index1)+n[1];
		int cd = n[2]*(int)Math.pow(10, index2)+n[3];
		
		System.out.println(ab+cd);
	}
}
