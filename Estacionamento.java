import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.davi.estacionamento.modelo.Carro;


public class Estacionamento {

	public static void main(String[] args) {
	
			
			ArrayList<Carro>  vagas = new ArrayList<Carro>();
			Carro corsa = new Carro();
			Carro Honda = new Carro();
			Carro Pajero = new Carro();
			Carro Escania = new Carro();
			
			corsa.setCor("azul");
			corsa.setNome("Corsa");
			corsa.setNumeroPlaca("1234-qwe");
			corsa.setVelocidadeMx(180);
			
			Honda.setCor("vermelho");
			Honda.setNome("Honda");
			Honda.setNumeroPlaca("4321-ewq");
			Honda.setVelocidadeMx(190);
			
			Pajero.setCor("branco");
			Pajero.setNome("Pajero");
			Pajero.setNumeroPlaca("6789-poi");
			Pajero.setVelocidadeMx(210);
			
			Escania.setCor("preto");
			Escania.setNome("Escania");
			Escania.setNumeroPlaca("3456-dfg");
			Escania.setVelocidadeMx(220);
			
			vagas.add(corsa);
			vagas.add(Honda);
			vagas.add(Pajero);
			vagas.add(Escania);
			
			
			Calendar data2 = Calendar.getInstance();
			GregorianCalendar data1 = new GregorianCalendar(data2.get(Calendar.YEAR),
					data2.get(Calendar.MONTH), data2.get(Calendar.DATE), 17, 30, 32);
			
			
			
				int dia = data1.get(Calendar.DATE);
				int mes = data1.get(Calendar.MONTH);
				int ano = data1.get(Calendar.YEAR);
				int hora = data1.get(GregorianCalendar.HOUR_OF_DAY);
				int minutos = data1.get(GregorianCalendar.MINUTE);
				int segundos = data1.get(GregorianCalendar.SECOND);
				
				int dia1 = data2.get(Calendar.DATE);
				int mes1 = data2.get(Calendar.MONTH);
				int ano1 = data2.get(Calendar.YEAR);
				int hora1 = data2.get(GregorianCalendar.HOUR_OF_DAY);
				int minutos1 = data2.get(GregorianCalendar.MINUTE);
				int segundos1 = data2.get(GregorianCalendar.SECOND);
		
				
			
			
			for(int i = 0; i < vagas.size(); i++) {
				System.out.println("Nome: " + vagas.get(i).getNome());
				System.out.println("Cor: " + vagas.get(i).getCor());
				System.out.println("Numero da Placa: " + vagas.get(i).getNumeroPlaca());
				System.out.println("Velocidade Maxima: " + vagas.get(i).getVelocidadeMx());
				System.out.printf("Horario de entrada: %02d/%02d/%d | %02d:%02d:%02d",
		        		dia, (mes+1), ano, hora++, (minutos+minutos++), (segundos+segundos++));
				System.out.println();
				System.out.printf("Horario de saida: %02d/%02d/%d | %02d:%02d:%02d",
		        		dia1, (mes1+1), ano1, hora1++, (minutos1+minutos+minutos), (segundos1+segundos+segundos/3));
				System.out.println("\n");
			}
			
	}
	
	
}
