package snippet;

import java.util.Scanner;
import java.util.Stack;

public class toptop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int [n];
		int [] h=new int [n];
		int [] w=new int [n];
		int [] c=new int [n];
		int [] hs=new int [n];
		int count=1,height=0,area=0,weight=0;
		Stack visit =new Stack();
		Stack counts = new Stack();
		
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();//�س���
			h[i]=sc.nextInt();//����
			w[i]=sc.nextInt();//����
			c[i]=i+1;
		}//���� �Է¹��� �س��� ���� ��ȣ�������.
		
		for(int i=0;i<n;i++){
			count=1;
			area=a[i];
			weight=w[i];
			height=h[i];
			visit.push(c[i]);//�ٴ� ���� �����س��� �����׾ƿø��͵� ���ҿ��� 
			
			int k=i+1;//�ٴڿ� ��Ƴ��� ����������� �񱳽���
			
			while(k!=n){//��� �׾ƿø���
				
				if(weight>w[k]&&area>a[k]){
					count++;//�׾����ϱ� ī��Ʈ�ø�
					height+=h[k];//���̴���
					area=a[k];//�ٴ� �ٲ�ϱ� ���� ���� ���� ü����
					weight=w[k];
					height=h[k];
					visit.push(c[k]);//���� ��ȣ Ǫ��
					k++;//�����񱳸� ���� k�� �ø�
				}else{
					k++;//�׾����� ������ �������� �Ѿ���ؼ� k�� �ø�
				}
				
			}
			hs[i]=height;//�ϴ� ��������
			counts.push(count);
			height=0;//���� 0���� �ʱ�ȭ
			if(i-1>=0&&hs[i-1]>hs[i]){//���� ���̿� ���� ��
				counts.pop();//������
				for(int j=0;j<count;j++){visit.pop();}//���̰� ������ ũ�� ī��Ʈ��ŭ ������ ����
			}
			
			
		}
		count=(int) counts.pop();
		System.out.println(count);
		for(int j=0;j<count;j++){
			System.out.println(visit.pop());
		}
		

	}

}
