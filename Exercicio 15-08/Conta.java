package br.unipe.cc.bano;

public class Conta {
	
	private float saldo;
	private String numero;
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void debitar(float valor){
		getSaldo();
		if (saldo >= valor){
			setSaldo(saldo - valor);
		}else{
			System.out.println("Nao eh possivel debitar este valor. Saldo insuficiente.");
		}
	}
	
	public void creditar(float valor){
		getSaldo();
		if(valor > 0){
			setSaldo(saldo + valor);
		}else{
			System.out.println("Nao eh possivel creditar um valor negativo.");
		}
	}

}
