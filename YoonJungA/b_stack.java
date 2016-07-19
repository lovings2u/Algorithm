package c0714;

import java.util.ArrayList;
import java.util.Scanner;

public class b_stack {
	
	static ArrayList<Integer> sstack = new ArrayList<Integer>();
	static ArrayList<Integer> result = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String order;
		
		for(int i=0; i<N; i++){
			
			order = sc.next();
			
			if(order.equals("push"))	
				push(sc.nextInt());

			else if(order.equals("pop"))
				pop();
			
			else if(order.equals("size"))
				size();
			
			else if(order.equals("empty"))
				empty();
			
			else if(order.equals("top"))
				top();
			
			else{}
								
		}		
		
		for(int k=0; k<result.size(); k++)
			System.out.println(result.get(k));
	}
	
	public static void push(int x){
		sstack.add(x);
	}
	
	public static void pop(){
		
		if(sstack.isEmpty())
			//System.out.println("-1");
			result.add(-1);
		else{
			//System.out.println(sstack.get(sstack.size()-1));
			result.add(sstack.get(sstack.size()-1));
			sstack.remove(sstack.size()-1);
		}
	}
	
	public static void size(){
		result.add(sstack.size());
		//System.out.println(sstack.size());
	}
	
	public static void empty(){
		if(sstack.size()==0) result.add(1);//System.out.println("1");
		else result.add(0); //System.out.println("0");
	}
	
	public static void top(){
		if(sstack.size()==0) result.add(-1); //System.out.println("-1");
		else result.add(sstack.get(sstack.size()-1)); //System.out.println(sstack.get(sstack.size()-1));
	}

}
