package chch;

	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;
	 
	public class chessboard2 {
	 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Map<Integer, String> map = new HashMap<Integer, String>();
	        int q = 0;
	        for (int i = 0; i <= 2000; i++) {
	            if(i == 1){
	                map.put(q, 1+" "+ 1);
	                q++;
	            }
	            if(i%2 == 0){
	                for (int j = 1; j <= i; j++) {
	                    map.put(q, j +" " + i);
	                    q++;
	                }
	                for (int j= i-1; j >= 1; j--) {
	                    map.put(q, i +" " + j);
	                    q++;
	                }
	            }else if(i%2 != 0){
	                for (int j = 1; j <= i; j++) {
	                    map.put(q, i +" " + j);
	                    q++;
	                }
	                for (int j= i-1; j >= 1; j--) {
	                    map.put(q, j +" " + i);
	                    q++;
	                }
	            }
	        }
	        int a= sc.nextInt();
	        String coor = map.get(a);
	        System.out.println(coor);
	    }
	}