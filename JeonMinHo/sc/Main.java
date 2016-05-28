package sc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> scoreList = new LinkedList<Integer>();
		int num = 0;
		while(num != -1) {
			num = sc.nextInt();
			scoreList.add(num);
		}
		int[] gradeList = new int[6];
		gradeList[0] = scoreList.size() -1;
		Iterator<Integer> iter = scoreList.iterator();
		while(iter.hasNext()) {
			int score = iter.next();
			if(score == -1)
				break;
			if(score >= 90)
				gradeList[1]++;
			else if(score >= 80)
				gradeList[2]++;
			else if(score >= 70)
				gradeList[3]++;
			else if(score >= 60)
				gradeList[4]++;
			else
				gradeList[5]++;
		}
		for (int i : gradeList) {
			System.out.println(i);
		}
		
	}
}
