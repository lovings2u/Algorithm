package c0818;

import java.util.Scanner;

public class cipherNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String number = sc.next();
		int addnum = sc.nextInt();
		int d_num = sc.nextInt();
		
		
		String[] cipher = number.split("-");
		String check="OK";
		
		for(int i=0;i<cipher.length;i++){
			if(cipher[i].length()>4){
				System.out.println("INPUT ERROR!");
				check = "NO";
				break;
			}
		}
				
		if(check.equals("OK")){

		if(cipher.length+1==d_num){
			String st = Integer.toString(addnum);
			System.out.println(st+st+st+st);
		}
		else{
			
		String d_cipher = cipher[d_num-1];
		

		if(d_cipher.length()!=4){
			while(d_cipher.length()!=4){
				d_cipher = "0"+ d_cipher;
			}
		}
		
		String result="";
				
		for(int i=0;i<4;i++){
			int c_num =(int)(d_cipher.charAt(i)-48)+addnum;
			if(c_num>9) c_num=c_num%10;			
			result += c_num;
		}
		

		System.out.println(result);
		}
		
		}
	}

}
