package contatinhos;
import java.util.*;


public class Contato implements Comparable{

	private String nome;
	private String telefone;
	private Date dataNascimento;
	
	public boolean equals(Object obj){
		
		if(obj instanceof Contato){
			Contato c = (Contato) obj;
			return this.nome.equals(c.nome) && this.telefone.equals(c.telefone);
		}
		return false;
	}
	
	
	@Override
	public int compareTo(Object obj) {
		Contato c = (Contato) obj;
		return this.nome.compareTo(c.nome);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
