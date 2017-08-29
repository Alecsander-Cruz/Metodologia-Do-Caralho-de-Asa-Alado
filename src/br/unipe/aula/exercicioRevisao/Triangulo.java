package br.unipe.aula.exercicioRevisao;

public class Triangulo extends Forma {

	double altura;
	double base;
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double area() {
		
		return (altura*base)/2;
	}
	
	public Triangulo(double altura, double base){
		
	}
	
	Triangulo tri = new Triangulo (altura, base);
	
}
