package personagens;

import armas.ArmaIF;

public abstract class Personagem {
	
	ArmaIF arma;
	
	public abstract void desenhar();
	
	public void falar() {
		System.out.println("blablabla!");
	}
	
	public void arma() {
		arma.usaArma();
	}

	public void setArma(ArmaIF a) {
		arma = a;
	}
}