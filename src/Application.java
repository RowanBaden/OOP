
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
		// met "new" kunnen we een nieuwe product object aanmaken
		Product product1 = new Product();
		Product product2 = new Product();
		
		// Passen we de gegevens van product 1 aan
		//product1.name = "TV";
		//product1.price = 123.50;
		product1.printPrice();
		product1.setPrice(250);
		
		// Passen we de gegevens van product 2 aan
		//product2.name = "laptop";
		//product2.price = 850.12;
		product2.printPrice();
		product2.setPrice(920.50);
		
		//System.out.println("Product 2 prijs is " + product2.price);
		
		boolean outcome = product2.isExpensive();
		System.out.println("Product 2 duur: " + outcome);
		
		Product product3 = new Product(34.75);
		System.out.println("Product 3 prijs = " + product3.getPrice());
		
		
		Trekkerband trekkerband1 = new Trekkerband();
		Trekkerband trekkerband2 = new Trekkerband();
		
		trekkerband1.name = "John Deere";
		trekkerband1.price = 999;
		trekkerband1.profieldikte = 10;
		trekkerband1.versleten = false;
		trekkerband1.luchtinhoud = 40;
		trekkerband1.printDetails();
		trekkerband1.setPrice(1099);
		trekkerband1.setProfieldikte(11);
		trekkerband1.setLuchtinhoud(41);
		trekkerband1.setName("John Deere 2.0");
		trekkerband1.setVersleten(true);
		
		
		
		trekkerband2.name = "Krachtzat";
		trekkerband2.price = 699;
		trekkerband2.profieldikte = 10;
		trekkerband2.versleten = true;
		trekkerband2.luchtinhoud = 0;
		trekkerband2.printDetails();
		
		System.out.println("Trekkerband 1 prijs is " + trekkerband1.price);
		System.out.println("Trekkerband 1 profieldikte is " + trekkerband1.profieldikte);
		System.out.println("Trekkerband 1 luchtinhoud is " + trekkerband1.luchtinhoud);
		System.out.println("Trekkerband 1 name is " + trekkerband1.name);
		System.out.println("Trekkerband 1 versleten is " + trekkerband1.versleten);
		
		outcome = trekkerband1.isExpensive();
		System.out.println("Trekkerband 1 duur: " + outcome);
		
		new Trekkerband(1100, 12, 50, "Working Talent", true);
	}
	
	
}