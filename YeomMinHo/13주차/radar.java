import java.util.Scanner;

public class radar {


   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int person;
      int radar_1, radar_2;
      double radarX_1, radarY_1;
      double radarX_2, radarY_2;
      double radarArea;
      
      double radarArea_1=0, radarArea_2=0;
      double[] personX, personY;
      double[][] arr;
      int resultMin=5000;
      double radius_1, radius_2;
      
      person = sc.nextInt();
      int personC;
      
      radarX_1 = sc.nextDouble();   radarY_1 = sc.nextDouble();
      radarX_2 = sc.nextDouble();   radarY_2 = sc.nextDouble();
      radarArea = sc.nextDouble();
      
      personX = new double[person]; 
      personY = new double[person];
      arr = new double[person][2];
      
      for (int i=0 ; i<person ; i++) {
         personX[i] = sc.nextDouble();
         personY[i] = sc.nextDouble();
         
         arr[i][0] = personX[i];
         arr[i][1] = personY[i];         // arr 이차원 배열에 데이터를 전부 입력.
      }
      
      for (int i=0 ; i<person ; i++) {
         radarArea_1 = (Math.pow(arr[i][0] - radarX_1, 2) + Math.pow(arr[i][1] - radarY_1, 2)) * 3.141;      // 첫번째 레이더 영억 구하기
         radarArea_2 = radarArea - radarArea_1;      // 두번째 레이더 영역 구하기
         personC = person;      // 입력받은 person 으로 초기화

         if (radarArea_1 <= radarArea) {      // 레이더 영역이 입력된 영역보다 작을 때만 계산
            
             for (int j=0 ; j<person ; j++) {
                radius_1 = Math.sqrt(Math.pow(arr[j][0] - radarX_1, 2) + Math.pow(arr[j][1] - radarY_1, 2));
                radius_2 = Math.sqrt(Math.pow(arr[j][0] - radarX_2, 2) + Math.pow(arr[j][1] - radarY_2, 2));
                if ( Math.pow(radius_1, 2) * 3.141 <= radarArea_1) {
                   personC--;
                } else if ( Math.pow(radius_2, 2) * 3.141 <= radarArea_2) {
                   personC--;
                } else {
                   continue;
                }
             }
             
         }
         
         resultMin = Math.min(resultMin, personC);
      }
      
      System.out.println(resultMin);
   }
}