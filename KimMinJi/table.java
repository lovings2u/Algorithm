import java.util.Scanner;

public class table {//test3���� ������..

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
		d=b;}//�迭�� ������ �� �ֱ�
				
		for(i=0;i<4;i++){
			max=Math.max(max, cycle[i]);}//�ִ밪ã��
		for(i=0;i<4;i++){
			if(max==cycle[i]){
				System.out.println(i);//ȸ��Ƚ�����
				break;}//�ִ��� �ε���ã��,�ε���=ȸ��Ƚ��
			}
		}	
	}

