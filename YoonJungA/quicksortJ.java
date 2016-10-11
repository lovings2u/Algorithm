package c1010;

public class quicksortJ {

	public static void quick_sort(int[] data, int start, int end){
		
		if(start>end)
			return; //시작 값이 end값보다 크다는 것은 정렬이 완료 되었다는 뜻
		
		int key = start; //key인덱스는 가장 앞
		int left = start+1; //key값 바로 다음 인덱스가 left
		int right = end; //마지막 인덱스가 right
		
		while(left<=right){
			
			while(data[left]<=data[key] && left<end) left++;
			//왼쪽부터 이동하면서, 키값보다 큰 값의 인덱스 찾기
			
			while(data[right]>=data[key] && right>=start+1)	right--;
			//오른쪽부터 이동하면서, 키값보다 작은 값의 인덱스 찾기
			
			if(left>=right){ //left와 right가 엇갈리면
				//키값의 인덱스와 right의 인덱스에 있는 값을 바꾼다.
				int temp = data[key];
				data[key] = data[right];
				data[right] = temp;
			}else{ //left랑 right가 엇갈린게 아니면,
				//left의 값과, right의 값을 바꿔준다.
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;	
			}
		}
			
			//한번 수행하고 나면, 키값의 이동으로 키값의 앞부문과,뒷부분으로 나뉨, 이걸 재귀 
			quick_sort(data,start,right-1);
			quick_sort(data,right+1,end);
								
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data[] = {5,5,5,1,2,3,41,12,7};
		
		quick_sort(data,0,data.length-1);
		
		for(int i=0;i<data.length;i++)
			System.out.print(data[i]+" ");
		
	}
}
