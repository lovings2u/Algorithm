import java.util.Scanner;
public class Fill {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		
		double speed=kbd.nextDouble();
		int weight=kbd.nextInt();
		int power=kbd.nextInt();
		
		int index=0;
		
		String [] position = new String[4];
		for(int i=0; i<position.length; i++)
			position[i]=" ";
		
		if(speed<=4.5 && weight>=150 && power>=200)
			position[index++] = "Wide Receiver";
		if(speed<=6.0 && weight>=300 && power>=500)
			position[index++] = "Lineman";
		if(speed<=5.0 && weight>=200 && power>=300)
			position[index++] = "Quarterback";
		if(index==0)
			position[index] = "No positions";
		
		for(int i=0; i<position.length; i++)
			if(position[i] != " ")
				System.out.print(position[i]+" ");

	}

}
