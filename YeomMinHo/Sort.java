import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Sort {

   public static void main(String[] args) {
        int[] numberArr = null;
        
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
          String input = br.readLine();
          String[] numStrList = input.split(" ");
          
          numberArr = new int[numStrList.length];
          for (int i=0 ; i<numberArr.length ; i++) {
             numberArr[i] = Integer.parseInt(numStrList[i]);
          }
          
        } catch (IOException e) {
            e.printStackTrace();
        }   

        int[] copyArr = numberArr.clone();
        Sort s = new Sort();
      
        System.out.print("selectionSort : ");
        s.selectionSort(numberArr);
        s.resultPrint(numberArr);
      
        numberArr = copyArr;   // 원래의 배열로 초기화
        System.out.print("bubbleSort    : ");
        s.bubbleSort(numberArr);
        s.resultPrint(numberArr);

        numberArr = copyArr;   // 원래의 배열로 초기화
        System.out.print("insertionSort : ");
        s.insertionSort(numberArr);
        s.resultPrint(numberArr);
      
        numberArr = copyArr;   // 원래의 배열로 초기화
        System.out.print("quickSort     : ");
        s.quickSort(numberArr, 0, numberArr.length-1);
        s.resultPrint(numberArr);
   }
   
   // 처음에 있는 키를 가지고 나머지 키와 비교하여 제일 작은 값을 첫 번째 위치에 놓고 비교하는 동안 첫 번째 값보다 더 작은 값이 발견되면 항상 첫 번째 값과 그 작은 값을 서로 교환한다. 
   // 이러한 과정이 완료되면 가장 작은 값이 첫 번째 위치에 존재하게 된다. 다음에 두 번째 작은 값을 찾고 이를 두 번째 위치에 놓는다. 이런 과정을 반복ㆍ실행하면 정렬이 된다.
   void selectionSort(int[] numberArr) {
      int pos = 0;      
      int temp = 0;
      
      for (int i=0 ; i<numberArr.length-1 ; i++) {
         pos = i;   
         
         for (int j=i+1 ; j<numberArr.length ; j++) {
            if (numberArr[pos] > numberArr[j]) {      // 기준값 numberArr[pos]와 그 뒤에 있는 데이터를 전부 비교해서 기준값이 크면 그 위치를 기억함.
               pos = j;
            }
         }
         
         temp = numberArr[pos];            // swap
         numberArr[pos] = numberArr[i];
         numberArr[i] = temp;
         
      }
   }
   
   // 서로 이웃한 데이터들을 비교하며 가장 큰 데이터를 가장 뒤로 보내며 정렬하는 방식
   void bubbleSort(int[] numberArr) {
      int temp = 0;
      
      for (int i=0 ; i<numberArr.length-1 ; i++) {
         for (int j=0 ; j<numberArr.length-1-i ; j++) {
            
            if (numberArr[j] > numberArr[j+1]) {   // swap
               temp = numberArr[j];
               numberArr[j] = numberArr[j+1];
               numberArr[j+1] = temp;
            }
            
         }
      }
   }
   
   // 아직 정렬되지 않은 임의의 데이터를 이미 정렬된 부분의 적절한 위치에 삽입해 가며 정렬하는 방식
   void insertionSort(int[] numberArr) {
      int pos = 0;
      int temp = 0;
      
      for (int i=1 ; i<numberArr.length ; i++) {
         pos = i-1;
         temp = numberArr[i];
         
         while(pos >= 0 && temp < numberArr[pos]) {      // pos(기준값)보다 앞쪽의 원소는 모두 훑어본다.
            numberArr[pos+1] = numberArr[pos];         // 기준값보다 해당 배열의 값이 큰 경우에 배열 값을 오른쪽으로 밀어낸다.
            
            pos--;
         }
         
         numberArr[pos+1] = temp;
      }
   }
   
   // 기준키를 기준으로 작거나 같은 값을 지닌 데이터는 앞으로, 큰 값을 지닌 데이터는 뒤로 가도록 하여 작은 값을 갖는 데이터와 큰 값을 갖는 데이터로 분리해가며 정렬하는 방법
   void quickSort(int[] numberArr, int leftPs, int rightPs) {
      int left = leftPs;
      int right = rightPs;
      int pivot = (leftPs + rightPs) / 2;		// 기준 값 pivot 의 값
      
      while (left <= right) {
    	  while (numberArr[left] < numberArr[pivot])	left++;			// 배열의 pivot 위치를 기준으로 왼쪽에서 기준값보다 큰 값의 위치를 찾음.
    	  while (numberArr[right] > numberArr[pivot])	right--;		// 배열의 pivot 위치를 기준으로 오른에서 기준값보다 작은 값의 위치를 찾음.
    	  
    	  if (left <= right) {				// 위에서 찾은 두 개의 값 위치를 바꿈(swap).
    		  int temp = numberArr[left];
    		  numberArr[left] = numberArr[right];
    		  numberArr[right] = temp;
    		  
    		  left++;
    		  right--;
    	  }
      }
      
      if (leftPs < right) {					// 반복문을 빠져나온 후 pivot보다 작은 부분과 큰 부분을 각각 재귀호출.
    	  quickSort(numberArr, leftPs, right);
	  }
	  if (rightPs > left) {
		  quickSort(numberArr, left, rightPs);
	  }
   }
   
   void resultPrint(int[] arr) {
      
      for(int i=0 ; i<arr.length ; i++) {
         System.out.print(arr[i] + " ");
      }

      System.out.println("");
   }

}