package br.aeso.aula14.builder.ex02;

public class CarroBuilder {
	
	private double preco;
	private String descricaoMotor;
	private int anoDeFabricacao;
	private String modelo;
	private String montadora;
	
	public CarroBuilder (){}
	
	public CarroBuilder(double preco, String descricaoMotor, int anoDeFabricacao, String modelo, String montadora){
		this.preco = preco;
		this.descricaoMotor = descricaoMotor;
		this.anoDeFabricacao = anoDeFabricacao;
		this.modelo = modelo;
		this.montadora = montadora;
	}

	public CarroBuilder comPreco (double preco){
		this.preco = preco;
		return this;
	}
	
	public CarroBuilder comDescricaoMotor (String descricaoMotor){
		this.descricaoMotor = descricaoMotor;
		return this;
	}
	
	public CarroBuilder comAnoDeFabricacao (int anoDeFabricacao){
		this.anoDeFabricacao = anoDeFabricacao;
		return this;
	}
	
	public CarroBuilder comModelo (String modelo){
		this.modelo = modelo;
		return this;
	}
	
	public CarroBuilder comMontadora (String montadora){
		this.montadora = montadora;
		return this;
	}
	
	public CarroBuilder construir (){
		return new CarroBuilder(preco, descricaoMotor, anoDeFabricacao, modelo, montadora);
	}

	@Override
	public String toString() {
		return "--- CarroBuilder ---"
				+ "\nPreço = " + preco 
				+ "\nDescrição Motor = " + descricaoMotor 
				+ "\nAno De Fabricação = " + anoDeFabricacao
				+ "\nModelo = " + modelo 
				+ "\nMontadora = " + montadora;
	}
	
	
	
}
