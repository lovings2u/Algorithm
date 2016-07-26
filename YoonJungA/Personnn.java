package c0721;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
public class Personnn {

	public static void main(String[] args) {
		 
        Scanner sc = new Scanner(System.in);
         
        int N = sc.nextInt();
        double x1 = sc.nextDouble(); double y1 = sc.nextDouble();
        double x2 = sc.nextDouble(); double y2 = sc.nextDouble();
        double k=sc.nextDouble();
         
        double [] Xperson = new double[N];
        double [] Yperson = new double[N];
         
        ArrayList<Double> dis1 = new ArrayList(); //반지름의 제곱
        ArrayList<Double> dis2 = new ArrayList();
         
        for(int i=0;i<N;i++){
            Xperson[i]=sc.nextDouble();
            Yperson[i]=sc.nextDouble();
        }
         
        double limit = k/(3.141); //limit = r^2+r^2 
 
        for(int i=0;i<N;i++){
            dis1.add(Math.pow(x1-Xperson[i],2)+Math.pow(y1-Yperson[i],2));
            dis2.add(Math.pow(x2-Xperson[i],2)+Math.pow(y2-Yperson[i],2));
        }
         
        dis1.add(0,0.0); dis2.add(0,0.0); //둘 중 하나만 사용할 때를 확인하기 위해
        Collections.sort(dis1);
        Collections.sort(dis2);
         
        ArrayList<Integer> number = new ArrayList();
         
        int dis1_num=0; int dis2_num=0;
        int m=0; int n=0;
         
        for(m=0;m<dis1.size();m++){
            for(n=0;n<dis2.size();n++){
                 
                if(dis1.get(m)+dis2.get(n)<=limit){
                    dis1_num=m; dis2_num=n;
                }
                else break;
            }       
            number.add(dis1_num+dis2_num);
        }
         
        Collections.sort(number);
        int max = number.get(number.size()-1);
 
        int result = N-max;
        if(result<0) result=0;
        System.out.println(result);

    }

	
}
