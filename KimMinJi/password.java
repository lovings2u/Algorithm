import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<String> alp = new ArrayList<String>();
		alp.add(0, " ");//������ 0
		alp.add(1, "a");alp.add(2, "b");
		alp.add(3, "c");alp.add(4, "d");
		alp.add(5, "e");alp.add(6, "a");
		alp.add(7, "g");alp.add(8, "h");
		alp.add(9, "i");alp.add(10, "j");
		alp.add(11, "k");alp.add(12, "l");
		alp.add(13, "m");alp.add(14, "n");
		alp.add(15, "o");alp.add(16, "p");
		alp.add(17, "q");alp.add(18, "r");
		alp.add(19, "s");alp.add(20, "t");
		alp.add(21, "u");alp.add(22, "v");
		alp.add(23, "w");alp.add(24, "x");
		alp.add(25, "y");alp.add(26, "z");//alp arraylist�� �ε����� ���ĺ� �Է�
		String sentence=sc.nextLine();//�򼭹� �Է¹���
		String password=sc.nextLine();//��ȣȭŰ �Է¹���
		String[] s=sentence.split("");//�򼭹� ����
		String[] p=password.split("");//��ȣȭŰ ����
		int [] pp=new int[p.length];//��ȣȭŰ���̸�ŭ �������迭����
		int [] ss=new int[s.length];//�򼭹� ���̸�ŭ �������迭����
		int [] result= new int[s.length];//��� ����� �迭,�򼭹����̸�ŭ �ʱ�ȭ
		
		for(int i=0;i<pp.length;i++){
			pp[i]=alp.indexOf(p[i]);}//��ȣȭŰ ���ڸ� ���ڷ� ����			
		
		for(int i=0;i<ss.length;i++){
			ss[i]=alp.indexOf(s[i]);}//�򼭹� ���ڸ� ���ڷ� ����			
		int n=0;
		for(int i=0;i<ss.length;i++){
			for(int j=0;j<pp.length;j++){
				result[n*pp.length+j]=ss[n*pp.length+j]-pp[j];//��ȣ�������
				if(result[n*pp.length+j]==-1*pp[j]){
					result[n*pp.length+j]=0;//�����̸� �������� ���
				}				
				else if(result[n*pp.length+j]<=0){
					result[n*pp.length+j]+=26;//���̰� 0���� �۾����� +26
				}									
			}
			i=(n+1)*pp.length+1;n++;}
		
		for(int i=0;i<result.length;i++){
			System.out.print(alp.get(result[i]));//�ε����� �ٽ� ���ڿ��� ���
		}	
	
	}
	}


