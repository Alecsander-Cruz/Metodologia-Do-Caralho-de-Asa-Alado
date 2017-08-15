package br.unipe.cc.bano;

import java.util.*;

public class banco{

	private List<Conta> contas;
	
	public void debitar(String numero, float valor){
		for(Conta c : contas){
			if(c.getNumero().equals(numero)){
				c.debitar(valor);
				return;
			}
		}	
	}
	
	public void creditar(String numero, float valor){
		for(Conta c : contas){
			if(c.getNumero().equals(numero)){
				c.creditar(valor);
				return;
			}
		}
	}
	
}
