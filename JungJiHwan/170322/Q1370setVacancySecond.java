package JungOl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class MeetInfo implements Comparable<MeetInfo> {
	int index, start, end;
	public MeetInfo(int index, int start, int end) {
		this.index = index;
		this.start = start;
		this.end = end;
	}
	@Override
	public int compareTo(MeetInfo mi) {
		return this.end - mi.end;
	}
}

public class Q1370setVacancySecond {
	Scanner sc;
	ArrayList<MeetInfo> meetings;
	ArrayList<Integer> reserve;
	int n, recentTime = 0;
	public static void main(String[] args) {new Q1370setVacancySecond();}
	public Q1370setVacancySecond() {
		sc = new Scanner(System.in);
		meetings = new ArrayList<>();
		reserve = new ArrayList<>();
		n = sc.nextInt();
		for(int i = 0; i<n; i++){
			meetings.add(new MeetInfo(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(meetings);
		recentTime = meetings.get(0).end;
		reserve.add(meetings.get(0).index);
		meetings.remove(0);
		while(true){
			if(meetings.size() == 0) break;
			if(blockCheck()){
				reserve.add(meetings.get(0).index);
			}
			meetings.remove(0);
		}
		System.out.println(reserve.size());
		for(int i = 0; i<reserve.size(); i++){
			System.out.print(reserve.get(i).intValue()+" ");
		}
	}
	private boolean blockCheck() {
		if(recentTime <= meetings.get(0).start) {
			recentTime = meetings.get(0).end;
			return true;
		}
		return false;
	}
}