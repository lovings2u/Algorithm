import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<Character>();
        List<Integer> flist = new ArrayList<Integer>();
        List<Integer> slist = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        list.add(0, (char) 32);
        for (char i = 97; i <= 122; i++) {
            list.add(i);
        }
        String second = sc.nextLine();
        String first = sc.nextLine();
        while(true){
            if(first.length() != second.length()){
                for (int i = 0; i < first.length(); i++) {
                    first += first.charAt(i);
                    if(first.length() == second.length()){
                        break;
                    }
                }
            }else{
                break;
            }
        }
        for (int i = 0; i < first.length(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(first.charAt(i)== list.get(j)){
                    flist.add(list.indexOf(list.get(j)));
                }
            }
        }
        for (int i = 0; i < second.length(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(second.charAt(i)==list.get(j)){
                    slist.add(list.indexOf(list.get(j)));
                }
                if(second.charAt(i)==list.get(0)){
                }
            }
        }
        for (int i = 0; i < flist.size(); i++) {
            if(slist.get(i)>flist.get(i)){
                int a = slist.get(i)- flist.get(i);
                result.add(a);
            }else if(slist.get(i)<flist.get(i)){
                int a = 26 - (flist.get(i) - slist.get(i));
                result.add(a);
            }else if(slist.get(i)==flist.get(i)){
                int a = 26;
                result.add(a);
            }
            if(slist.get(i)==0){
                result.remove(i);
                result.add(i, 0);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.print(list.get(result.get(i)));
        }
    }
}