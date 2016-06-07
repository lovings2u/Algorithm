package study6;

import java.util.Scanner;

public class dfreq {

	public static void main(String[] args) { //수의 빈도수
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt(); //조사할 수
		int check=sc.nextInt(); //체크 할 한 자리수
		int count=0;
		StringBuffer st = new StringBuffer();
		
		for(int i=1;i<N+1;i++)	st.append(i);
		
		for(int j=0;j<st.length();j++){
			String str = Character.toString(st.charAt(j));
			if(str.equals(Integer.toString(check))) count++;
		}
		
		
		System.out.println(st+" "+count);
	
		
		
		
	}

}
