//import java.util.Scanner;
//
//public class CarRace {
//   public static void main (String[] args) {
//      Scanner sc = new Scanner(System.in);
//      
////-------------------------- 입력 ------------------------------
//      int maxDistance;
//      int mNum;
//      int tempDistance=0;
//      
//      maxDistance = sc.nextInt();
//      mNum = sc.nextInt();
//      
//      int[] mechanicDistance = new int[mNum+1];
//      int[] mTime = new int[mNum+2];
//      
//      for (int i=0 ; i<mNum+1 ; i++) {
//         mechanicDistance[i] = sc.nextInt();
//      }
//
//      for (int i=1 ; i<=mNum ; i++) {
//         mTime[i] = sc.nextInt();
//      }
//      mTime[0] = 99999;   mTime[mNum+1] = 99999;
////-------------------------- 입력 ------------------------------
//   
//      int i = 0;
//      int temp = 99999;
//      int count = 0;
//      int startL = 0;
//      int resultTotalTime = 0;
//      int resultCarshopNum = 0;
//      String resultCarshop = "";
//      
//      while (true) {   
//         
//         tempDistance += mechanicDistance[i];
//         if (tempDistance <= maxDistance) {
//            count++;
//         } else {
//            tempDistance = 0;
//            for (int j = i-count+1 ; j<=i ; j++) {
//               if (temp > mTime[j]) {
//                  temp = mTime[j];
//                  startL = j;
//               }
//            }
//
//            resultTotalTime += temp;
//            resultCarshopNum++;
//            resultCarshop = resultCarshop.concat(String.valueOf(startL) + " ");
//            
//            count = 0;
//            temp = 99999;
//            i = startL-1;
//         }
//         i++;
//         
//         if (i > mNum) {
//            break;
//         }
//      }
//      
//      if (resultTotalTime == 0) {
//         System.out.println("0");
//      } else {
//         System.out.println(resultTotalTime);   
//         System.out.println(resultCarshopNum);
//         System.out.println(resultCarshop);
//      }
//   }
//   
//   public void cal() {
//      
//   }
//}

import java.util.Scanner;

public class CarRace {
   static int maxDistance;
   static int mNum;
   static int[] mechanicDistance;
   static int[] mTime;
   static int resultTotalTime;
   static int resultCarshopNum;
   static String resultCarshop = "";
   static int count = 0;

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      CarRace cr = new CarRace();

      // -------------------------- 입력 ------------------------------
      maxDistance = sc.nextInt();
      mNum = sc.nextInt();

      mechanicDistance = new int[mNum + 1];
      mTime = new int[mNum + 2];

      for (int n = 0; n < mNum + 1; n++) {
         mechanicDistance[n] = sc.nextInt();
      }

      for (int n = 1; n <= mNum; n++) {
         mTime[n] = sc.nextInt();
      }
      mTime[0] = 99999;
      mTime[mNum + 1] = 0;
      // -------------------------- 입력 ------------------------------

      cr.cal();

      if (resultTotalTime == 0) {
         System.out.println("0");
      } else {
         System.out.println(resultTotalTime);
         System.out.println(resultCarshopNum);
         System.out.println(resultCarshop);
      }
   }

   public void cal() {
      int min = 99999;
      int temp = 0;
      int startL = 0;
      int i = 0;
      int sCount = 0;
      int check = 0;
      int checkOT = 0;
      boolean bb = true;
      
      while (true) {

         i = maxCount(i);
         System.out.println(" " + count + " " + i + " " + startL);

         
         for (int j = i - count + 1 ; j <= i ; j++) {
//        	 System.out.println("1");
        	 for (int k = 1 ; k <= count ; k++) {
//        		 System.out.println("j : " + j + " k : " + k);
        		 if (mTime[j+k] == 0){
//        			 System.out.println ("j : " + j + " count : " + count + " k : " + k);
        			 if (mTime[j] < mTime[j+k-1]) {
            			 startL = j; 
        			 } else {
//        	        	 System.out.println("checkOT1 : " + checkOT);
        				 startL = j + k - checkOT;
//        				 System.out.println("check : " + check + " startL : " + startL);

        			 }
        			 temp = mTime[startL];
//        			 System.out.println("startL : " + startL);
        			 bb = false;
        		 }
        		 
        		 if (j+k > mNum || count > mNum) {
        			 break;
        		 }

//				 System.out.println("check1 : " + check + " startL1 : " + startL);
//                 System.out.println("min : " + min + " j : " + j + " k : " + k);
        		 if (min > mTime[j] + mTime[j+k]) {
        			 min = mTime[j] + mTime[j+k];
        			 temp = mTime[j];
        			 startL = j;
        			 checkOT = 0;
//                     System.out.println("min : " + min + " temp : " + temp + " startL : " + startL);
        		 }
            	 checkOT++;
        	 }
        	 if (bb == false) {
        		 break;
        	 }
//        	 System.out.println("checkOT : " + checkOT);
          }
         
         i = startL;
         
         if (check == startL) {
        	 break;
         }
         resultTotalTime += temp;
         if ( startL != mNum+1 ) {
             resultCarshopNum++;
             resultCarshop = resultCarshop.concat(String.valueOf(startL) + " "); 
         }
         
//         System.out.println(" " + count + " " + i + " " + startL);
         if (i >= mNum) {
            break;
         }
         

    	 
         count = 0;
         min = 99999;
		 check = startL;
      }
   }

   public int maxCount(int i) {
      int tempDistance = 0;
      while (true) {
         tempDistance += mechanicDistance[i];
//         System.out.println(i);
         System.out.println(tempDistance);
         if (tempDistance <= maxDistance) {
            count++;
         } else {
            break;
         }
         i++;
//         System.out.println("mNum : " + mNum);
         if (i > mNum) {
            break;
         }
      }
      return i;
   }
}