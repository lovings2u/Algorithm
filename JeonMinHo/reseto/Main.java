package reseto;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>(); //전체 숫자열
		LinkedList<Integer> deleteQueue = new LinkedList<>(); //삭제 대기열
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i = 2; i <= n; i++) { //전체 숫자열 입력
			list.add(i);
		}
		
		int count = 0; //삭제 횟수
		int remove = 0; //마지막 삭제한 숫자
		while(count != k) {
			remove = list.removeFirst(); //첫번째 숫자 삭제
			count++;
			if(count == k) //반복문 탈출 조건(count가 수시로 변함)
				break;
			Iterator<Integer> iter = list.iterator(); //남은 숫자열 반복문
			while(iter.hasNext()) {
				int temp = iter.next();
				if(temp%remove == 0) { //첫번째 숫자로 나누어 떨어지는 수 삭제
					deleteQueue.add(temp); //삭제 대기열에 추가
					count++;
					if(count == k) { //반복문 탈출 조건
						System.out.println(temp); //마지막에 삭제 대기열에 들어간 숫자 출력 후 메인메소드 종료
						return;
					}
				}
			}
			iter = deleteQueue.iterator(); //삭제 대기열에 있던 숫자들 전체 삭제
			while(iter.hasNext()) {
				list.remove(list.indexOf(iter.next()));
			}
			deleteQueue.clear(); //삭제 대기열 초기화
			
		}
		System.out.println(remove);

	}
	
}
