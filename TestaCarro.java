import java.util.ArrayList;

import com.davi.estacionamento.modelo.Carro;

public class TestaCarro {
	
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setCor("vermelho");
		carro.setNumeroPlaca("4532-abc");
		carro.setVelocidadeMx(120);
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("vaga1");
		System.out.println(cars);
		
		System.out.println("A cor do carro �: " + carro.getCor());
		System.out.println("O numero da sua placa �: " + carro.getNumeroPlaca());
		System.out.println("A velocidade maxima do seu carro �: " + carro.getVelocidadeMx());
	}

}
