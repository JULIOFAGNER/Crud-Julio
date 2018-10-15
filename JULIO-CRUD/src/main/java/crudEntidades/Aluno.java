package crudEntidades;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "aluno")
	public class Aluno {

		@Id
		@Column(name = "id_alu")
		private Integer idaluno;
		private String nome;
		private int idade;
		private int matricula;
		public Integer getIdaluno() {
			return idaluno;
		}
		public void setIdaluno(Integer idaluno) {
			this.idaluno = idaluno;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public int getMatricula() {
			return matricula;
		}
		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}
		@Override
		public String toString() {
			return "Aluno [idaluno=" + idaluno + ", nome=" + nome + ", idade=" + idade + ", matricula=" + matricula + "]";
		}
		

		
}
