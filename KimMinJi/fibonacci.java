import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int [] n = new int [40];
		int c=0,i=0;
		int f1=1,f2=1,f,width=2,height=1;
		//초기 직사각형 가로 2 세로 1
		
		while(true){
			n[i]=sc.nextInt();if(n[i]<=1){break;}
			i++;c++;
		}
		for(i=1;i<=c;i++){//
			f1=1;f2=1;width=2;height=1;//ㅈㅐ초기화
			for(int j=2;j<n[i-1];j++){
				f=f1+f2;
				f1=f2;
				f2=f;
				if(f==height){
					width+=f;
				}else if(f==width){
					height+=f;
				}
			}
			System.out.println("Case #"+i+" :");
			System.out.println(width+",  "+height+"\n");
			
		}
	}
}
