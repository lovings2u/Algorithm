import java.util.Scanner;
public class TSP {
	static final int MAX_NODE = 16;
	static final double INF = (double)MAX_NODE *1500.0;
	
	static double cost[][] = new double[MAX_NODE+1][MAX_NODE+1];
	static double dp[][] = new double[MAX_NODE+1][1<<17];
	
	static int bitarr[] = new int[MAX_NODE+1];
	
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		
		int t, N;
		//bit에서의 도시 위치를 배열에 저장
		//bit[1] = 0000 0001 1번 도시를 표시
		//bit[2] = 0000 0002 2번 도시를 표시
		//...
		
		for(int i=1; i<=MAX_NODE; i++)
			bitarr[i] = 1<<i;
		
		t = kbd.nextInt();
		
		for(int i=1; i<=t; i++)
			for(int j=1; j<=t; j++)
				cost[i][j] = kbd.nextDouble();
		
		double ans = INF;
		double result = 0.0;
		
		for(int i=1; i<=MAX_NODE; i++)
			for(int j=1; j<=MAX_NODE; j++)
			dp[i][j] = 0;
		
		int path = 0;
		//경로 저장, path에는 모든 도시가 저장됨
		for(int i=1; i<=t; i++)
			path |= 1<<i;
		
		//출발 지점을 차례대로 바꿔서 해를 구한다.
		for(int i=1; i<=t; i++){
			int npath = (path & ~bitarr[i]);
			result = tsp(i, npath, t-1);
			ans = search_min(ans, result);
		}
		
		System.out.print((int)ans);
				
	}
	
	public static double search_min(double a, double b){
		if (a<b)
			return a;
		else
			return b;
	}
	
	public static double tsp(int from, int path, int len){
		if(len==1){
			int to = (int)(Math.log((double)path)/Math.log(2.0));
			return dp[from][path];
		}
		double ans = INF;
		
		for(int i=1; i<=MAX_NODE; i++){
			if((bitarr[i] & path) != 0){
				int node = bitarr[i];
				//새로운 경로는 목적지 node를 제외한 나머지 도시들
				int npath = (path & ~node);
				//다음 목적지 지정, node는 2^n 값만 존재
				int to = (int)(Math.log(node)/Math.log(2.0));
				//f{N,{N-1,N-2,...,1}) = cost[N][N-1] + f{N-1,{N-2,N-3,...,1})
				double fcost = tsp(to, npath, len-1);
				double newcost = cost[from][to] + fcost;
				
				ans = search_min(ans, newcost);
			}
		}
		dp[from][path] = ans;
		return ans;
	}
	
}
