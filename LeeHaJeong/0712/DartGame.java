import java.util.Scanner;

public class DartGame {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int TC;
		int test_case;
		
		TC = sc.nextInt();
		for(test_case=1; test_case<=TC; test_case++){
		
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			int e = sc.nextInt();
			
			int score = 0;
			
			int n = sc.nextInt();
			
			for(int i=0; i<n; i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				double dart = Math.sqrt(x*x + y*y);
				
				double theta = 0;
				if(x == 0)
					theta = 0;
				else
					theta = Math.atan(y/x);
				
				int num_score = calcScore(theta);
				
				if(dart < Math.sqrt(a*a))
					score += 50;
				else if(dart < Math.sqrt(c*c) && dart > Math.sqrt(b*b))
					score += 3*num_score;
				else if(dart < Math.sqrt(e*e) && dart > Math.sqrt(d*d))
					score += 2*num_score;
				else if(dart > Math.sqrt(e*e))
					score += 0;
				else
					score += num_score;
			}
			
			
			System.out.println("Case #"+test_case);
			System.out.println(score);
		}
	}
	public static int calcScore(double theta){
		int score = 0;
		
		if(theta < 9 && theta > 351)
			score = 6;
		else if(theta < 27 && theta > 9)
			score = 13;
		else if(theta < 45 && theta > 27)
			score = 4;
		else if(theta < 63 && theta > 45)
			score = 18;
		else if(theta < 81 && theta > 63)
			score = 1;
		else if(theta < 99 && theta > 81)
			score = 20;
		else if(theta < 117 && theta > 99)
			score = 5;
		else if(theta < 135 && theta > 117)
			score = 12;
		else if(theta < 153 && theta > 135)
			score = 9;
		else if(theta < 171 && theta > 153)
			score = 14;
		else if(theta < 189 && theta > 171)
			score = 11;
		else if(theta < 207 && theta > 189)
			score = 8;
		else if(theta < 225 && theta > 207)
			score = 16;
		else if(theta < 243 && theta > 225)
			score = 7;
		else if(theta < 261 && theta > 243)
			score = 19;
		else if(theta < 279 && theta > 261)
			score = 3;
		else if(theta < 297 && theta > 279)
			score = 17;
		else if(theta < 315 && theta > 297)
			score = 2;
		else if(theta < 333 && theta > 315)
			score = 15;
		else if(theta < 351 && theta > 333)
			score = 10;
		
		return score;
	}
}
