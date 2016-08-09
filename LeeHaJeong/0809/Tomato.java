import java.util.Scanner;
import java.util.ArrayList;

class Position{
	int x;
	int y;
	int day;
	
	public Position(int x, int y, int day){
		this.x = x;
		this.y = y;
		this.day = day;
	}
}

class Queue{
	ArrayList<Position> al;
	int start = 0;
	int end = -1;
	
	public Queue(){
		al = new ArrayList<Position>();
	}
	
	public void push(Position p){
		al.add(p);
		end++;
	}
	
	public Position pop(){
		if(start>end){
			return null;
		}
		Position result = al.get(start);
		start++;
		return result;
	}
}

public class Tomato {
	
	static int tmt[][];
	static int visited[][];
	
	static int m;
	static int n;
	
	static int count=0;
	
	static int flag = 0;
	
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		
		m = kbd.nextInt();
		n = kbd.nextInt();
		
		tmt = new int[n][m];
		visited = new int[n][m];
		
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				tmt[i][j] = kbd.nextInt();
		
		for(int i=0; i<n; i++)
			for(int j=0; j<m; j++)
				visited[i][j] = tmt[i][j];	
		
		my_bfs();
		
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++)
				if(visited[i][j]==0)
				count=-1;
		}
		
		System.out.println(count);
	}
	
	static public void my_bfs(){
		int x = 0;
		int y = 0;
		Queue q = new Queue();
		
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(visited[i][j]==1){
					q.push(new Position(i, j, 0));
				}
			}
		}
		
		int index=0;
		int index2=0;
		
		Label1:
		while(true){
			
			Position val = q.pop();
			
			if(val == null)
				break;
			
			int curX = val.x;
			int curY = val.y;
			int curD = val.day;
			
			//╩С
			if(curX-1>=0 && tmt[curX-1][curY]==0 && visited[curX-1][curY]==0){
				//System.out.println("up");
				visited[curX-1][curY] = 1;
				count = curD+1;
				q.push(new Position(curX-1, curY, curD+1));
			}
			
			//го
			if(curX+1<n && tmt[curX+1][curY]==0 && visited[curX+1][curY]==0){
				//System.out.println("down");
				visited[curX+1][curY] = 1;
				count = curD+1;
				q.push(new Position(curX+1, curY, curD+1));
			}
			
			//аб
			if(curY-1>=0 && tmt[curX][curY-1]==0 && visited[curX][curY-1]==0){
				//System.out.println("left");
				visited[curX][curY-1] = 1;
				count = curD+1;
				q.push(new Position(curX, curY-1, curD+1));
			}
			
			//©Л
			if(curY+1<m && tmt[curX][curY+1]==0 && visited[curX][curY+1]==0){
				//System.out.println("right");
				visited[curX][curY+1] = 1;
				count = curD+1;
				q.push(new Position(curX, curY+1, curD+1));
			}
			index++;
		}		
	}
}
