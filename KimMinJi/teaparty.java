import java.util.Scanner;

public class teaparty{//���� 

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
			k=k-4;//������ ������ 1�� ���ֱ����� k-4\
			if(k%3==0){
				k=k/3;
				result=(3*k*k-k+2)+2*k*2;
			}else if(k%3==1){
				k=k/3+1;
				result=(3*k*k-k+2);
			}else if(k%3==2){//����;;����ã�� ��Ģ�� Ʋ���׿� ...
				k=k/3+1;
				result=(3*k*k-k+2)+2*k;
			}
				
		}
		System.out.println(result);
	}

}
