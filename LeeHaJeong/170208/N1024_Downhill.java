import java.util.Scanner;
public class N1024_Downhill {
	static int m,n;
	static int road[][];
	static int cost[][];
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		m = kbd.nextInt();
		n = kbd.nextInt();
		road = new int[m][n];
		cost = new int[m][n];
		
		for(int i=0; i<m; i++)
			for(int j=0; j<n; j++){
				road[i][j] = kbd.nextInt();
				cost[i][j] = -1;
			}
		
		int result = calcRoad(m-1, n-1);
		System.out.println(result);
	}
	static int calcRoad(int x, int y){
		
		if(x==0 && y==0)
			return 1;
		
		//시작점부터 현재 포인트까지 오는 방법
		//네가지가 있을거임 바운더리 체크 해야함. 큰지작은지 체크 해야함
		
		int fromEast = 0;
		int fromWest = 0;
		int fromSouth = 0;
		int fromNorth = 0;
		
		if(y+1<n){//boundary check
			if(road[x][y] < road[x][y+1]){//point from east
				if(cost[x][y+1]==-1){
					fromEast = calcRoad(x,y+1);
					cost[x][y+1] = fromEast;
				}else{
					fromEast = cost[x][y+1];
				}
			}
		}
		if(y-1>=0){//boundary check
			if(road[x][y] < road[x][y-1]){//point from west
				if(cost[x][y-1]==-1){
					fromWest = calcRoad(x,y-1);
					cost[x][y-1] = fromWest;
				}else{
					fromWest = cost[x][y-1];
				}
			}
		}
		if(x+1<m){//boundary check
			if(road[x][y] < road[x+1][y]){//point from south
				if(cost[x+1][y]==-1){
					fromSouth = calcRoad(x+1,y);
					cost[x+1][y] = fromSouth;
				}else{
					fromSouth = cost[x+1][y];
				}
			}
		}
		if(x-1>=0){//boundary check
			if(road[x][y] < road[x-1][y]){//point from north
				if(cost[x-1][y]==-1){
					fromNorth = calcRoad(x-1,y);
					cost[x-1][y] = fromNorth;
				}else{
					fromNorth = cost[x-1][y];
				}
			}
		}
		
		return fromEast+fromWest+fromSouth+fromNorth;
	}
}
