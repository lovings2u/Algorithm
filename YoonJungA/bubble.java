package c1010;

public class bubble {

	public static void bubble_sort(int data[]){
		
		
		for(int count=data.length-1;count>0;count--){
			
//			System.out.println();
			for(int right=1;right<data.length;right++){
				if(data[right-1]>data[right]){
					int temp = data[right-1];
					data[right-1] = data[right];
					data[right] = temp;
				}
			}
//			for(int i=0;i<data.length-1;i++)
//			System.out.print(data[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data[] = {4,4,3,2,1,2,3,15,22,1,2,3};
		
		bubble_sort(data);
		
		for(int i=0;i<data.length;i++)
			System.out.print(data[i]+" ");
		
	}

}
