import java.util.Scanner;

public class cycling {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int [] road=new int[n];
		int i=0,j=1,gap=0,gap2=0;

		for(i=0;i<n;i++){
			road[i]=sc.nextInt();
		}
		for(i=1;i<n;i++){
			if(road[i]>road[i-1]){
				gap+=road[i]-road[i-1];
				
			}else{
				gap=0;
			}
			gap2=Math.max(gap, gap2);
		}
		
		System.out.println(gap2);		

}}

