package Aula02;

import beans.Agencia;
import beans.Banco;
import beans.Conta;
import Aula02.AcessoDAO;

public class Acesso {

	private AcessoDAO acessoDAO;
	private boolean flagCodigo;
	public Acesso() {
		acessoDAO = new AcessoDAO();
	}
	public Acesso(String numConta, String senha, int numBanco, int numAgencia){
		acessoDAO = new AcessoDAO();

	}
	public boolean validarAcesso(Conta conta, Agencia agencia, Banco banco){
		flagCodigo = false;
		acessoDAO.geraMatriz();
	    flagCodigo = AcessoDAO.buscaBinaria(acessoDAO.getContaesenha(), Integer.parseInt(conta.getNumConta()), Integer.parseInt(conta.getSenha() ));
	    return flagCodigo;

	}


}
