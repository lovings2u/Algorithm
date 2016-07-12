package c0712;

import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		StringBuffer stb = new StringBuffer("abcdefghigklmnopqrstuvwxyz");
		StringBuffer result = new StringBuffer("");
		
		String stP = sc.nextLine();
		String stK = sc.nextLine();
		int numP;
		int numK;
		int index;
		
		int j=0;
		for(int i=0;i<stP.length();i++){
			
			if(j!=stK.length()){
				
				if((int)stP.charAt(i)==32){
					result.append(" ");
				}else{
					numP=((int)stP.charAt(i)-96);
					numK=((int)stK.charAt(j)-96);
					index = numP-numK;
				
					if(index<=0) index +=  26;
				
					result.append(stb.charAt(index-1));
				}
				j++;
			}
			else{
				j=0; i--;
			}
		}
		System.out.println(result.toString());
	
	}

}
