package jogo;

import armas.*;
import personagens.*;

public class UsaPersonagem {
	
	public static void main(String args[]){
	    Personagem p = new Soldado();
	    p.desenhar();
	    System.out.println("\n");
	    p.setArma(new Revolver());
	    p.arma(); /*imprime tiro*/
	    p.setArma(new Fuzil()); 
	    p.arma(); /*imprime rajada*/
	    System.out.println("\n\n");
	    p = new LutadorSumo();
	    p.desenhar();
	    System.out.println("\n");
	    p.setArma(new Desarmado());
	    p.arma();/*imprime desarmado*/
	    System.out.println("\n\n");
	    p = new General();
	    p.desenhar();
	    System.out.println("\n");
	    p.setArma(new Fuzil());
	    p.arma();
	    System.out.println("\n");
	    p = new Mago();
	    p.desenhar();
	    System.out.println("\n");
	    p.setArma(new Magia());
	    p.arma();
	    System.out.println("\n");
	    p.setArma(new Faca());
	    p.arma();
	    
	}
}
