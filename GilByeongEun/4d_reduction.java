Enter file contents hereimport java.util.Scanner;
public class Main {
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
       int awidth = sc.nextInt();
       int aheight = sc.nextInt();
       int bwidth = sc.nextInt();
       int bheight = sc.nextInt();
       double amax,amin;
       double bmax,bmin;
       if(awidth>aheight){
           amax = awidth;
           amin = aheight;
       }
       else{
           amax = aheight;
           amin = awidth;
       }
       if(bwidth>bheight){
           bmax = bwidth;
           bmin = bheight;
       }
       else{
           bmax = bheight;
           bmin = bwidth;
       }
       double maxrate = (bmax / amax) * 100.0;
       double minrate = (bmin / amin) * 100.0;      
       if(maxrate < minrate)
       {
           if(100<maxrate){
               System.out.println("100%");
           }
           else{
               System.out.println((int)maxrate+"%");
           }
       }
       else{
           if(100<minrate){
               System.out.println("100%");
           }
           else{
               System.out.println((int)minrate+"%");
           }
       }
    }
}
