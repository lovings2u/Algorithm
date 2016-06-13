import java.util.Scanner;

public class luckynum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int n=1,count=0,f,tobinaryint,tobinaryshift;
		String tobinary,luckynum,luckynum2;
	
		//어디그룹에 속하는지 알아보기위한 while문
		while(true){
			if((int)Math.pow(2, n)-1<=num&&num<(int)(Math.pow(2, n+1)-1)){
				break;
			}n++;
		}
		//자기 그룹에서의 초항이 2^n-1이고 마지막항이 2^n+1-2
		f=(int)Math.pow(2, n)-1;//f를 초항으로 설정
		for(int i=0;i<(int)Math.pow(2, n);i++){
			if(f==num){
				break;//입력한 수가 그룹에서 몇번째 자리인지 알아내기 위한 for문
			}f++;count++;
		}
		tobinary=Integer.toBinaryString(count);//자리 알아낸것을 2진수로 변환
		if(count<(Math.pow(2, n))/2){//쉬프트 연산자가 필요한아이들
			tobinaryint=Integer.parseInt(tobinary);//쉬프트연산자는 정수형이 가능하므로 스트링을 다시 정수로
			tobinaryshift=tobinaryint>>>n-1;//쉬프트연산자실행
			tobinary=Integer.toBinaryString(tobinaryshift);//다시 스트링
			luckynum=tobinary.replace("0", "4");//0을 4로 바꿈
			luckynum2=luckynum.replace("1", "7");//1을 7로 바꿈	
			
		}//시프트 연산자가 필요한 부분에서만 오류가 나네요 ㅠㅠㅠㅠㅠㅠㅠㅠ
		else{
		luckynum=tobinary.replace("0", "4");//0을 4로 바꿈
		luckynum2=luckynum.replace("1", "7");//1을 7로 바꿈
		}
		System.out.println(luckynum2);
		
		
		
	}

}
