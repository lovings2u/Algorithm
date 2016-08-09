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
				if((tray[i][j] == -1)||(tray[i][j] == 1)) canvisit[i][j] = false; //-1이거나 1이면 들어갈 필요없다.
				else canvisit[i][j] = true; 
			}
			System.out.println(i);
		}
		
		System.out.println(String.valueOf(bfs()));
	}
	
	public static int bfs(){
		boolean allclear = true;
		int lastday=0;
		for(int i = 0; i<=a ; i++){//안익은토마토 즉 '0'이 없는지 확인(모든 토마토가 익은 상태로 주입)
			for(int j = 0; j<=b ; j++){
				if(tray[i][j]==1){//익어있는 모든 토마토를 푸시한다.
					push(new Tomato(i,j,0));//첫날 = 0;
				}
				else if(allclear&&(tray[i][j]==0)) allclear = false;//전부 1 또는 -1 이면 if문이 무시된다.
			}
		}
		if(allclear) return 0;//위의 if 문이 실행되면 그냥 지나침
		
		while(true){
			Tomato t = pop();//팝 한 뒤 4방위 체크 후 푸시
			if(t == null){
				break;
			}
			if(canvisit[t.a-1][t.b]&&(t.a!=0)){//막혀있는가?&&맨윗줄인가?
				push(new Tomato(t.a-1,t.b,t.day+1));
				canvisit[t.a-1][t.b] = false;
			}
			if(canvisit[t.a+1][t.b]&&(t.a!=(a-1))){//아래
				push(new Tomato(t.a+1,t.b,t.day+1));
				canvisit[t.a+1][t.b] = false;
			}
			if(canvisit[t.a][t.b-1]&&(t.b!=0)){//왼쪽
				push(new Tomato(t.a,t.b-1,t.day+1));
				canvisit[t.a][t.b-1] = false;
			}
			if(canvisit[t.a][t.b+1]&&(t.b!=(b-1))){//오른쪽
				push(new Tomato(t.a,t.b+1,t.day+1));
				canvisit[t.a][t.b+1] = false;
			}
			lastday = t.day;
		}
		
		for(int i = 0; i<=a ; i++){//큐가 비었는데 익지 않은 토마토가 있다면(모든 토마토가 익지 못하는 상황)
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
