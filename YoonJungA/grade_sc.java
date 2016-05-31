package study5;

import java.util.Scanner;

public class grade_sc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score [] = new int[101]; 
		int finish=1000; int i=0;
		int grade[] = new int[5]; //차례대로 A,B,C,D,F
		
		while(finish!=-1){
			score[i]=sc.nextInt(); //입력과 동시에 배열 초기화
			finish = score[i];//-1이 입력으로 들어오면 멈추기위해
			i++; //인덱스 증가
		}
		for(int j=0;j<i-1;j++){
			//i-1까지인 이유는 while문의 마지막 입력에도 i가 증가해서
			switch(score[j]/10){
				case 10:
				case 9: grade[0]++; break; //A
				case 8: grade[1]++; break; //B
				case 7: grade[2]++; break; //C
				case 6: grade[3]++; break; //D
				default : grade[4]++; //F
			}
		}
		
		System.out.println(i-1); //입력된 점수의 수
		for(int j=0;j<grade.length;j++) //각 학점 인원 수
			System.out.println(grade[j]);
	}

}
