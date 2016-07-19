import java.util.Scanner;
public class Stack {
	static int[] stack;
	static int current=0;
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		
		int n = kbd.nextInt();
		stack = new int[n];
		int count = 0;
		
		String s;
		int num=0;
		
		while(count<n){
			
			s = kbd.next();
			
			if(s.equals("push")){
				num = kbd.nextInt();
				push(num);
			}else if(s.equals("top")){
				System.out.println(top());
			}else if(s.equals("size")){
				System.out.println(size());
			}else if(s.equals("empty")){
				System.out.println(empty());
			}else if(s.equals("pop")){
				System.out.println(pop());
			}				
			count++;	
		}
		
	}
	
	public static void push(int n){
		stack[current] = n;
		current++;
	}
	
	public static int top(){
		if(current==0)
			return -1;
		else
			return stack[current-1];
	}
	
	public static int size(){
		return current;
	}
	
	public static int pop(){
		int result = 0;
		if(current==0){
			result = -1;
		}
		else{
			result = stack[current-1];
		
			stack[current-1] = 0;
			current--;
		}
		return result;
	}
	
	public static int empty(){
		if(current==0)
			return 1;
		else
			return 0;
	}
}
