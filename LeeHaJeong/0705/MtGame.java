import java.util.Scanner;
public class MtGame {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int T;
		int test_case;
		
		T = sc.nextInt();
		for(test_case=1; test_case<=T; test_case++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			StringBuffer sb =  new StringBuffer();
			for(int i=0; i<c; i++){
				int n = sc.nextInt();
				int k = sc.nextInt();
				int result = n-1;
				for(int j=k; result>0;)
					result -= k;
				
				result += k;
				if(result < a)
					sb.append("a");
				else
					sb.append("b");
			}
			
			System.out.println("Case #"+ test_case);
			System.out.println(sb);
		}
	}
}
