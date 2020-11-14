package model.bean;

import java.util.Date;

public class Eleitor {

	private Integer cod;
	private String nome;
	private Date dataNasc;
	private String telefone;
	private String endereco;
	private String rg;
	private String cpf;
	private Integer matricula;
	private Instituicao instituicao;

	public Eleitor() {
	}

	public Eleitor(Integer cod, String nome, Date dataNasc, String telefone, String endereco, String rg, String cpf,
			Integer matricula, Instituicao instituicao) {
		this.cod = cod;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.endereco = endereco;
		this.rg = rg;
		this.cpf = cpf;
		this.matricula = matricula;
		this.instituicao = instituicao;
	}

	public Integer getCod() {
		return cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

}
