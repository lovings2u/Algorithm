import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



class Block{
	//높이
	int height;
	//넓이
	int area;
	//무게
	int weight;
	//번호
	int index;
}

public class Q1539 {
	static ArrayList<Block> blockList;
	static int blockC;
	static int[] result;
	static String[] path;
	public static void main(String[] args) {
		//블럭 리스트 생성
		blockList = new ArrayList();
		Scanner sc = new Scanner(System.in);
		blockC = sc.nextInt();
		result = new int[blockC]; 
		path = new String[blockC];
		
		//입력부
		for(int i =0;i<blockC;i++){
			Block b = new Block();
			b.area = sc.nextInt();
			b.height = sc.nextInt();
			b.weight = sc.nextInt();
			b.index = i+1;
			blockList.add(b);
		}
		sort();
		
		dinamic();
		print();
	}
	//다이나믹 실행
	static public void dinamic(){
		path[0]="";
		for(int i=0;i<blockList.size();i++){
			Block curBlock = blockList.get(i);
			int maxVal = 0;
			int maxIndex=-1;
			for(int j=i-1;j>=0;j--){
				if(curBlock.weight>blockList.get(j).weight){
					if(maxVal<result[j]){
						maxVal = result[j];
						maxIndex = j;
					}
				}
			}
			result[i] = curBlock.height+maxVal;
			if(maxIndex==-1){
				path[i] = curBlock.index+"";
			}else{
				path[i] = path[maxIndex]+"\n"+curBlock.index;
			}
		}
//		System.out.println(Arrays.toString(result));
//		System.out.println(Arrays.toString(path));
	}
	static public void print(){
		int max=0;
		int maxI = 0;
		for(int i =0;i<blockC;i++){
			if(max<result[i]){
				max = result[i];
				maxI = i;
			}
		}
//		System.out.println(max);
		String str = path[maxI].trim();
		System.out.println(str.split("\n").length);
		System.out.println(path[maxI].trim());
	}
	//넓이를 이용한 정렬
	static public void sort(){
		for(int i=0;i<blockList.size();i++){
			for(int j=i+1;j<blockList.size();j++){
				Block curBlock = blockList.get(i);
				if(curBlock.area>blockList.get(j).area){
					blockList.set(i, blockList.get(j));
					blockList.set(j, curBlock);
				}
			}
		}
	}
	
	
}
