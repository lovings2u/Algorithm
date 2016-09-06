package c0905;

import java.util.Scanner;

public class Line {

	static int num;
	static int Line[];
	static int max_h[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
			
		Line = new int[num+1];
		max_h = new int[num+1];
		
		Line[0]=-9999999;
		max_h[0]=0;
		
		for(int k=1;k<Line.length;k++)
			Line[k]=sc.nextInt();
		
		int max_height = check();
		//결과는 숫자의 갯수 - 이미 정돈된 수의 갯수
		System.out.println(num-max_height);
		
				
	}
	
	public static int check(){
		
		int max=0;
		int i,j;
		
		for(i=1; i<Line.length;i++){
			for(j=0;j<i;j++){
				if(Line[i]>Line[j] && max_h[i]<max_h[j]+1){
					max_h[i]=max_h[j]+1;
				}
			}
		} //각 인덱스까지의 최대 증가 수열 길이 저장
		
		for(i=1;i<Line.length;i++){
			if(max<max_h[i]){ //저장된것중 가장 긴것 찾기
				max = max_h[i];
			}
		}
		
		return max;
				
	}

}
