package devoir_johan;

public class retournValeur {

	public static void main(String[] args) {
		String str="expression", inverse=new StringBuilder(str).reverse().toString(),troisChar = str.substring(7, 10);
		char carac = str.charAt(7);
		System.out.println(carac);
		System.out.println(troisChar);
		System.out.println(inverse);
		System.out.println("Met tes prochains exo dans un fichier readme stp");
	}

}
