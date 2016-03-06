package Aula02;


public class Banco {
	private String nomeBanco;
	private int numBanco;
	public Banco() {
		super();
	}
	public Banco(int numBanco) {
		this.numBanco = numBanco;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public int getNumBanco() {
		return numBanco;
	}
	public void setNumBanco(int numBanco) {
		this.numBanco = numBanco;
	}
}
