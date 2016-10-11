package c1010;

public class quicksortJ {

	public static void quick_sort(int[] data, int start, int end){
		
		if(start>end)
			return; //���� ���� end������ ũ�ٴ� ���� ������ �Ϸ� �Ǿ��ٴ� ��
		
		int key = start; //key�ε����� ���� ��
		int left = start+1; //key�� �ٷ� ���� �ε����� left
		int right = end; //������ �ε����� right
		
		while(left<=right){
			
			while(data[left]<=data[key] && left<end) left++;
			//���ʺ��� �̵��ϸ鼭, Ű������ ū ���� �ε��� ã��
			
			while(data[right]>=data[key] && right>=start+1)	right--;
			//�����ʺ��� �̵��ϸ鼭, Ű������ ���� ���� �ε��� ã��
			
			if(left>=right){ //left�� right�� ��������
				//Ű���� �ε����� right�� �ε����� �ִ� ���� �ٲ۴�.
				int temp = data[key];
				data[key] = data[right];
				data[right] = temp;
			}else{ //left�� right�� �������� �ƴϸ�,
				//left�� ����, right�� ���� �ٲ��ش�.
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;	
			}
		}
			
			//�ѹ� �����ϰ� ����, Ű���� �̵����� Ű���� �պι���,�޺κ����� ����, �̰� ��� 
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
