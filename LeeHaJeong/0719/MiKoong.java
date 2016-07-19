import java.util.Scanner;
public class MiKoong {
	
	static int room[][];
	static int i=0;
	static int j=0;
	static int n=0;
	
	static int num=1;
	
	static int flag =0;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int TC;
		int test_case;
		
		TC = sc.nextInt();
		for(test_case=1; test_case<=TC; test_case++){
			
			flag=0;
			
			i=0;
			j=0;
			n=0;
			
			num=1;
			
			n = sc.nextInt();
			int k = sc.nextInt();
			
			String s = sc.next();
			
			room = new int[n][n];
			for(int a=0; a<n; a++)
				for(int b=0; b<n; b++)
					room[a][b]=0;
			room[i][j] = num;
			
			int result = right();
						
			int total = sum(s);
			
			System.out.println("Case #"+test_case);
			System.out.println(total);
		}	
	}
	
	public static int right(){
		room[i][++j] = ++num;
				
		if(i==n-1 && j==n-1){
			flag = 1;
			return 0;
		}
		else if(i==n-1 && j!=n-1)
			right_diagonal();
		else if(j<=n-1 && i<=n-1)
			left_diagonal();
		
		return 0;
	}
	
	public static void left_diagonal(){
		for(i+=1, j-=1; j>-1; i++, j--){
			room[i][j] = ++num;				
			
			if(i==n-1){
				right();
				break;
			}
		}
		if(flag == 0){
			j+=1;
			i-=1;
			
			down();
		}
	}
	
	public static void down(){
		room[++i][j] = ++num;
		
		if(j!=n-1)
			right_diagonal();
		else
			left_diagonal();
	}
	
	public static void right_diagonal(){
		for(i-=1, j+=1 ; i>-1; i--, j++){
			room[i][j] = ++num;
			
			if(j==n-1){
				down();
				break;
			}
		}
		if(flag == 0){
			i=0;
			j-=1;
					
			right();
		}
	}
	
	public static int sum(String s){
		int sum = 1;
		int index = 0;
		int a=0;
		int b=0;
		
		while(index<s.length()){
			switch(s.charAt(index)){
			case 'D':
				sum += room[++a][b];
				break;
			case 'U':
				sum += room[--a][b];
				break;
			case 'R':
				sum += room[a][++b];
				break;
			case 'L':
				sum += room[a][--b];
				break;
			}
			index++;
		}
		return sum;
	}
}
