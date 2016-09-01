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
		
		int result = longest_increase();//���� ���� �κ� ���� ã�� �Լ� ȣ��
		System.out.println((int)(num-result));
	}
	
	public static int longest_increase(){
		int max = 0;
		int i,j;
		
		int h[] = new int[num+1];//�κ� ������ ����
		int p[] = new int[num+1];//�� ���� �ε���
		
		int index = 0;
		
		for(i=1; i<num+1; i++){
			for(j=0; j<i; j++){
				if(student[i]>student[j] && h[i]<h[j]+1){//���� �����̰� ������� ���� ���� ���̸�
					h[i] = h[j]+1;//���� ���� ���� 1 ����
					p[i] = j;//�� ������ �ε����� ����
				}
			}
		}
		
		for(i=0; i<num+1; i++){//�ִ� �κ� ������ ���� ã��
			if(max<h[i]){
				max = h[i];
				index = i;
			}
		}
		
		int list[] = new int[num+1];//�ִ� �κ� ������ �����ϴ� �迭
		i = max;
		
		while(index != 0){//index�� 0�� �� ������ Ž��
			list[--i] = student[index];
			index = p[index];
		}
		return max;
	}
}
