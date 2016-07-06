package mirror;
import java.util.Scanner;

public class Mirror {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test_case;
		
		test_case = sc.nextInt();
		int[] result = new int[test_case];
		
		int num;
		String[] input;
		int[][] arr;
		int[][] check;
		int x, y;
		String state;
		int count;
		
		for (int n=0 ; n<test_case ; n++){
			num = sc.nextInt();		// 한 변의 방 개수
			input = new String[num];	// 한 줄마다 가져오는 입력
			arr = new int[num][num];	// String 으로 받아오는 입력 값을 arr에 배정
			check = new int[num][num];	// 거쳐갔는지 판단하는 배열
			x=0; y=0;
			state = "right";
			count = 0;
			
			for (int i=0 ; i<num ; i++) {
				input[i] = sc.next();
			}
			
			for (int i=0 ; i<input.length ; i++) {				// 배열에 값 입력
				for (int j=0 ; j<input.length ; j++) {
					arr[j][i] = Integer.parseInt(String.valueOf(input[i].charAt(j)));
				}
			}
		
			while (true) {
				state = stateC(state, arr[x][y]);	
				
				switch (state) {
					case "right" :
						if (arr[x][y] != 0 && check[x][y] == 0) { count++; check[x][y] = 1;}
						x++;
						break;
					case "left" :
						if (arr[x][y] != 0 && check[x][y] == 0) { count++; check[x][y] = 1;}
						x--;
						break;
					case "down" :
						if (arr[x][y] != 0 && check[x][y] == 0) { count++; check[x][y] = 1;}
						y++;
						break;
					case "up" :
						if (arr[x][y] != 0 && check[x][y] == 0) { count++; check[x][y] = 1;}
						y--;
						break;
				}
				
				if( x>=num || y>=num || x<0 || y<0 ) {
					break;
				}
			}
			
			result[n] = count;
		}

		for (int i=0 ; i<test_case ; i++) {
			System.out.println("Case #" + (i+1));	
			System.out.println(result[i]);
		}
	}
	
	public static String stateC(String state, int arr) {		// 거울에 반사된 방향 상태를 정하는 메소드
		switch (state) {
			case "right" :
				if (arr==1) { state = "up"; }
				else if (arr==2) { state = "down"; }
				break;
			case "left" :
				if (arr==1) { state = "down"; }
				else if (arr==2) { state = "up"; }
				break;
			case "down" :
				if (arr==1) { state = "left"; }
				else if (arr==2) { state = "right"; }
				break;
			case "up" :
				if (arr==1) { state = "right"; }
				else if (arr==2) { state = "left"; }
				break;
		}
		
		return state;
	}
}
