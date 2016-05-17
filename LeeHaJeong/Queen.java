import java.util.Scanner;
public class Queen {
	static int col [];
	static int n = 0;
	static int m = 0;
	static int q = 0;
	
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		n = kbd.nextInt();
		m = kbd.nextInt();
		if (n>m)
			n = m;
		col = new int [n+1];
		
		queens(0);
		System.out.println(q);
	}
	
	static public void printResult(){
		int index=0;
		for(int i=1; i<=n; i++)
			if(col[i] != 0)
				index++;
		q = index;
	}
	
	static public void queens(int i){
		int j;
		if(promising(i)){
			if(i==n)
				printResult();
			else
				for(j=1; j<=n; j++){
					col[i+1] = j;
					queens(i+1);
				}
			
		}
	}
	
	static public boolean promising(int i){
		int k = 1;
		boolean flag = true;
		
		while(k<i && flag){
			if(col[i] == col[k] || Math.abs(col[i] - col[k]) == Math.abs(i-k))
				flag = false;
			k++;
		}
		return flag;
	}
}
