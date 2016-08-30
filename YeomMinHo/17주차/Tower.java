import java.util.ArrayList;
import java.util.Scanner;

public class Tower {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Tower t = new Tower();
		
		int input;
		input = sc.nextInt();
		
		int[] bottomArea = new int[input];
		int[] height = new int[input];
		int[] weight = new int[input];
		int[] tempArray = new int[input];
		
		int count=0;
		
		for (int i=0 ; i<input ; i++) {
			bottomArea[i] = sc.nextInt();
			height[i] = sc.nextInt();
			weight[i] = sc.nextInt();
		}
		
		tempArray = bottomArea.clone();
		
		t.sortDown(bottomArea, height, weight);
		
		for (int i=0 ; i<input ; i++) {
			System.out.print(bottomArea[i] + " ");
			System.out.print(height[i] + " ");
			System.out.println(weight[i]);
		}	

		int a = 0;
		int tempWeight = 0;
		int tempHeight = 0;
		int tempCount = 0;
		int maxHeight = 0;
		ArrayList<Integer> tempResult = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for (int n = 0; n < input-1; n++) {
			tempCount = 0;
			tempHeight = 0;
			tempWeight = weight[n];
			tempResult.clear();
			a = n;
			while (true) {
				// System.out.println("a : " + a + " tempWeight : " + tempWeight
				// + " weight[a+1] : " + weight[a+1]);
				if (a == n) {
					tempCount++;
					tempResult.add(bottomArea[a]);
					tempHeight += height[a];
					// System.out.println(bottomArea[a]);
				}

				if (tempWeight > weight[a + 1]) {
					tempCount++;
					tempWeight = weight[a + 1];
					tempHeight += height[a + 1];
					// System.out.println("bottomArea[a+1] : " + bottomArea[a+1]
					// + " count : " + count);
					tempResult.add(bottomArea[a + 1]);
				}

				a++;

				if (a + 1 >= input) {
					break;
				}
			}
			
			if (tempHeight >= maxHeight) {
//				System.out.println(tempHeight + " " + maxHeight);
				count = tempCount;
				maxHeight = tempHeight;
				result.clear();
				result.addAll(tempResult);	
			}
		}
		
		for (int i=0 ; i<result.size() ; i++) {
			System.out.println("result : " + result.get(i));
		}
		
		result = t.resultSortUp(result);
		
		System.out.println(count);
		int brickNum;
		for (int i=0 ; i<result.size() ; i++) {
			brickNum = 0;
			for (int j=0 ; j < tempArray.length ; j++) {
				brickNum++;
//				System.out.println("(int)result.get(i) : " + (int)result.get(i) + " tempArray[j] : " + tempArray[j]);
				if ((int)result.get(i) == tempArray[j]) {
					break;
				}
			}
//			System.out.println(result.get(i));
			System.out.println(brickNum);
		}
	}
	
	public void sortDown (int[] bottomArea, int[] height, int[] weight) {		// 벽돌 면적을 기준으로 내림차순으로 정렬. 
		for (int i=0 ; i < bottomArea.length ; i++) {
			for (int j=i+1 ; j < bottomArea.length ; j++) {
				if (bottomArea[i] < bottomArea[j]) {
					change(bottomArea, i, j);
					change(height, i, j);
					change(weight, i, j);
				}
			}
		}		
	}
	
	public int[] change (int[] array, int i, int j) {
		int temp = 0;
		
		temp = array[j];
		array[j] = array[i];
		array[i] = temp;
		
		return array;
	}
	
	public ArrayList resultSortUp (ArrayList<Integer> array) {	// 사용 된 벽돌을 오름차순으로 정렬.
		int temp = 0;
		
		for (int i=0 ; i < array.size() ; i++) {
			for (int j=i+1 ; j < array.size() ; j++) {
				if (array.get(i) > array.get(j)) {
					temp = array.get(i);
					array.set(i, array.get(j));
					array.set(j, temp);
				}
			}
		}	
		
		return array;
	}
}

