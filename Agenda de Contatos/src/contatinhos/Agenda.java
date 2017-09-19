package contatinhos;

import java.util.Arrays;
import java.util.Scanner;

public class Agenda {
	
	private Contato[] contatos;
	private int quantidadeContatos;

	
	public Agenda(int a){
		
		this.contatos = new Contato[a];	
	}
	
	public Contato buscarPorNome(String nome){
		
		for (Contato c: this.contatos){
			if(c.getNome().equals(nome)){
				return c;
			}
		}
		return null;
	}
	
	
	
	public boolean inserir(Contato c){
		
		Arrays.sort(contatos);
		if(Arrays.binarySearch(contatos, c)>0){
			return false;
		}
		if(contatos.length == quantidadeContatos){
			return false;
		}
		contatos[quantidadeContatos++] = c;
		return true;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual o tamanho da sua agenda?");
		int tamanho = scan.nextInt();
		
		Agenda agenda = new Agenda(tamanho);
		System.out.println(agenda.contatos.length);
		
		System.out.println("Nome: ");
		String a = scan.nextLine();
		
				
		
		
		
		
	}
	
	
	
	
}
