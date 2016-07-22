import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Rescue119 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n, m;
      int destiX, destiY;
      
      n = sc.nextInt();   m = sc.nextInt();
      destiX = sc.nextInt();   destiY = sc.nextInt();
      
      int[][] arr = new int[n+1][m+1];
      
      for (int i=1 ; i<=n ; ++i) {
         for (int j=1 ; j<=m ; ++j) {
            arr[j][i] = sc.nextInt();
         }
      }
       
        FireEngine f = new FireEngine(n, m, destiX, destiY);
        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= m; ++j) {
                f.addEdge(i, j, arr[j][i]);
            }
        }
        
        f.process();
        f.print();
    }
}

class Graph {
    protected int n, m;
    protected boolean[][] map;
    
    public Graph() {}
    public Graph(int n, int m) {
        this.n = n + 1;
        this.m = m + 1;
        this.map = new boolean[this.n + 1][this.m + 1];
    }
    
    protected void addEdge(int u, int v, int value) {
        map[u][v] = (value == 0 ? false : true);
    }
}

class FireEngine extends Graph {
    private int[][] check;
    private int goalX, goalY;
    private final int[][] move = { { 0, -1 }, { 1, 0 }, { 0, 1 }, { -1, 0 } };
    
    public FireEngine() {}
    public FireEngine(int n, int m, int goalY, int goalX) {
        super(n, m);
        this.check = new int[n + 2][m + 2];
        for(int i = 1; i <= n + 1; ++i) {
            Arrays.fill(check[i], 999);
        }
        check[1][1] = 0;
        this.goalX = goalX + 1;
        this.goalY = goalY + 1; 
    }
    
    void process() {
        Queue<Node> queue = new LinkedList<Node>() ;
        Node node;
        int x, y, d, v;
        int q, w, e, r;
        
        queue.offer(new Node(1, 1, 0, -1));
        while(!queue.isEmpty()) {
            node = queue.poll();
            x = node.x;
            y = node.y;
            d = node.d;
            v = node.v;
            for(int i = 0; i < 4; ++i) {
                q = x + move[i][0];
                w = y + move[i][1];
                e = i;
                r = v + (d != e ? 1 : 0);
                if((q == goalX) && (w == goalY)) {
                    if(r < check[w][q]) {
                        check[goalY][goalX] = r;
                    }
                }
                
                if(map[w][q] && (r < check[w][q])) {
                    check[w][q] = r;
                    queue.offer(new Node(q, w, e, r));
                }
            }
        }
    }
    
    void print() {
        System.out.println(check[goalY][goalX]);
    }
}

class Node {
    int x, y, d, v;
    
    public Node() {}
    public Node(int x, int y, int d, int v) {
        this.x = x;
        this.y = y;
        this.d = d;
        this.v = v;
    }
}