package teste;

import java.util.ArrayList;
import java.util.List;

import br.unipe.aula.exercicioRevisao.Circulo;
import br.unipe.aula.exercicioRevisao.Forma;
import br.unipe.aula.exercicioRevisao.Retangulo;
import br.unipe.aula.exercicioRevisao2.CalculaForma;

public class Teste {

	public static void main(String[] args) {
		
		List <Forma> formas = new ArrayList <Forma>();
		formas.add(new Circulo (5));
		formas.add(new Retangulo (2,3));
		
		Forma formaMaiorArea = CalculaForma.formaDeMaiorArea(formas);
		
		System.out.println("A maior forma eh: " + formaMaiorArea.area());

	}

}
