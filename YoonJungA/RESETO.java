package c0721;

import java.util.ArrayList;
import java.util.Scanner;

public class RESETO {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        Scanner sc = new Scanner(System.in);
         
        int N = sc.nextInt();
        int K = sc.nextInt();
         
        ArrayList<Integer> arr = new ArrayList();
         
        for(int i=2;i<=N;i++) 
            arr.add(i);
         
        int p=2;
        int count=0;
        String now = "go";
         
        while(now.equals("go")){
 
            for(int i=0;i<arr.size();i++){
                if(arr.get(i)%p==0){
                    count++;
                    if(count!=K){
                        arr.remove(i);
                        i--;
                    }
                    else{
                        System.out.println(arr.get(i));
                        now="stop";
                        break;
                    }
                }
            }
            p=arr.get(0);
        }
         
    }
 

}
