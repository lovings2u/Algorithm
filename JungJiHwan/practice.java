import java.util.*;

class Tomato{
	int a, b, day;
	Tomato(int a, int b, int day){
		this.a = a;
		this.b = b;
		this.day = day;
	}
}

public class practice {
	static ArrayList<Tomato> box = new ArrayList<Tomato>();
	static int tray[][], front = 0, rear = -1, a, b, ans;
	static boolean canvisit[][];
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		tray = new int[a][b];
		canvisit = new boolean[a][b];
		for(int i = 0; i<a ; i++){
			for(int j = 0; j<b ; j++){
				tray[i][j] = sc.nextInt();
				if((tray[i][j] == -1)||(tray[i][j] == 1)) canvisit[i][j] = false; //-1�̰ų� 1�̸� �� �ʿ����.
				else canvisit[i][j] = true; 
			}
			System.out.println(i);
		}
		
		System.out.println(String.valueOf(bfs()));
	}
	
	public static int bfs(){
		boolean allclear = true;
		int lastday=0;
		for(int i = 0; i<=a ; i++){//�������丶�� �� '0'�� ������ Ȯ��(��� �丶�䰡 ���� ���·� ����)
			for(int j = 0; j<=b ; j++){
				if(tray[i][j]==1){//�;��ִ� ��� �丶�並 Ǫ���Ѵ�.
					push(new Tomato(i,j,0));//ù�� = 0;
				}
				else if(allclear&&(tray[i][j]==0)) allclear = false;//���� 1 �Ǵ� -1 �̸� if���� ���õȴ�.
			}
		}
		if(allclear) return 0;//���� if ���� ����Ǹ� �׳� ����ħ
		
		while(true){
			Tomato t = pop();//�� �� �� 4���� üũ �� Ǫ��
			if(t == null){
				break;
			}
			if(canvisit[t.a-1][t.b]&&(t.a!=0)){//�����ִ°�?&&�������ΰ�?
				push(new Tomato(t.a-1,t.b,t.day+1));
				canvisit[t.a-1][t.b] = false;
			}
			if(canvisit[t.a+1][t.b]&&(t.a!=(a-1))){//�Ʒ�
				push(new Tomato(t.a+1,t.b,t.day+1));
				canvisit[t.a+1][t.b] = false;
			}
			if(canvisit[t.a][t.b-1]&&(t.b!=0)){//����
				push(new Tomato(t.a,t.b-1,t.day+1));
				canvisit[t.a][t.b-1] = false;
			}
			if(canvisit[t.a][t.b+1]&&(t.b!=(b-1))){//������
				push(new Tomato(t.a,t.b+1,t.day+1));
				canvisit[t.a][t.b+1] = false;
			}
			lastday = t.day;
		}
		
		for(int i = 0; i<=a ; i++){//ť�� ����µ� ���� ���� �丶�䰡 �ִٸ�(��� �丶�䰡 ���� ���ϴ� ��Ȳ)
			for(int j = 0; j<=b ; j++){
				if(tray[i][j]==0) return -1;
			}
		}
		return lastday;
	}
	
	public static void push(Tomato t){//in-queue
		box.add(t);
		rear++;
	}
	public static Tomato pop(){//dequeue
		Tomato t = box.get(front);
		front++;
		return t;
	}
}
