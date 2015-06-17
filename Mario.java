import java.io.Console;

public class Mario {
	public static void main (String[] args){
		System.out.println("I'm-a gonna make-a you-a a pyramid-a!");
		
		int pyramidInt;
		String pyramidHeight;
		Console c = System.console();
		while (true){
			pyramidHeight = c.readLine("How tall should I make that pyramid? ");
			try{
				pyramidInt = Integer.parseInt(pyramidHeight);
				if (pyramidInt <= 0) {
					System.out.println("Must be greater than 0");
					continue;
				}else{
					break;
				}
			} catch (NumberFormatException e){
				System.out.println("Not an integer, try again");
			}
		}
		for (int i = 1; i <= pyramidInt; i++) {
			for (int ii = i; ii < pyramidInt; ii++) {
				System.out.printf(" ");
			}
			for (int ii = 0; ii <= i; ii++) {
				System.out.printf("#");
			}
			System.out.printf("\n");

			
		}
	}
}
