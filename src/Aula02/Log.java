package Aula02;

import projeto.caixa.eletronico.dao.LogDAO;

public class Log
{
	public Log(){

	}

	public void gravarLog(String texto){
		LogDAO logDAO = new LogDAO();
		logDAO.gravarLog(texto);
	}
}
