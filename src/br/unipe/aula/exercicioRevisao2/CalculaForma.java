package br.unipe.aula.exercicioRevisao2;

import java.util.List;

import br.unipe.aula.exercicioRevisao.Forma;

public class CalculaForma {
	
	public static Forma formaDeMaiorArea(List<Forma> formas){
		
		Forma maior = formas.get(0);
		
		for (Forma f: formas){
			if(f.area() > maior.area()){
				maior = f;
			}		
		}
		
		return maior;
	}
	
}
