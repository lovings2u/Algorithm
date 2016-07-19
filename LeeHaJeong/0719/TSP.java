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
		//bit������ ���� ��ġ�� �迭�� ����
		//bit[1] = 0000 0001 1�� ���ø� ǥ��
		//bit[2] = 0000 0002 2�� ���ø� ǥ��
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
		//��� ����, path���� ��� ���ð� �����
		for(int i=1; i<=t; i++)
			path |= 1<<i;
		
		//��� ������ ���ʴ�� �ٲ㼭 �ظ� ���Ѵ�.
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
				//���ο� ��δ� ������ node�� ������ ������ ���õ�
				int npath = (path & ~node);
				//���� ������ ����, node�� 2^n ���� ����
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
