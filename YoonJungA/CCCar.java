package c0818;

import java.util.ArrayList;
import java.util.Scanner;

public class CCCar {


	static String way="";
	static int max_dis;
	static int num_repair;
	static int dis_repair [];
	static int time_repair [];
	
	static ArrayList<Integer> now = new ArrayList(); //���°������ �ǹ�
	static ArrayList<Integer> min = new ArrayList(); //�ּ� �ð� ����
	static ArrayList<String> min_repair = new ArrayList(); //���Ŀ������
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		
		max_dis = sc.nextInt();
		num_repair = sc.nextInt();
		dis_repair = new int[num_repair+1];
		time_repair = new int[num_repair+1];
		
		for(int i=0; i<dis_repair.length;i++){
			dis_repair[i]=sc.nextInt();
		}
		for(int i=0; i<time_repair.length-1;i++){
			time_repair[i]=sc.nextInt();
		}
		time_repair[time_repair.length-1]=0; //�������� ���� �ð��� 0������
		
		//1�� ����ұ��� ���� �ϴµ� �ɸ��� �ּ� �ð��� �ڱ��ڽ�
		now.add(1); //0==1�������
		min.add(time_repair[0]);
		min_repair.add("1"); //0==1�������
		
		//2�� ����ұ��� �����ϴµ� �ɸ��� �ּ� �ð�
		int far=0;
		for(int j=0;j<2;j++){
			far+=dis_repair[j];
		}
		if(far>max_dis){
			min.add(time_repair[0]+time_repair[1]);
			min_repair.add("12");
			now.add(2);
			now.add(2);
		}
		else{
			int temp = time_repair[0]+time_repair[1];
			if(temp>=time_repair[1]){
				min.add(time_repair[1]);
				min_repair.add("2");
				now.add(2);
			}
			else{
				min.add(temp);
				min_repair.add("12");
				now.add(2);
				now.add(2);
			}
		}
		
		//3��° ����� ���ʹ� �Լ� ȣ��
		for(int i=2;i<num_repair+1;i++){
			
			method_check(i);
	
			System.out.println(min_repair.get(min_repair.size()-1));
		}

	}

	public static void method_check(int i){
			
		int check_place = i;
		int time = 1000;
		//String way ="00000";
		
		
		int sum=0;
		for(int m=0; m<check_place+1;m++)
			sum += dis_repair[m];
		
		if(sum>max_dis){}
		else{
			if(time>time_repair[i]){
				time=time_repair[i];
				way=Integer.toString(i);
			}
		}
		
		int count = min_repair.size();
		
		for(int n=0;i<count;i++){
			
			String st = min_repair.get(n);
			int fnum = (st.charAt(st.length()-1))-48;
			
			int sumsum=0;
			for(int p=fnum; p<check_place+1;p++)
				sumsum += dis_repair[p];
			
			if(sumsum>max_dis){}
			else{
				if(time>min.get(n)+time_repair[check_place]){
					time=min.get(n)+time_repair[check_place];
					way=min_repair.get(n)+Integer.toString(check_place);
				}
			}	
		}
		
		min.add(time);
		min_repair.add(way);		
	}

}
