
public class Trekkerband {

	public int price;
	
	public int luchtinhoud;
	
	public int profieldikte;
	
	public String name;
	
	public boolean versleten;
	
	public void setPrice(int newPrice) {
		price = newPrice;
	}
	public void setLuchtinhoud(int newLuchtinhoud) {
		luchtinhoud = newLuchtinhoud;
	}
	public void setProfieldikte(int newProfieldikte) {
		profieldikte = newProfieldikte;
	}
	public void setName(String newName) {
		name = newName;
	}
	public void setVersleten(boolean newVersleten) {
		versleten = newVersleten;
	}
	
	public boolean isExpensive() {
		return price > 1100;
	}
	
	public void printDetails() {
		System.out.println("price = " + price);
		System.out.println("luchtinhoud = " + luchtinhoud);
		System.out.println("profieldikte = " + profieldikte);
		System.out.println("name = " + name);
		System.out.println("versleten = " + versleten);
	}
	
	public Trekkerband() {
		System.out.println("In constructor Trekkerband");
	}
	public Trekkerband(int price, int luchtinhoud, int profieldikte, String name, boolean versleten) {
		this.price = price;
		this.luchtinhoud = luchtinhoud;
		this.profieldikte = profieldikte;
		this.name = name;
		this.versleten = versleten;
		
	}
	
	}

