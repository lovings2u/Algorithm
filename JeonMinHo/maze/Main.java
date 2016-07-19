package maze;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int TC;
		int test_case;

		TC = sc.nextInt();        
		for(test_case = 1; test_case <= TC; test_case++) {
			int size = sc.nextInt();
			int moveCount = sc.nextInt();
			long[][] maze = new long[size][size];
			maze[0][0] = 1; maze[size-1][size-1] = size*size;
			long prev = 1, prev2 = 1;
			long startNum = 0;
			long endNum = size*size;
			for(int i = 0; i < size; i++) {
				int m = 1, n = 0;
				if(i % 2 == 0) {
					startNum ++;
					prev = startNum;
				} else {
					startNum = prev + 2*i;
							
				}
				prev2 = startNum;
				for(int j = 0; j < size-i; j++) {
					if(j == 0) {
						maze[i][j] = startNum;
						continue;
					}
					if(i % 2 == 0) { 
						//礎熱廓簞 還
						if(j % 2 == 0) {
							maze[i][j] = maze[i][j-1] + 4*m;
							m++;
						} else {
							maze[i][j] = maze[i][j-1] + (i*2 + 1);
						}
					} else {
						//�汝鶾讕� 還
						if(j % 2 == 0) {
							maze[i][j] = maze[i][j-1] + (i*2 + 1);
						} else {
							maze[i][j] = maze[i][j-1] + (4*n + 2);
							n++;
						}
					}
					prev2 = maze[i][j];
				}
				m = size/2; n = size/2;
				if(size % 2 == 0) {
					endNum = prev2 + (2*(size-i)-1);
				} else {
					endNum = prev2 + (2*i);
				}
				for(int j = size-i; j < size; j++) {
					if(j == size-i) {
						maze[i][j] = endNum;
						continue;
					}
					if(i%2 == 0) {
						if(j%2 == 0) {
							maze[i][j] = maze[i][j-1] + (2*(size-i)-1);
						} else {
							maze[i][j] = maze[i][j-1] + (2*(size-j));
						}
					} else {
						if(j%2 == 0) {
							maze[i][j] = maze[i][j-1] + (2*(size-j));
							n--;
						} else {
							maze[i][j] = maze[i][j-1] + (2*(size-i)-1);
						}	
					}
				}
				
			}
			sc.nextLine();
			String moving = sc.nextLine();
			char[] load = moving.toCharArray();
			
			int ver = 0, hor = 0;
			
			int index = 0, sum = 0;
			for(int i = 0; i < load.length; i++) {
				switch(load[i]) {
				case 'U':
					ver--;
					break;
				case 'D':
					ver++;
					break;
				case 'R':
					hor++;
					break;
				case 'L':
					hor--;
					break;
				}
				sum += maze[ver][hor];
			}
        
        

			System.out.println("Case #" + test_case);
			System.out.println(sum+1);
			
		}
	}
}
