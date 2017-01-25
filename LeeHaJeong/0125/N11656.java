import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
public class N11656 {
	public static void main(String[] args){
		Scanner kbd = new Scanner(System.in);
		String s = new String();
		ArrayList<String> al = new ArrayList<>();
		
		s = kbd.nextLine();
		
		for(int i=0; i<s.length(); i++){
			al.add(s.substring(i, s.length()));
		}
		
		Collections.sort(al, new Comparator<String>(){
		      public int compare(String obj1, String obj2)
		      {
		            // TODO Auto-generated method stub
		            return obj1.compareToIgnoreCase(obj2);
		      }
		});
		
		for(int i=0; i<al.size(); i++)
			System.out.println(al.get(i));
	}
}
