import java.util.*;

class Robot{
	int a, b, look, time;
	Robot(int a, int b, int look, int time){
		this.a = a;
		this.b = b;
		this.look = look;
		this.time = time;
	}
}

public class Q1006robot {
	static ArrayList<Robot> r = new ArrayList<>();
	static int god, duf, front = 0, rear = -1, leasttime = 10000, gravity[][];
	static boolean canvisit[][], isfirst = true;
	static Robot end;
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		god = sc.nextInt();
		duf = sc.nextInt();
		canvisit = new boolean [god][duf];
		gravity = new int [god][duf];
		for(int i = 0; i<god; i++){
			for(int j = 0; j<duf; j++){
				int k = sc.nextInt();
				if(k==0) canvisit[i][j] = true;
			}
		}
		System.out.println("");
//		for(int i = 0; i<god; i++){
//			for(int j = 0; j<duf; j++){
//				System.out.print(canvisit[i][j]+"\t");
//			}
//			System.out.println("");
//		}
		push(sc.nextInt()-1, sc.nextInt()-1, sc.nextInt(), 0);
		end = new Robot(sc.nextInt()-1, sc.nextInt()-1, sc.nextInt(), 0);
		System.out.println(String.valueOf(bfs()));
	}
	
	static int bfs(){
		int k = 0;
		while(k<99999){
			k++;
			Robot robot = pop();
			if(robot == null) return leasttime;
			
			int a = robot.a, b = robot.b, look = robot.look, time = robot.time;
			
			if((a == end.a) && (b == end.b)) leasttime = leasttime < time+turntime(look, end.look) ? leasttime : time+turntime(look,end.look);
			
//			System.out.println((a+1)+"행 "+(b+1)+"열//보는방향 : "+look+" 횟수 : "+ time);
			
			if(b>0&&canvisit[a][b-1]&&((look!=1)||isfirst)){//왼쪽
				push(a, b-1, 2, time+1+turntime(look,2));
				if(b>1&&canvisit[a][b-2]){//위2
					push(a, b-2, 2, time+1+turntime(look,2));
					if(b>2&&canvisit[a][b-3]){//위3
						push(a, b-3, 2, time+1+turntime(look,2));
					}
				}
			}
			
			if(b<duf-1&&canvisit[a][b+1]&&((look!=2)||isfirst)){//오른쪽
				push(a, b+1, 1, time+1+turntime(look,1));
				if(b<duf-2&&canvisit[a][b+2]){
					push(a, b+2, 1, time+1+turntime(look,1));
					if(b<duf-3&&canvisit[a][b+3]){
						push(a, b+3, 1, time+1+turntime(look,1));
					}
				}
			}
			
			if(a>0&&canvisit[a-1][b]&&((look!=3)||isfirst)){//위
				push(a-1, b, 4, time+1+turntime(look,4));
				if(a>1&&canvisit[a-2][b]){
					push(a-2, b, 4, time+1+turntime(look,4));
					if(a>2&&canvisit[a-3][b]){
						push(a-3, b, 4, time+1+turntime(look,4));
					}
				}
			}
			
			if(a<god-1&&canvisit[a+1][b]&&((look!=4)||isfirst)){//아래
				push(a+1, b, 3, time+1+turntime(look,3));
				if(a<god-2&&canvisit[a+2][b]){
					push(a+2, b, 3, time+1+turntime(look,3));
					if(a<god-3&&canvisit[a+3][b]){
						push(a+3, b, 3, time+1+turntime(look,3));
					}
				}
			}

	
			if(isfirst) isfirst = false;
		}
		return leasttime;
	}
	
	static int turntime(int look1, int look2){
		switch(look1){
		case 1:{
			switch(look2){
			case 1:{
				return 0;
			}
			case 2:{
				return 2;
			}
			case 3:{
				return 1;
			}
			default:{
				return 1;
			}
			}
		}
		case 2:{
			switch(look2){
			case 1:{
				return 2;
			}
			case 2:{
				return 0;
			}
			case 3:{
				return 1;
			}
			default:{
				return 1;
			}
			}
		}
		case 3:{
			switch(look2){
			case 1:{
				return 1;
			}
			case 2:{
				return 1;
			}
			case 3:{
				return 0;
			}
			default:{
				return 2;
			}
			}
		}
		default:{
			switch(look2){
			case 1:{
				return 1;
			}
			case 2:{
				return 1;
			}
			case 3:{
				return 2;
			}
			default:{
				return 0;
			}
			}
		}
		}
	}
	
	static void push(int a, int b, int look, int time){
		gravity[a][b]++;
		if(gravity[a][b]>99) canvisit[a][b] = false;
		r.add(new Robot(a, b, look, time));
		rear++;
	}
	
	static Robot pop(){
		if(front>rear) return null;
		return r.get(front++);
	}
}
