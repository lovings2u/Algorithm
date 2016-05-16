import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int min=-1;
        int sum=0;
        for(int i=0; i<7; i++){
        	int input = sc.nextInt();
        	if(input%2==1){
        		sum +=input;
        		if(min>input || min==-1){
            		min = input;
            	}
        	}
        }
        if(sum!=0)
        	System.out.println(sum);
        System.out.println(min);
    }
   
}