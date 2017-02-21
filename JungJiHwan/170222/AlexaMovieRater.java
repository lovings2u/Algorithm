import java.util.*;

class Rate{
	int index, rate;
	public Rate(int index, int rate) {
		this.index = index;
		this.rate = rate;
	}
}

public class AlexaMovieRater {
	ArrayList<Rate> rates = new ArrayList<>();
	Scanner sc;
	public static void main(String[] args) {new AlexaMovieRater();}
	public AlexaMovieRater() {
		sc = new Scanner(System.in);
		System.out.println(movieRater());
	}
	private int movieRater() {
		int num = sc.nextInt();
		int maximum;
		int movie[] = new int[num];
		for(int i = 0; i<num; i++){
			movie[i] = sc.nextInt();
		}
		if(num == 0) return 0;
		else if(num == 1) return movie[0];
		
		maximum = movie[1];
		push(new Rate(0, movie[0]));
		push(new Rate(1, movie[1]));
		while(true){
			Rate rate = pop();
			if(rate == null) break;
			
			if(rate.index == (num - 1)){
				maximum = maximum>rate.rate ? maximum:rate.rate;
				continue;
			}
			if(rate.index == (num - 2)){
				if(movie[num-1]>0) maximum = maximum>rate.rate + movie[num-1] ? maximum:rate.rate+movie[num-1];
				else maximum = maximum>rate.rate ? maximum:rate.rate;
				continue;
			}

			push(new Rate(rate.index+1, rate.rate+movie[rate.index+1]));
			push(new Rate(rate.index+2, rate.rate+movie[rate.index+2]));
		}
		return maximum;
	}
	
	int front = 0, rear = -1;
	private void push(Rate rate) {
		rates.add(rate);
		rear++;
	}
	private Rate pop() {
		if(front > rear) return null;
		return rates.get(front++);
	}
}
