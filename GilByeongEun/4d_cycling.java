package algo;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int gil[] = new int[input];
        int result=0;
        int min=-1;
        int max=-1;
 
        for(int i=0; i<input; i++ ){
               gil[i] = sc.nextInt();
            if(i>0 && gil[i-1] < gil[i]){
                 
                if(min==-1){
                    min = gil[i-1];
                     
                }
                if(max<gil[i])
                    max = gil[i];
            }
            else if(i>0&& gil[i-1] >= gil[i]){
                 
                if(min!=-1){
                    if(result < max-min){
                        result = max-min;
                    }
                    max = -1;
                    min = -1;
                }
                 
            }
             
            if(max!=-1 && i== gil.length-1)
            {
                if(result < max-min){
                    result = max-min;
                }
                max = -1;
            }
             
        }
     
        System.out.println(result);
         
    }
     
}
