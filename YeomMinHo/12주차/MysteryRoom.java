import java.util.Scanner;

public class MysteryRoom {
	
	int x=0, y=0, checkZ=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test_case;
		test_case = sc.nextInt();
		int[] result = new int[test_case];
		int inputLength;
		String input;
		
		int num;
		int count;
		MysteryRoom mr = new MysteryRoom();
		
		for (int t=0 ; t<test_case ; t++) {
			num = sc.nextInt();
			inputLength = sc.nextInt();
			input = sc.next();
			mr.x=0; 
			mr.y=0;
			count=1;		// x, y, count 값 초기화
			
			// ----------------------------------------------------- 배열 만드는 곳
			int[][] arr = new int[num][num];
			arr[0][0] = 1;
			
			while (true) {
				mr.cal(arr, mr.x, mr.y, mr.checkZ);
		
				count++;
				arr[mr.x][mr.y] = count;
//				System.out.println("x : " + mr.x + " y : " + mr.y + " count : " + count + " checkZ : " + mr.checkZ);
				
				if (count == num*num) {
					break;
				}
			}
			// ------------------------------------------------------
			
			mr.x=0;
			mr.y=0;
			
			for (int n=0 ; n<input.length() ; n++) {
				switch (input.charAt(n)) {
				case 'U' :	
					mr.y--;	
					result[t] += arr[mr.x][mr.y];
					break;
				case 'D' :	
					mr.y++;
					result[t] += arr[mr.x][mr.y];
					break;
				case 'L' :	
					mr.x--;	
					result[t] += arr[mr.x][mr.y];
					break;
				case 'R' :	
					mr.x++;	
					result[t] += arr[mr.x][mr.y];
					break;
				}
			}
		}
		
		for (int i=0 ; i<test_case ; i++) {
			System.out.println("Case #" + (i+1));
			System.out.println(result[i]+1);
		}
	}
	
	public void cal(int[][] arr, int x, int y, int checkZ) {
		if (y == 0 && checkZ == 0 && x < arr.length-1) {
			this.x++;
			this.checkZ=1;
		} else if (x == 0 && checkZ == 1 && y < arr.length-1) {
			this.y++; 	
			this.checkZ=0;
		} else if (x == arr.length-1 && checkZ == 0) {
			this.y++;
			this.checkZ=1;
		} else if (y == arr.length-1 && checkZ == 1) {
			this.x++; 	
			this.checkZ=0;
		} else if (checkZ == 1){
			this.x--; this.y++;
		} else if (checkZ == 0){
			this.x++; this.y--;
		}
	}
}