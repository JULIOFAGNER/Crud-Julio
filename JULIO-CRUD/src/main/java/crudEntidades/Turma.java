package crudEntidades;

	import java.util.ArrayList;

import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "turma")
	public class Turma {

		@Id
		@Column(name = "id_tur")
		private int idturma;
		private ArrayList<Professor>professores;
		private ArrayList<Aluno>alunos ;
		private String horarios;
		
		public Integer getIdturma() {
			return idturma;
		}
		public void setIdturma(Integer idturma) {
			this.idturma = idturma;
		}
		public ArrayList<Professor> getProfessores() {
			return professores;
		}
		public void setProfessores(ArrayList<Professor> professores) {
			this.professores = professores;
		}
		public ArrayList<Aluno> getAlunos() {
			return alunos;
		}
		public void setAlunos(ArrayList<Aluno> alunos) {
			this.alunos = alunos;
		}
		public String getHorarios() {
			return horarios;
		}
		public void setHorarios(String horarios) {
			this.horarios = horarios;
		}
		@Override
		public String toString() {
			return "Turma [idturma=" + idturma + ", professores=" + professores + ", alunos=" + alunos + ", horarios="
					+ horarios + "]";
		}
		
			
	
	}
	
		
		
		
		

