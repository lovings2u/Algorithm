import java.util.Scanner;

public class Tiles {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double width, height;
		double tiles, partTiles;
		
		width = sc.nextDouble();
		height = sc.nextDouble();
		
		tiles = Math.floor(width/8)*Math.floor(height/8);
		partTiles = Math.ceil(width/8)*Math.ceil(height/8)-tiles;
		
		System.out.println("The number of whole tiles is " + (int)tiles + " part tiles is " + (int)partTiles);
	}
}
