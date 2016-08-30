package snippet;

import java.util.Scanner;
import java.util.Stack;

public class toptop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int [n];
		int [] h=new int [n];
		int [] w=new int [n];
		int [] c=new int [n];
		int [] hs=new int [n];
		int count=1,height=0,area=0,weight=0;
		Stack visit =new Stack();
		Stack counts = new Stack();
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();//밑넓이
			h[i]=sc.nextInt();//높이
			w[i]=sc.nextInt();//무게
			c[i]=i+1;
		}//정보 입력받음 밑넓이 높이 번호순서대로.
		
		for(int i=0;i<n;i++){
			count=1;
			area=a[i];
			weight=w[i];
			height=h[i];
			visit.push(c[i]);//바닥 값을 지정해놓고 위에쌓아올릴것들 비교할예정 
			
			int k=i+1;//바닥에 깔아놓은 다음값들부터 비교시작
			
			while(k!=n){//계속 쌓아올릴것
				
				if(weight>w[k]&&area>a[k]){
					count++;//쌓아지니까 카운트올림
					height+=h[k];//높이더함
					area=a[k];//바닥 바뀌니까 면적 높이 무게 체인지
					weight=w[k];
					height=h[k];
					visit.push(c[k]);//쌓인 번호 푸쉬
					k++;//다음비교를 위해 k값 올림
				}else{
					k++;//쌓아지지 않으니 다음으로 넘어가야해서 k값 올림
				}
				
			}
			hs[i]=height;//일단 높이저장
			counts.push(count);
			height=0;//높이 0으로 초기화
			if(i-1>=0&&hs[i-1]>hs[i]){//이전 높이와 높이 비교
				counts.pop();//버리고
				for(int j=0;j<count;j++){visit.pop();}//높이가 이전이 크면 카운트만큼 쌓은거 버림
			}
			
			
		}
		count=(int) counts.pop();
		System.out.println(count);
		for(int j=0;j<count;j++){
			System.out.println(visit.pop());
		}
		

	}

}
