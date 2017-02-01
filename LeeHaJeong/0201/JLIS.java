import java.util.Scanner;
public class JLIS {
	static int cache[][] = new int[101][101];
	static int a[] = new int[100];
	static int b[] = new int[100];
	static int n,m;
	static long NEGINF;
	
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		int c = kbd.nextInt();
		
		for(int i=0; i<c; i++){
			n = kbd.nextInt();
			m = kbd.nextInt();
			
			for(int j=0; j<n; j++)
				a[j] = kbd.nextInt();
			
			for(int j=0; j<m; j++)
				b[j] = kbd.nextInt();
			
			
			//min(A[indexA], B[indexB]), max(A[indexA], B[indexB])�� �����ϴ�
			//��ģ ���� �κ� ������ �ִ� ���̸� ��ȯ�Ѵ�.
			//�� indexA == indexB == -1 Ȥ�� A[indexA] != B[indexB]��� �����Ѵ�.
			
						
			int result = calLIS();
			System.out.println(result);
		}
	}
	
	public static int calLIS(int indexA, int indexB){
		//�޸������̼�
		int ret = cache[indexA+1][indexB+1];
		if(ret != -1) return ret;
		//A[indexA], B[indexB]�� �̹� �����ϹǷ� 2���� �׻� �ִ�.
		ret = 1;
		long aa = (indexA == -1 ? NEGINF : a[indexA]);
		long bb = (indexB == -1 ? NEGINF : b[indexB]);
		long maxElement = Math.max(aa, bb);
		//���� ���Ҹ� ã�´�.
		for(int nextA = indexA+1; nextA<n; ++nextA)
			if(maxElement<a[nextA])
				ret = Math.max(ret, calLIS(nextA, indexB)+1);
		
		for(int nextB = indexB+1; nextB<m; ++nextB)
			if(maxElement<b[nextB])
				ret = Math.max(ret, calLIS(indexA, nextB)+1);
		
		return ret;
	}
	
	static int lis(int s[]){
		int i, j;
		int h[] = new int[101];
		int p[] = new int[101];
		int max = 0;
		int index = 0;
		int MAX = 101;
		
		for(i=1; i<MAX; i++)
			for(j=0; j<i; j++)
				if(s[i]>s[j] && h[i]<h[j]+1){
					h[i] = h[j]+1;
					p[i] = j;
				}//�� ������ �ε����� ����
		
		for(i=1; i<MAX; i++){
			if(max<h[i]){
				max = h[i];
				index = i;
			}
		}
		
		int lis[] = new int[MAX];
		i = MAX;
		while(index!=0){
			lis[--i] = s[index];
			index = p[index];
		}
		
		System.out.println("longest increasing subseq : ");
		for(i=0; i<max; i++)
			System.out.print(lis[i]+" ");
		System.out.println();
		
		return max;
	}
	
}
