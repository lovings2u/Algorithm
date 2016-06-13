import java.util.Scanner;

public class complete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int com=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				com+=i;//나누어떨어지면 약수니깐 더함
			}
		}
		if(n!=1&&com==n){//더한거랑 입력한거랑 같은수면 완전수니깐,1은 제외 
			System.out.println("yes");
		}else{
			System.out.println("no");
		}

	}

}
