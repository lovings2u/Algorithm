package password;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pn= sc.next();
		int s=sc.nextInt(),m=sc.nextInt()-1,i=0,k,n=0,count=0;
		String[] pns=new String[100];
		int []result=new int[4];
		int pw;
		//System.out.println(pn);
		StringTokenizer st =new StringTokenizer(pn);
		while(st.hasMoreElements()){
			pns[i]=st.nextToken("-");
			//System.out.println(pns[i]);
			if(pns[i].length()>4){
				count++;
			}
			i++;
		}
		/*k=4-pns[m].length();
		if(pns[m].length()<4){
			for(int j=0;j<k;j++){
				pns[m]="0"+pns[m];}
			System.out.println(pns[m]);}*/	
		if(pns[m]==""){pw=0;}
		else{pw=Integer.parseInt(pns[m]);}
		result[0]=pw/1000+s;
		result[1]=(pw-pw/1000)/100+s;
		result[2]=(pw%100)/10+s;
		result[3]=pw%1000+s;
		for(int j=0;j<4;j++){
			if(result[j]>=10){
				result[j]%=10;
				
			}
			result[j]=result[j]*(int)Math.pow(10,3-j);
			System.out.println(result[j]);
			n+=result[j];
		}
		if(count>0){
			System.out.println("INPUT ERROR!");
		}else{
		System.out.println(n);}
			
	}

}
