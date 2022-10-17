

class Kund {

	int varor;
	double pris;
	
Kund(int varor, int pris){
	this.pris = pris;
	this.varor = varor;
}
void kundVagn(int varor, double pris) {
	
	this.varor += varor;
	this.pris += pris;
	
}
public double getPris() {
	System.out.println(pris);
	return pris;
	
	
	
}

}