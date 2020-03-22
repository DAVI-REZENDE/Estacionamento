package com.davi.estacionamento.bancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoUtil {
	
	public Connection recuperaConexao() throws SQLException {
		return DriverManager.getConnection(
				"jdbc:mysql://localhost/estacionamento?useTimezone=true&serverTimezone=UTC" , "root", "Info@1234");
	}
	
}
