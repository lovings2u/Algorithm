import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int a = sc.nextInt();
        int result=0;
        for(long i=1; i<=n;i++){
            String temp = i+"";
            boolean isc = temp.contains(a+"");
            if(isc){
                for(int j=0;j<temp.length();j++){
                     if((temp.charAt(j)+"").equals(a+"")){
                         result++;
                     }
                }
                 
            }
        }
        System.out.println(result);
         
         
    }
      
}
