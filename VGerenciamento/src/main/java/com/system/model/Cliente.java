package com.system.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;





@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "id_cliente")
	@SequenceGenerator(name = "id_cliente", sequenceName = "id_cliente", initialValue = 1, allocationSize = 50)
	private Long id;
	
	@Column(name = "nome_cliente",nullable = true)
	private String nome;

	@Column(name = "telefone_cliente",nullable = true)
	private String telefone;

	@Column(name = "cliente_fixo",nullable = true)
	private Boolean clienteFixo;
	
	@Column(name = "procedimento_realizado",nullable = true)
	private String procedimento;
	@Column(name = "quant_sessoes",nullable = true)
	private Long  sessões;
	@Column(name = "produto_utilizado",nullable = true)
	private String produtoUtilizado;
	@Column(name = "data_agendamento",nullable = true)
	private Date dataAgendamento;
	@Column(name = "sexo",nullable = true)
	private String sexo;
	@Column(name = "endereco",nullable = true)
	private String endereco;



	public String getEndereco() {
		return endereco;
	}

	public void setEndenreco(String endenreco) {
		this.endereco = endenreco;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Boolean getClienteFixo() {
		return clienteFixo;
	}

	public void setClienteFixo(Boolean clienteFixo) {
		this.clienteFixo = clienteFixo;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

	public Long getSessões() {
		return sessões;
	}

	public void setSessões(Long sessões) {
		this.sessões = sessões;
	}

	public String getProdutoUtilizado() {
		return produtoUtilizado;
	}

	public void setProdutoUtilizado(String produtoUtilizado) {
		this.produtoUtilizado = produtoUtilizado;
	}

	public Date getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((clienteFixo == null) ? 0 : clienteFixo.hashCode());
		result = prime * result + ((procedimento == null) ? 0 : procedimento.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		result = prime * result + ((sessões == null) ? 0 : sessões.hashCode());
		result = prime * result + ((produtoUtilizado == null) ? 0 : produtoUtilizado.hashCode());
		result = prime * result + ((dataAgendamento == null) ? 0 : dataAgendamento.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((endereco == null) ? 0 : sexo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (clienteFixo == null) {
			if (other.clienteFixo != null)
				return false;
		} else if (!clienteFixo.equals(other.clienteFixo))
			return false;
		if (procedimento == null) {
			if (other.procedimento != null)
				return false;
		} else if (!procedimento.equals(other.procedimento))
			return false;
		if (sessões == null) {
			if (other.sessões != null)
				return false;
		} else if (!sessões.equals(other.sessões))
			return false;
		if (produtoUtilizado == null) {
			if (other.produtoUtilizado != null)
				return false;
		} else if (!produtoUtilizado.equals(other.produtoUtilizado))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		if (dataAgendamento == null) {
			if (other.dataAgendamento != null)
				return false;
		} else if (!dataAgendamento.equals(other.dataAgendamento))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		return true;
	}

	public Object getAtivo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAtivo(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	

}
