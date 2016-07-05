import java.util.ArrayList;import java.util.List;import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Float> list = new ArrayList<Float>();
        while(true){
            float f = sc.nextFloat();
            if(f==  999.0){ break;
            }else{list.add(f);}
        }
        for (int i = 1; i < list.size(); i++) {
            float result = list.get(i)-list.get(i-1);
            System.out.println(String.format("%.2f", result));
        }System.out.println("End of Output");
    }
}