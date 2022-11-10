import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		Varor vara1 = new Varor("Pringles", 20, 5);
		Varor vara2 = new Varor("Apples", 5, 10);
		Kund kund1 = new Kund(0, 0);
		Rabatt rab = new Rabatt("Snus", 5, 10, 0.80);

		boolean running = true;
		while(running) {
			
		
		
		System.out.println("1.  Buy "+ vara1.name +"  "+ vara1.getPris() +" SEK  "+ vara1.antal+ " Left ");
		System.out.println("2.  Buy "+ vara2.name +"  "+ vara2.getPris() +" SEK  "+ vara2.antal+ " Left ");
		System.out.println("3.  Buy "+ rab.name  + "  "+ rab.rabbaterat() +" SEK  "+ rab.antal+ " Left ");
		System.out.println("4.  Avsluta och betala");

		int pickVara = sc.nextInt();
		
		switch(pickVara) {
		case 1:
			kund1.kundVagn(1, vara1.getPris());
			vara1.howManyLeft();
			
		break;
		
		case 2:
			
			kund1.kundVagn(1, vara2.getPris());
			vara2.howManyLeft();
			
		break;
		
		case 3:
			rab.howManyLeft();
			kund1.kundVagn(1, rab.rabbaterat());
			
		break;
		
		case 4:
			
			System.out.println("Du har valt att avsluta");
			
			System.out.println("Du har köpt "+ kund1.varor + " Varor och priset är " +kund1.pris + "SEK");
			
		running = false;
	
		}
		
		}
	
		sc.close();
		
	}
	

}