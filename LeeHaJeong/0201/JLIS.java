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
			
			
			//min(A[indexA], B[indexB]), max(A[indexA], B[indexB])로 시작하는
			//합친 증가 부분 수열의 최대 길이를 반환한다.
			//단 indexA == indexB == -1 혹은 A[indexA] != B[indexB]라고 가정한다.
			
						
			int result = calLIS();
			System.out.println(result);
		}
	}
	
	public static int calLIS(int indexA, int indexB){
		//메모이제이션
		int ret = cache[indexA+1][indexB+1];
		if(ret != -1) return ret;
		//A[indexA], B[indexB]가 이미 존재하므로 2개는 항상 있다.
		ret = 1;
		long aa = (indexA == -1 ? NEGINF : a[indexA]);
		long bb = (indexB == -1 ? NEGINF : b[indexB]);
		long maxElement = Math.max(aa, bb);
		//다음 원소를 찾는다.
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
				}//전 원소의 인덱스를 저장
		
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
