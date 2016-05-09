package j510;

import java.util.Scanner;

public class nsubset {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int prs=sc.nextInt();
		int target=sc.nextInt();
		long ways;
		
		ways=(long)Math.pow(target,prs);
		System.out.println(ways);
		

	}

}
