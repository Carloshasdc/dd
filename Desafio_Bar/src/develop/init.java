package develop;

public class init {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public double feeding() {
		return (beer * 5) + (softDrink * 3) + (barbecue * 7);
	}

	public double cover() {
		double result = this.feeding();
		double cover = 0;
		
		if (result < 30) {
			cover = 4;
		} else if (cover == 0) {
			System.out.println("Isento de Couvert");
		}
		return cover;
	}

	public double tickt() {
		double tickt = 0;

		if (this.gender == 'M') {
			tickt = 10;
		} else {
			if (this.gender == 'F') {
				tickt = 8;
			}
		}
		return tickt;
	}

	public double total() {
		
    return this.cover()+ this.feeding()+ this.tickt();     
     
	}
}
