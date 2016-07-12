package c0712;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		ArrayList<Integer> p = new ArrayList<Integer>();	
		
		
		for(int i=0;i<N;i++)
			p.add(sc.nextInt());
		
		int result[] = new int[p.size()];
		
		Collections.sort(p);
		int sum=0;
		
		for(int i=0;i<p.size();i++){
			sum=0;
			for(int j=0;j<=i;j++){
				sum = sum+p.get(j);
			}
			result[i]=sum;
		}
		
		int fi=0;
		for(int i=0;i<result.length;i++)
			fi +=result[i];
		
		System.out.println(fi);
		
	}

}
