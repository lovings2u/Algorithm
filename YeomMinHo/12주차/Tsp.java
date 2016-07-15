import java.util.Scanner;

public class Tsp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int min = 9999999, resultMin = 9999999, result;
		int count, x;
		int checkY = 0;
		
		num = sc.nextInt();
		int[][] arr = new int[num][num];
		int[][] arr2 = new int[num][num];
		
		for (int i=0 ; i<num ; i++) {
			for (int j=0 ; j<num ; j++) {
				arr[i][j] = sc.nextInt();
				arr2[i][j] = arr[i][j];		// 아래 arr2 = arr; 와 같이 하나의 배열을 추가로 생성시켜줌.
			}
		}
		
//		arr2 = arr;
		
		for (int i=0 ; i<num ; i++) {
			result = 0;
			x = i;
			count = 0;
			
			for (int n=0 ; n<num ; n++) {
				for (int m=0 ; m<num ; m++) {
					if (arr2[n][m] == 0) {		// 갈 수 없는 곳은 최소값에 안뜨게 하려고 큰 값을 입력.
						arr[n][m] = 9999999;
					} else {
						arr[n][m] = arr2[n][m];		// arr 배열의 초기화	
					}
				}
			}
			
			while (count < num-1) {
				for (int y=0 ; y<num ; y++) {
					if (x == y) {
						continue;
					} else {
						if ( arr[x][y] < min ) {
							min = Math.min(arr[x][y], min);		// 한 행의 가장 최소가 되는 값을 찾는다.
							result += min;
							checkY = y;			// 가장 최소값이 되는 y의 값을 check의 값에 저장해 놓는다.
						}
					}
				}
				
				for (int j=0 ; j<num ; j++) {
					arr[j][x] = 9999999;			// 이미 통과한 여행지에 대해서 값을 초기화 해준다. (다시는 지나치지 않게)
				}
				
				x = checkY;		// checkY 에는 y 값으로 지나가는 여행지에 대한 값이다.
				
				min = 9999999;
				
				count++;
			}

			if (arr2[x][i] != 0) {
				result += arr2[x][i];	// 마지막 도착지에서 다시 원래 출발지로 돌아오는 값을 더해준다.
				
				resultMin = Math.min(resultMin, result);	
			}
			
		}

		System.out.println(resultMin);	
	}
}