package br.aeso.aula14.builder.ex02;

public class TesteCarroBuilder {

	public static void main(String[] args) {

		CarroBuilder builder = new CarroBuilder();
		builder.comPreco(24.999)
		.comDescricaoMotor("EconoFlex")
		.comAnoDeFabricacao(2015)
		.comModelo("Celta")
		.comMontadora("GM - Chevrolet")
		.construir();
		
		System.out.println(builder);
		
	}

}
