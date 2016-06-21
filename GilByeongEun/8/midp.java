import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayCount = sc.nextInt();
        int inputX[] = new int[arrayCount];
        int inputY[] = new int[arrayCount];
        int oddodd=0;
        int eveneven=0;
        int evenodd=0;
        int oddeven=0;
        for(int i=0; i<arrayCount;i++){
            inputX[i]= sc.nextInt();
            inputY[i]= sc.nextInt();
            if(inputX[i]%2== 0 && inputY[i]%2==0)
            {
                eveneven++;
            }
            else if(inputX[i]%2!= 0 && inputY[i]%2==0)
            {
                oddeven++;
            }
            else if(inputX[i]%2== 0 && inputY[i]%2!=0)
            {
                evenodd++;
            }
            else if(inputX[i]%2!= 0 && inputY[i]%2!=0)
            {
                oddodd++;
            }
             
        }
        
        int result = (eveneven*(eveneven-1)/2) + (oddeven*(oddeven-1)/2) + (evenodd*(evenodd-1)/2) + (oddodd*(oddodd-1)/2);
        System.out.println(result);
    }
}
