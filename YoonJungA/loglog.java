package study6;

import java.util.Scanner;

public class loglog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //통나무 개수
		int bottom, temp, top;
		int allnum=0; //현재까지의 통나무 개수 체크 변수
		boolean b=true;
		int fbottom=0; int ftop=0;
		bottom=1;	 //최하단은 1부터 증가 시켜 준다.
		
		while(b){

			temp=bottom; //최상단은 최하단의 개수부터 감소시켜준다.
			while(temp>0){ //최상단의 갯수가 0보다 클때까지만 반복한다. 
			
				allnum += temp; //현재까지 통나무의 개수를 check한다.
				if(allnum==N){//만약 입력받은 통나무개수와 같아지면
					fbottom=bottom;
					ftop=temp;
					temp=-100;
					b=false;					
				}
				else if(allnum>N){//통나무 개수보다 커지면
					fbottom=bottom;
					ftop=N-(allnum-temp);
					temp=-100;
					b=false;
				}
				else temp--;
			}			
			
			bottom++;
		}
		System.out.println(fbottom+" "+ftop);
	}
}

