import java.util.Scanner;
public class LineSet {
	static int student[];
	static int num;
	
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		num = kbd.nextInt();
		student = new int[num+1];
		student[0] = -Integer.MAX_VALUE;
		for(int i=1; i<=num; i++)
			student[i] = kbd.nextInt();	
		
		int result = longest_increase();//최장 증가 부분 수열 찾기 함수 호출
		System.out.println((int)(num-result));
	}
	
	public static int longest_increase(){
		int max = 0;
		int i,j;
		
		int h[] = new int[num+1];//부분 수열의 길이
		int p[] = new int[num+1];//전 값의 인덱스
		
		int index = 0;
		
		for(i=1; i<num+1; i++){
			for(j=0; j<i; j++){
				if(student[i]>student[j] && h[i]<h[j]+1){//증가 수열이고 현재까지 최장 증가 길이면
					h[i] = h[j]+1;//최장 증가 길이 1 증가
					p[i] = j;//전 원소의 인덱스를 저장
				}
			}
		}
		
		for(i=0; i<num+1; i++){//최대 부분 수열의 길이 찾기
			if(max<h[i]){
				max = h[i];
				index = i;
			}
		}
		
		int list[] = new int[num+1];//최대 부분 수열을 저장하는 배열
		i = max;
		
		while(index != 0){//index가 0이 될 때까지 탐색
			list[--i] = student[index];
			index = p[index];
		}
		return max;
	}
}
