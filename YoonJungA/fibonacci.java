import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n=10; int i=0;
		int col [] = new int[50];
		int row [] = new int[50];
		int fi [] = new int[40];
		
		fi[0]=1; fi[1]=1; 
		for(int j=2;j<fi.length;j++){
			fi[j]=fi[j-2]+fi[j-1];
		}
		
		int r; int c; 	//ó���� 1cm¥�� ������
		
		while(n>=2){
			n=sc.nextInt();
			r=2;c=1; //�ʱ�ȭ

		/*	for(int k=2;k<n;k++){	
				if(c==k) {
					r+=fi[k]; //���� ���� ����
					System.out.println(k+" r:r "+fi[k]);
				}else{ //r==k
					c+=fi[k]; //���� ���� ����
					System.out.println(k+" c:c "+fi[k]);
				}
			}
			*/
			for(int k=2;k<n;k++){
				if(r==k){
					c+=fi[k]; 
				}
				else
					r+=fi[k]; 
			}
			col[i]=c; row[i]=r;
			
			i++;
		}
		
		for(int j=0;j<i-1;j++)
			System.out.println("Case #"+(j+1)+":\n"+row[j]+", "+col[j]);
	}

}
