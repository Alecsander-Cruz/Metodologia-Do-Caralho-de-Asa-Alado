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
	    p.setArma(new Faca()); 
	    p.arma(); /*imprime rajada*/
	    p.falar();
	    p.mover();
	    System.out.println("\n\n");
	    
	    p = new LutadorSumo();
	    p.desenhar();
	    System.out.println("\n");
	    p.arma();/*imprime desarmado*/
	    p.falar();
	    p.mover();
	    System.out.println("\n\n");
	    
	    p = new General();
	    p.desenhar();
	    System.out.println("\n");
	    p.setArma(new Fuzil());
	    p.arma();/*imprime rajada*/
	    p.setArma(new Bomba());
	    p.arma();/*imprime bomba*/
	    p.falar();
	    p.mover();
	    System.out.println("\n\n");
	    
	    p = new Mago();
	    p.desenhar();
	    System.out.println("\n");
	    p.arma();/*imprime magia*/
	    p.falar();
	    p.mover();
	    System.out.println("\n\n");
	    
	    p = new DragaoAlado();
	    p.desenhar();
	    System.out.println("\n");
	    p.arma();/*imprime fogarada*/
	    p.falar();
	    p.mover();
	}
}
