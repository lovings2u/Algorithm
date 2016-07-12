//아 진짜 오류모르겠어요 !!!!!!!!!!이론상으론 완벽한데...ㅎ 답이틀려요 아  후....

import java.util.Scanner;
import java.io.FileInputStream;

class dart {
	public static void main(String args[]) throws Exception	{

		Scanner sc = new Scanner(System.in);

		int TC;
		int test_case;
		int a,b,c,d,e,game,total=0;

		TC = sc.nextInt();        
		for(test_case = 1; test_case <= TC; test_case++) {
			a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();d=sc.nextInt();e=sc.nextInt();
			game=sc.nextInt();
			int[]x=new int[game];
			int[]y=new int[game];
			int[]r=new int[game];
			for(int i=0;i<game;i++){
				x[i]=sc.nextInt();
				y[i]=sc.nextInt();
				r[i]=(int)Math.sqrt(x[i]*x[i]+y[i]*y[i]);//좌표의 반지름 구하기
			}
			for(int i=0;i<game;i++){
				if(r[i]<a){
					total+=50;
				}else if(r[i]>e){
					total+=0;
				}else if(r[i]>b&&r[i]<c){
					total=total+(dartgame(x[i],y[i]))*3;
				}else if(r[i]>d&&r[i]<e){
					total=total+(dartgame(x[i],y[i]))*2;	
				}else{
					total+=dartgame(x[i],y[i]);
				}
				
			
		}			
			System.out.println("Case #" + test_case);
			System.out.println(total);
			}
	}
	public static int dartgame(int x, int y){
		int type = 0;
		int score=0;
		if(x>=0&&y>=0){
			type=1;//제1사분면
		}
		else if(x<=0&&y>=0){
			type=2;//제2사분면
		}
		else if(x<=0&&y<=0){
			type=3;//제3사분면
		}
		else if(x>=0&&y<=0){
			type=4;//제4사분면
		}
		
		switch(type){//y/x가 긱도ㅇㅇ
		case 1:
			if((double)y/x>=0&&(double)y/x<9){
				score=6;
			}else if((double)y/x>9&&(double)y/x<27){
				score=13;
			}else if((double)y/x>27&&(double)y/x<45){
				score=4;
			}else if((double)y/x>45&&(double)y/x<63){
				score=18;
			}else if((double)y/x>63&&(double)y/x<81){
				score=1;
			}else if((double)y/x>81&&(double)y/x<=90){
				score=20;
			}
		case 2:
			if((double)y/x>-9&&(double)y/x<=0){
				score=11;
			}else if((double)y/x>-27&&(double)y/x<-9){
				score=14;
			}else if((double)y/x>-45&&(double)y/x<-27){
				score=9;
			}else if((double)y/x>-63&&(double)y/x<-45){
				score=12;
			}else if((double)y/x>-81&&(double)y/x<-63){
				score=5;
			}else if((double)y/x>=-9063&&(double)y/x<-81){
				score=20;
			}
		case 3:
			if((double)y/x>=0&&(double)y/x<9){
				score=11;
			}else if((double)y/x>9&&(double)y/x<27){
				score=8;
			}else if((double)y/x>27&&(double)y/x<45){
				score=16;
			}else if((double)y/x>45&&(double)y/x<63){
				score=7;
			}else if((double)y/x>63&&(double)y/x<81){
				score=19;
			}else if((double)y/x>81&&(double)y/x<=90){
				score=3;
			}
		case 4:
			if((double)y/x>-9&&(double)y/x<=0){
				score=6;
			}else if((double)y/x>-27&&(double)y/x<-9){
				score=10;
			}else if((double)y/x>-45&&(double)y/x<-27){
				score=15;
			}else if((double)y/x>-63&&(double)y/x<-45){
				score=2;
			}else if((double)y/x>-81&&(double)y/x<-63){
				score=17;
			}else if((double)y/x>=-90&&(double)y/x<-81){
				score=3;
			}
	}
		return score;
		}}


