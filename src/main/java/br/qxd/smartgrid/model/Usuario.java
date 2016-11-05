package br.qxd.smartgrid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String nome;
	
	@Column
	private String cpf;
	
	@Column
	private String cnpj;
	
	@Column
	private String telefone;
	
	@OneToOne
	private Usuario_role papel;
	
	@Column
	private boolean active = true;
	
	@Column 
	private Endereco_usuario endereco_cobranca;

	@Column
	private String login;
	
	@Column
	private String senha;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Usuario_role getPapel() {
		return papel;
	}

	public void setPapel(Usuario_role papel) {
		this.papel = papel;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Endereco_usuario getEndereco_cobranca() {
		return endereco_cobranca;
	}

	public void setEndereco_cobranca(Endereco_usuario endereco_cobranca) {
		this.endereco_cobranca = endereco_cobranca;
	}
	
	
	
}
