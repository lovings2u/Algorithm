package study4;

import java.util.Scanner;

public class flea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int s=sc.nextInt();
		int x=sc.nextInt(); int y=sc.nextInt();
		int dx=sc.nextInt(); int dy=sc.nextInt();
		int fx=0; int fy=0; int jump=0;
		int i=0;
		
		if(x==y&&dx==dy){
			System.out.println("The flea cannot escape from black squares.");
		}else{
		while(true){
			
			int row = x+(i*dx);
			int col = y+(i*dy);			
			if(row%s==0&&col%s==0){
				System.out.println("The flea cannot escape from black squares.");
				break;
			}
			else if((((row/s)%2==0)&&((col/s)%2!=0))||(((row/s)%2!=0)&&((col/s)%2==0))){
				//���θ� s�� ������ Ȧ���� ���θ� s�� �����Ŵ� ¦�������ϰ�,
				//���θ� s�� ������ ¦���� Ȧ���� s�� �����Ŵ� Ȧ��������
				fx=row; fy=col; jump=i;
				System.out.println("After "+jump+" jumps the flea lands at ("+fx+", "+fy+").");
				break;
			}
			i++;
		}

	
	}
}}
