import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int orgin = sc.nextInt();
        float rate = sc.nextInt();
        float sale = sc.nextInt();
        float result = orgin +( orgin * rate/100 );
        		result = result - (result * sale/100); //판매가격
        if(result-orgin>0){
        	System.out.println(Math.round(result-orgin));
        }else{
        	System.out.println("loss");
        }
        sc.close();
    }
   
}