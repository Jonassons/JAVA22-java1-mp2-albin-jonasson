class Rabatt extends Varor {
	
	double rabatt;
	
Rabatt(String name, int pris, int antal, double rabatt) {
		super(name, pris, antal);
		this.rabatt = rabatt;
	}


 int rabbaterat() {
	
int pris = super.getPris();
double rabbat2 = pris * rabatt;
return (int) Math.round(rabbat2);

 }
 
}
