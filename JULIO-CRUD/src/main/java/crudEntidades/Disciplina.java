package crudEntidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Disciplina")
public class Disciplina implements Identificavel{

	@Id
	@Column(name = "id_Disc")
	private Integer idDisciplina;
	private Long id;
	private String nome;
	private String descricao;
	public Integer getIdDisciplina() {
		return idDisciplina;
	}
	public void setIdDisciplina(Integer idDisciplina) {
		this.idDisciplina = idDisciplina;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Disciplina [idDisciplina=" + idDisciplina + ", id=" + id + ", nome=" + nome + ", descricao=" + descricao
				+ "]";
	}
}



