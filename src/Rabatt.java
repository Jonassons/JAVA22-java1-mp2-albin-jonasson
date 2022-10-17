class Rabatt extends Varor {
	
	double rabatt;
	
Rabatt(String name, int pris, int antal, double rabatt) {
		super(name, pris, antal);
		this.rabatt = rabatt;
	}


 int rabbaterat() {
	

return (int) (getPris()*rabatt);
 }
 
}
