import java.util.Scanner;

public class insubunE {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt(),b=sc.nextInt();
		int i,d=a*a-4*b;//d는 판별식
		
		for(i=1;i<1100;i++){
			if(d<0){
				System.out.println("impossible");//판별식,허근이면 불가능
				break;}
			else if(d==0){i=0;break;}//d===0이면 완전제곱식이기 때문에 i도 0이어서 i=0으로 초기화(1부터시작해서)
			else if((double)d/i==(int)i){//판별식이 제곱수여야 답이 정수로나옴
					break;}
		}
		if(i<1100){System.out.println("(x-"+((a-i)/2)+")(x-"+((a+i)/2)+")");}//for문에해당
		else{System.out.println("impossible");}//for문에 해당이안되면 역시 impossible
}}
