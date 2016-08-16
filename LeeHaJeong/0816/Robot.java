import java.util.ArrayList;
import java.util.Scanner;

class Position{
	int x;
	int y;
	int dir;
	int count;
	
	public Position(int x, int y, int dir, int count){
		this.x = x;
		this.y = y;
		this.dir = dir;
		this.count = count;
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

public class Robot {
	static int m;
	static int n;
	
	static int[][] map;
	static int[][] visited;
	
	static int east = 1;
	static int west = 2;
	static int south = 3;
	static int north = 4;
	
	static int dpt_x;
	static int dpt_y;
	static int arv_x;
	static int arv_y;
	
	static int dpt_dir;
	static int arv_dir;
	
	static int n_str_cnt;
	static int w_str_cnt;
	static int s_str_cnt;
	static int e_str_cnt;
	
	static int result;
	
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		
		m = kbd.nextInt();
		n = kbd.nextInt();
		
		map = new int[m][n];
		visited = new int[m][n];
		
		for(int i=0; i<m; i++)
			for(int j=0; j<n; j++)
				map[i][j] = kbd.nextInt();
		
		dpt_x = kbd.nextInt()-1;
		dpt_y = kbd.nextInt()-1;
		dpt_dir = kbd.nextInt();
		arv_x = kbd.nextInt()-1;
		arv_y = kbd.nextInt()-1;
		arv_dir = kbd.nextInt();
		
		
		my_bfs();
		System.out.println(result);
		
	}
	
	public static void my_bfs(){
		
		Queue q = new Queue();
		visited[dpt_x][dpt_y] = 1;
		q.push(new Position(dpt_x, dpt_y, dpt_dir, 0));
		
		while(true){
			Position val = q.pop();
			
			if(val == null){
				//System.out.println(visited[arv_x][arv_y]);
				break;
			}
			if(val.x==arv_x && val.y==arv_y && val.dir==arv_dir){
				break;
			}			
			
			int curX = val.x;
			int curY = val.y;
			int curD = val.dir;
			int curC = val.count;
			
			//巢率
			if(curD == south && !(curX==arv_x && curY==arv_y)){
				w_str_cnt=0;
				n_str_cnt=0;
				e_str_cnt=0;
				if(curX+1<m && map[curX+1][curY]==0 && visited[curX+1][curY]==0){
					visited[curX+1][curY] = 1;
					if(s_str_cnt==0){
						s_str_cnt++;
						q.push(new Position(curX+1, curY, south, curC+1));
					}else if(s_str_cnt>0 && s_str_cnt<4){
						s_str_cnt++;
						q.push(new Position(curX+1, curY, south, curC));
					}else if(s_str_cnt>3){
						s_str_cnt=0;
						q.push(new Position(curX+1, curY, south, curC+1));
					}
				}else{
					//left
					if(curY+1<n && map[curX][curY+1]==0 && visited[curX][curY+1]==0){
						q.push(new Position(curX, curY, east, curC+1));
					}
					//right
					if(curY-1>=0 && map[curX][curY-1]==0 && visited[curX][curY-1]==0){
						q.push(new Position(curX, curY, west, curC+1));
					}
				}
			}
			
			//辑率
			if(curD == west && !(curX==arv_x && curY==arv_y)){
				s_str_cnt=0;
				n_str_cnt=0;
				e_str_cnt=0;
				if(curY-1>=0 && map[curX][curY-1]==0 && visited[curX][curY-1]==0){
					visited[curX][curY-1] = 1;
					if(w_str_cnt==0){
						w_str_cnt++;
						q.push(new Position(curX, curY-1, west, curC+1));
					}else if(w_str_cnt>0 && w_str_cnt<4){
						w_str_cnt++;
						q.push(new Position(curX, curY-1, west, curC));
					}else if(w_str_cnt>3){
						w_str_cnt=0;
						q.push(new Position(curX, curY-1, west, curC+1));
					}
				}else{
					//left
					if(curX+1<m && map[curX+1][curY]==0 && visited[curX+1][curY]==0){
						q.push(new Position(curX, curY, south, curC+1));
					}
					//right
					if(curX-1>=0 && map[curX-1][curY]==0 && visited[curX-1][curY]==0){
						q.push(new Position(curX, curY, north, curC+1));
					}
				}
			}
			
			//合率
			if(curD == north && !(curX==arv_x && curY==arv_y)){
				w_str_cnt=0;
				s_str_cnt=0;
				e_str_cnt=0;
				if(curX-1>=0 && map[curX-1][curY]==0 && visited[curX-1][curY]==0){
					visited[curX-1][curY] = 1;
					if(n_str_cnt==0){
						n_str_cnt++;
						q.push(new Position(curX-1, curY, north, curC+1));
					}else if(n_str_cnt>0 && n_str_cnt<4){
						n_str_cnt++;
						q.push(new Position(curX-1, curY, north, curC));
					}else if(n_str_cnt>3){
						n_str_cnt=0;
						q.push(new Position(curX-1, curY, north, curC+1));
					}
				}else{
					//left
					if(curY-1>=0 && map[curX][curY-1]==0 && visited[curX][curY-1]==0){
						q.push(new Position(curX, curY, west, curC+1));
					}
					//right
					if(curY+1<n && map[curX][curY+1]==0 && visited[curX][curY+1]==0){
						q.push(new Position(curX, curY, east, curC+1));
					}
				}
			}
			
			//悼率
			if(curD == east && !(curX==arv_x && curY==arv_y)){
				w_str_cnt=0;
				n_str_cnt=0;
				s_str_cnt=0;
				if(curY+1<n && map[curX][curY+1]==0 && visited[curX][curY+1]==0){
					visited[curX][curY+1] = 1;
					if(e_str_cnt==0){
						e_str_cnt++;
						q.push(new Position(curX, curY+1, east, curC+1));
					}else if(e_str_cnt>0 && e_str_cnt<4){
						e_str_cnt++;
						q.push(new Position(curX, curY+1, east, curC));
					}else if(e_str_cnt>3){
						e_str_cnt=0;
						q.push(new Position(curX, curY+1, east, curC+1));
					}
				}else{
					//left
					if(curX-1>=0 && map[curX-1][curY]==0 && visited[curX-1][curY]==0){
						q.push(new Position(curX, curY, north, curC+1));
					}
					//right
					if(curX+1<m && map[curX+1][curY]==0 && visited[curX+1][curY]==0){
						q.push(new Position(curX, curY, south, curC+1));
					}
				}
			}
			
			result = curC+1;
			
		}
		
		
	}
}
