/*import java.util.Scanner;

public class midp {//test11에서 배열범위초과

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

import java.util.Scanner;

public class midp2 {//test11에서 시간초과 

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(),a=0;
		int[] x=new int[n];
		int[] y=new int[n];		
		
		for(int i=0;i<n;i++){
			x[i]=sc.nextInt();
			x[i]%=2;//입력되는수가 홀짝인지 알수있도록
			y[i]=sc.nextInt();
			y[i]%=2;
		}
		//1+1,0+0면 정수좌표 1+0이나0+1아면  정수좌표가 아님
		for(int i=0;i<n;i++){
			if(x[i]==0&&y[i]==0){
			for(int j=i+1;j<n;j++){
				if(x[j]==0&&y[j]==0){
				a++;}}}
			if(x[i]==1&&y[i]==1){
				for(int j=i+1;j<n;j++){
					if(x[j]==1&&y[j]==1){
					a++;}}}
			if(x[i]==0&&y[i]==1){
				for(int j=i+1;j<n;j++){
					if(x[j]==0&&y[j]==1){
					a++;}}}
			if(x[i]==1&&y[i]==0){
				for(int j=i+1;j<n;j++){
					if(x[j]==1&&y[j]==0){
					a++;}}}
		}
		
		System.out.println(a);	
	}

}
*/
import java.util.Scanner;

public class midp2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(),x0y0=0,x1y0=0,x1y1=0,x0y1=0;
		long a=0;
		int[] x=new int[n];
		int[] y=new int[n];		
		
		for(int i=0;i<n;i++){
			x[i]=sc.nextInt();
			x[i]%=2;//입력되는수가 홀짝인지 알수있도록
			y[i]=sc.nextInt();
			y[i]%=2;
		}
		//1+1,0+0면 정수좌표 1+0이나0+1아면  정수좌표가아님
		for(int i=0;i<n;i++){
			if(x[i]==0&&y[i]==0){x0y0++;}			
			if(x[i]==1&&y[i]==1){x1y1++;}				
			if(x[i]==0&&y[i]==1){x0y1++;}				
			if(x[i]==1&&y[i]==0){x1y0++;}
				
		}//각 경우의 수 별 조합을 더하면 총 개수
		a=(x0y0*(x0y0-1))/2+(x1y1*(x1y1-1))/2+(x0y1*(x0y1-1))/2+(x1y0*(x1y0-1))/2;
		System.out.println(a);	
	}

}

