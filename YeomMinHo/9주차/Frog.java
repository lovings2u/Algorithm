import java.util.Scanner;
import java.io.FileInputStream;

public class Frog {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testNum;	// 테스트 경우의 개수 입력
		testNum = sc.nextInt();	
		int[] result = new int[testNum];
		
		int stoneNum;	// 좌표 0 에 놓인 돌을 제외한 나머지 돌들의 개수 선언
		int[] stoneGps;	// 돌들의 좌표입력 배열 선언
		int maxJump;	// 점프 최대 이동거리 선언
		
		for (int i=0 ; i<testNum ; i++) {
			stoneNum = sc.nextInt();	// 좌표 0 에 놓인 돌을 제외한 나머지 돌들의 개수 입력
			
			stoneGps = new int[stoneNum];		// 돌들의 좌표입력 배열 입력
			for (int j=0 ; j<stoneNum ; j++) {
				stoneGps[j] = sc.nextInt();
			}
			
			maxJump = sc.nextInt();		// 점프 최대 이동거리 입력
			
			result[i] = Cal(stoneNum, stoneGps, maxJump);
		}
		
		for (int i=0 ; i<testNum ; i++) {
			System.out.println("Case #" + (i+1));
			System.out.println(result[i]);
		}
	}
	
	public static int Cal(int stoneNum, int[] stoneGps, int maxJump) {
		int location = 0;
		int count = 0;
		
		for (int i=0 ; i<stoneNum ; i++) {
			if (stoneGps[i]-location > maxJump) {		// 최대로 점프하여 위치(location) 옮기고 count 값 증가
				location = stoneGps[i-1];
				count++;
			}
			
			if (i>0) {		// 사이 간격이 maxJump보다 크면 반복문 종료
				if (stoneGps[i] - stoneGps[i-1] > maxJump) {	
					count = -1;
					break;
				}	
			}
		}

		if (stoneGps[stoneNum-1]-location <= maxJump) {		// 마지막으로 입력된 location값과 배열의 마지막 값을 비교하여 count 하나 추가 
			count++;
		}

		return count;
	}
}
