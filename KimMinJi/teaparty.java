import java.util.Scanner;

public class teaparty{//오류 

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int k = sc.nextInt();
		int result=0;
		
		if(k==1||k==2){
			result=0;
		}else if(k==3){
			result=1;
		}else if(k==4){
			result=2;
		}else{
			k=k-4;//수열의 시작을 1로 해주기위해 k-4\
			if(k%3==0){
				k=k/3;
				result=(3*k*k-k+2)+2*k*2;
			}else if(k%3==1){
				k=k/3+1;
				result=(3*k*k-k+2);
			}else if(k%3==2){//망함;;제가찾은 규칙이 틀리네요 ...
				k=k/3+1;
				result=(3*k*k-k+2)+2*k;
			}
				
		}
		System.out.println(result);
	}

}
