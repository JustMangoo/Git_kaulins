import java.util.Random;

public class Kaulins {
	
	static void mestKaulinu(){
		Random rand = new Random();
		int skaitlis = rand.nextInt(6)+1;
		System.out.print("uzkrita: "+skaitlis);
	}

	public static void main(String[] args) {
		mestKaulinu();
	}

}
