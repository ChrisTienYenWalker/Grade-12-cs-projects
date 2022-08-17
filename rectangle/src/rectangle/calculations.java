package rectangle;

public class calculations {
	public void draw() {
		String inside = "";
		for(int i = 0; i < 4; i++) {
			inside = inside +  "|     |\n";
		}
		String top =    " _____";
		System.out.printf(top + "\n" + inside + top);
//		String top =    " _____\n";
//		System.out.printf(top);
//		for(int i = 0; i < 4; i++) {
//			System.out.printf("|     |\n");
//		}
//		System.out.printf(top,"\n");
//
	}
}
