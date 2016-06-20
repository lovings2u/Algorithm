import java.util.Scanner;

public class midp {//test11에서 시간초과 수정예정 ㅇㅇ

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(),a=0,count=0;
		int[] x=new int[n];
		int[] y=new int[n];
		double[] midx=new double[n*(n-1)/2];
		double[] midy=new double[n*(n-1)/2];
		
		for(int i=0;i<n;i++){
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				midx[a]=(double)(x[i]+x[j])/2;
				midy[a]=(double)(y[i]+y[j])/2;
				a++;
				}		
		}
		for(int i=0;i<n*(n-1)/2;i++){
			midx[i]=midx[i]/(int)midx[i];
			midy[i]=midy[i]/(int)midy[i];	
		if(midx[i]!=1||midy[i]!=1){}
		else{count++;}}
		System.out.println(count);	
	}

}
