package br.unipe.aula.exercicioRevisao;

public class Circulo extends Forma {

	double raio;
	public final static double PI = 3.14;
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}


	@Override
	public double area() {
		// TODO Auto-generated method stub
		return PI*raio*raio;
	}
	
	public Circulo(double raio){
		
	}
	
	Circulo circ = new Circulo(raio);
	
	
}
