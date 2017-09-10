package personagens;

import armas.ArmaIF;

public abstract class Personagem {
	
	ArmaIF arma;
	
	public abstract void desenhar();
	
	public abstract void falar();
	
	public void arma() {
		arma.usaArma();
	}

	public void setArma(ArmaIF a) {
		arma = a;
	}
	
	public abstract void mover();
}