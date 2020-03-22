package com.davi.estacionamento.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import com.davi.estacionamento.bancoDeDados.ConexaoUtil;

public class Inserção {
	
	public static void main(String[] args) throws SQLException {
		ConexaoUtil cot = new ConexaoUtil();
		Calendar c = Calendar.getInstance();
		try(Connection con = cot.recuperaConexao()){
			con.setAutoCommit(false);
			
				try (PreparedStatement stm = con.prepareStatement("insert into registros_vagas (carro, cor, numero_placa, horario_entrada, preco, horario_saida) values ( ?, ?, ?, ?, ?, ?)" 
						, Statement.RETURN_GENERATED_KEYS)){
					
					int hora = c.get(Calendar.HOUR_OF_DAY); 
			        int minutos = c.get(Calendar.MINUTE);
			        int segundos = c.get(Calendar.SECOND);
					int dia = c.get(Calendar.DATE);
					int mes = c.get(Calendar.MONTH);
			        int ano = c.get(Calendar.YEAR);
					

					
					adicionarVariavel("Siena","Vermalho", "1234-wer",ano+"/"+mes+"/"+dia + " "+ hora+":"+minutos+":"+segundos , (int) 2.00, hora+":"+minutos+":"+segundos, stm);
					//adicionarVariavel("Micro Ondas","Micro Ondas cell", stm);
					con.commit();
					
					stm.close();
					con.close();
					
				}catch(Exception e) {
					e.printStackTrace();
					System.out.println("ROLLBACK EXECUTADO");
				}
				
			}
			
		}

		private static void adicionarVariavel( String carro, String cor,String numeroPlaca, String HorarioEntrada, int preco,String horarioSaida,  PreparedStatement stm) throws SQLException {
			
			stm.setString(1, carro);
			stm.setString(2, cor);
			stm.setString(3, numeroPlaca);
			stm.setString(4, HorarioEntrada);
			stm.setInt(5, preco);
			stm.setString(6, horarioSaida);
			
			
			
			stm.execute();
			
			
			
				try(ResultSet rst = stm.getGeneratedKeys()){
				while(rst.next()) {
					Integer id = rst.getInt(1);
					System.out.println("O id criado foi: " + id);
				}
			}
		
	}

}
