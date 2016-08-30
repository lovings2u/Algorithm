package c0829;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


class Info{
	
	int number;
	int area;
	int hei;
	int wei;
	
	Info(){
		
	}
	Info(int number,int area,int hei,int wei){
		this.number = number;
		this.area = area;
		this.hei = hei;
		this.wei = wei;
	}
	
}

//ArrayList 객체 정렬 할때 필요한 class...
class InfoComparator implements Comparator<Info>{
	
	public int compare(Info first, Info second){
		int firstValue = first.area;
		int secondValue = second.area;
		
		//내림차순정렬
		if(firstValue > secondValue)
			return -1;  
		else if(firstValue < secondValue)
			return 1;
		else
			return 0;
	}
}

public class MyTop {
	
		
	static ArrayList<Info> info;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		info = new ArrayList<Info>();
		
		for(int i=0;i<num;i++){
			info.add(new Info(i+1,sc.nextInt(),sc.nextInt(),sc.nextInt()));
		}
		
		//ArrayList 넓이를 기준으로 정렬
		InfoComparator com = new InfoComparator();
		Collections.sort(info,com);
		
		/*
		for(int i=0;i<info.size();i++){
			System.out.println(info.get(i).area);
			System.out.println("+");
		} 
		*/
		
		ArrayList result = new ArrayList<Integer>();
		ArrayList temp = new ArrayList<Integer>();
		
		int maxhei=0; //최대 높이
		int curhei=0; //현재 높이
		int curwei=0; //현재 무게
		
		for(int i=0;i<info.size();i++){
			
			int j=i+1;
			curhei = info.get(i).hei; 
			curwei = info.get(i).wei;
			temp.add(info.get(i).number);
			
			if(i==info.size()-1){
				if(maxhei<info.get(i).hei){
					result.clear();
					result.add(info.get(i).number);
				}
				break;
			}
			
			while(true){
								
				if(curwei<info.get(j).wei){ 
					//현재의 무게보다 다음 벽돌의 무게가 더 크면 j를 증가시킴.
					j++; 
				}
				else{
					curhei += info.get(j).hei;
					curwei = info.get(j).wei; //무게를 이번 무게로 바꿔준다.
					temp.add(info.get(j).number);
					j++;
				}
				
				if(j==info.size()){
					
					if(maxhei<curhei){
						maxhei=curhei; //만약 이번 높이가 더 높으면
						result.clear(); //result list에 있는값 모두 삭제하고
						for(int k=0;k<temp.size();k++){
							result.add(temp.get(k)); //result에 새로 추가
						}
					}
					
					temp.clear();
					break;
				}				
			}			
		}
		

		System.out.println(result.size());
		for(int m=result.size()-1;m>=0;m--){
			System.out.println(result.get(m));
		}
	}
}


