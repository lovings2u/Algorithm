import java.util.Scanner;

public class luckynum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int n=1,count=0,f,tobinaryint,tobinaryshift;
		String tobinary,luckynum,luckynum2;
	
		//嬢巨益血拭 紗馬澗走 硝焼左奄是廃 while庚
		while(true){
			if((int)Math.pow(2, n)-1<=num&&num<(int)(Math.pow(2, n+1)-1)){
				break;
			}n++;
		}
		//切奄 益血拭辞税 段牌戚 2^n-1戚壱 原走厳牌戚 2^n+1-2
		f=(int)Math.pow(2, n)-1;//f研 段牌生稽 竺舛
		for(int i=0;i<(int)Math.pow(2, n);i++){
			if(f==num){
				break;//脊径廃 呪亜 益血拭辞 護腰属 切軒昔走 硝焼鎧奄 是廃 for庚
			}f++;count++;
		}
		tobinary=Integer.toBinaryString(count);//切軒 硝焼浬依聖 2遭呪稽 痕発
		if(count<(Math.pow(2, n))/2){//習覗闘 尻至切亜 琶推廃焼戚級
			tobinaryint=Integer.parseInt(tobinary);//習覗闘尻至切澗 舛呪莫戚 亜管馬糠稽 什闘元聖 陥獣 舛呪稽
			tobinaryshift=tobinaryint>>>n-1;//習覗闘尻至切叔楳
			tobinary=Integer.toBinaryString(tobinaryshift);//陥獣 什闘元
			luckynum=tobinary.replace("0", "4");//0聖 4稽 郊嘩
			luckynum2=luckynum.replace("1", "7");//1聖 7稽 郊嘩	
			
		}//獣覗闘 尻至切亜 琶推廃 採歳拭辞幻 神嫌亜 蟹革推 ばばばばばばばば
		else{
		luckynum=tobinary.replace("0", "4");//0聖 4稽 郊嘩
		luckynum2=luckynum.replace("1", "7");//1聖 7稽 郊嘩
		}
		System.out.println(luckynum2);
		
		
		
	}

}
