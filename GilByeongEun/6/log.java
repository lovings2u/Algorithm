import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt(); 
        int bottom=0; 
        //바닥 통나무 갯수 구하기
        for(int i=1;i<num;i++){ 
        if(i*(i+1)/2<num) 
         bottom=i+1; 
        } 
        int top=0; 
        int tempBottom=bottom; 
        int count=0; 
        while(true){ 
            //꼭대기 범위
            while(num>bottom-count){ 
                num-=tempBottom; //통나무 총 개수에서 바닥 한줄씩 빼기 
                tempBottom--; 
                count++;            
            } 
            top=num; 
            break; 
        }                       
         System.out.println(bottom+" "+top); 
   } 
}
