package br.unipe.aula.exercicioRevisao;

public class Retangulo extends Forma{

	private double altura;
	private double base;
	

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
	public final double area() {
		
		return (altura*base);
	}

	public Retangulo(double altura, double base){
		
	}
	
	Retangulo rec = new Retangulo(altura, base);

}
