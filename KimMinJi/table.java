import java.util.Scanner;

public class table {//test3부터 오류남..

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
		int [] cycle=new int [4];
		int max=-1,i=0;
		
		for(i=0;i<4;i++){
		cycle[i]=(a/c)+(b/d);
		a=c;
		b=a;
		c=d;
		d=b;}//배열에 각각의 값 넣기
				
		for(i=0;i<4;i++){
			max=Math.max(max, cycle[i]);}//최대값찾기
		for(i=0;i<4;i++){
			if(max==cycle[i]){
				System.out.println(i);//회전횟수출력
				break;}//최댓값의 인덱스찾기,인덱스=회전횟수
			}
		}	
	}

