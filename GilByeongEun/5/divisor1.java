import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        long end = sc.nextLong();
        int result=0;
        long resultsum=0;
        start = (long) Math.ceil(Math.sqrt((double) start));
        end = (long) Math.floor(Math.sqrt((double) end));
        for(long i=start; i<=end; i++){
            
          resultsum += (i*i);
          result++;
        }
        resultsum = resultsum % 1000000003;
        System.out.println(result + " "+resultsum);
    }
       
}
