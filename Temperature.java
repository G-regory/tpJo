package convertion;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("Convertisseur degrés celsius et degré fahrenheit");
		int choix;
		double tempchoisi=0.0, tempconvert=0.0;
		String temporaire;
		char reponse=' ';
		Scanner clv = new Scanner(System.in);
		
		do {
			System.out.println("Choisissez le mode de conversion :");
			
			System.out.println("1 - Convertisseur Celsius - Fahrenheit");
			System.out.println("2 - Convertisseur Fahrenheit - Celsius");
			choix=clv.nextInt();
			if(choix==1 || choix==2){
				if(choix==1) {
					System.out.println("Températion à convertir :");
					tempchoisi=clv.nextDouble();
					tempconvert=(tempchoisi-32)*5/9 ;
					System.out.println(tempchoisi+" °F correspond à : "+tempconvert);
				}else {
					if(choix==2) {
						System.out.println("Températion à convertir :");
						tempchoisi=clv.nextDouble();
						tempconvert=(9/5)*tempchoisi+32 ;
						System.out.println(tempchoisi+" °C correspond à : "+tempconvert);
					}
				}System.out.println("Again (O/N)?");
				temporaire=clv.nextLine();
				reponse=temporaire.charAt(0);
			}else {
				System.out.println("Vous n'avez pas choisi de température correct");
			}
				
			
		}while(choix!=1 && choix !=2 || reponse=='o');

	}

}
