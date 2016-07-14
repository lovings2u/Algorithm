import java.util.ArrayList;
import java.util.Scanner;

public class stack {//런타임에러 후..

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int emp=0;
		ArrayList<String>stack = new ArrayList<>();
		String []command = new String [n];
		for(int i=0;i<=n;i++){
			command[i]=sc.nextLine();
			if(command[i].contains("push")){
				command[i]=command[i].replace("push ","");
				c++;
				stack.add(command[i]);				
			}else if(command[i].contains("pop")){
				if(stack.size()==0){System.out.println("-1");}
				else{System.out.println(stack.get(c-1));
				stack.remove(c-1);
				c--;}
				
			}else if(command[i].contains("size")){
				System.out.println(stack.size());	
			}else if(command[i].contains("empty")){
				if(stack.size()==0){emp=1;}
				else{emp=0;}
				System.out.println(emp);
			}else if(command[i].contains("top")){
				System.out.println(c);
			}
		}
	}
}
