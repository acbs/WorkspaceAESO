package br.aeso.aula14.builder;

import java.util.Calendar;
import java.util.List;

public class NotaFiscal {

	private int numeroNota;
	private String emitente;
	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao;
	private double valorBruto;
	private double imposto;
	private List<ItemDaNota> itens;
	private String observacao;
	
	
	public int getNumeroNota() {
		return numeroNota;
	}
	public void setNumeroNota(int numeroNota) {
		this.numeroNota = numeroNota;
	}
	public String getEmitente() {
		return emitente;
	}
	public void setEmitente(String emitente) {
		this.emitente = emitente;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Calendar getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public double getValorBruto() {
		return valorBruto;
	}
	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	public List<ItemDaNota> getItens() {
		return itens;
	}
	public void setItens(List<ItemDaNota> itens) {
		this.itens = itens;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
	public NotaFiscal(String emitente, String razaoSocial, String cnpj, Calendar dataEmissao, 
			double valorBruto, double imposto, List<ItemDaNota> itens, String observacao) {
		this.emitente = emitente;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.dataEmissao = dataEmissao;
		this.valorBruto = valorBruto;
		this.imposto = imposto;
		this.itens = itens;
		this.observacao = observacao;
	}
	
	
	@Override
	public String toString() {
		return "NotaFiscal [numeroNota=" + numeroNota + ", emitente="
				+ emitente + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj
				+ ", dataEmissao=" + dataEmissao + ", valorBruto=" + valorBruto
				+ ", imposto=" + imposto + ", itens=" + itens + ", observacao="
				+ observacao + "]";
	}
	
}
