package c0809;

import java.util.ArrayList;
import java.util.Scanner;

class Queue2{
	ArrayList<Position> alist;
	int start = 0;
	int end = -1;
	
	public Queue2(){
		alist = new ArrayList<Position>();
	}
	
	public void push(Position p){
		alist.add(p);
		end++;
	}
	public Position pop(){
		
		if(start>end)
			return null;
		
		Position result = alist.get(start);
		start++;
		return result;
	}
}

class Position{
	
	int x,y,day;
	
	public Position(int x,int y,int day){
		this.x = x;
		this.y = y;
		this.day = day;
	}
	
}

public class Tomato_2 {
	
	static int M,N;
	static int box [][];
	static int visit [][];
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		box= new int[M][N];
		visit= new int[M][N];
		
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				box[i][j]=sc.nextInt();
				visit[i][j]=0;
			}
		}
		
		bfs();
		
	}
	
	static public void bfs(){
		
		Queue2 q = new Queue2();

		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				if(box[i][j]==1&&visit[i][j]==0){
					q.push(new Position(i,j,0));
					visit[i][j]=1;
				}
			}
		}
		
		int x,y;
		int day=0;
		String ok="true";
		
		while(true){
			
			Position val = q.pop();
			
			if(val==null){
				
				for(int i=0;i<M;i++){
					for(int j=0;j<N;j++){
						if(box[i][j]==0){
							ok="false";
							break;
						}
					}
				}
				
				if(ok.equals("true")) System.out.println(day);
				else System.out.println(-1);
				
				break;
			}
			
			x = val.x;
			y = val.y;
			day = val.day;
			
			
			//╩С
			if(y-1>=0 && visit[x][y-1]==0 && box[x][y-1]==0){
				box[x][y-1]=1;
				visit[x][y-1]=1;
				q.push(new Position(x,y-1,day+1));
			}
			
			//го
			if(y+1<N && visit[x][y+1]==0 && box[x][y+1]==0){
				box[x][y+1]=1;
				visit[x][y+1]=1;
				q.push(new Position(x,y+1,day+1));
			}
			
			//аб
			if(x-1>=0 && visit[x-1][y]==0 && box[x-1][y]==0){
				box[x-1][y]=1;
				visit[x-1][y]=1;
				q.push(new Position(x-1,y,day+1));
			}
			
			//©Л
			if(x+1<M && visit[x+1][y]==0 && box[x+1][y]==0){
				box[x+1][y]=1;
				visit[x+1][y]=1;
				q.push(new Position(x+1,y,day+1));
			}
		
		}
		
	}

}


