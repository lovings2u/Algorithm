import java.util.Scanner;

public class tpz {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int max=101,min,sum=0;
		int []species =new int [3];

		for(int i=0;i<3;i++){
			species[i]=sc.nextInt();
			sum+=species[i];
			max=Math.min(max, species[i]);//입력받은수의 최소값이 max
		}
		min=sum-2*n;//최대값구하기
		if(min<=0){min=0;}//0이하면 최소값 0
		System.out.println(max+" "+min);
	}

}
