
 class Varor {

	String name;
	private int pris;
	int antal;
	
	Varor(String name, int pris, int antal){
		this.name = name;
		this.setPris(pris);
		this.antal = antal;
		
	}
	
int	howManyLeft() {
	antal--;
	return antal;
}

public int getPris() {
	return pris;
}

public void setPris(int pris) {
	this.pris = pris;
}


  
}