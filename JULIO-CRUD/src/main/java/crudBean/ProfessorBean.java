package crudBean;

	import java.io.Serializable;
	import java.util.Map;

	import javax.annotation.PostConstruct;
	import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

	import crudDao.ProfessorDao;
	import crudEntidades.Professor;
	import crudServicos.PersistenciaDacException;

	@ViewScoped
	@Named
	public class ProfessorBean implements Serializable{
	    
		@Inject
		private ProfessorDao dao;
	    
		private Professor professor;
		private String professorBusca;
		
		public Professor getProfessor1() {
	    	return professor;
		}
		
		@PostConstruct
		public void setProfessores(Map<Integer, Professor> professores, Professor professor) {
	    	this.professor = professor;
		}
	    
		public Professor getProfessor() {
	   	 return professor;
	    }
	    public void setProfessor(Professor professor) {
	   	 this.professor = professor;
	    }
	    public String getProfessorBusca() {
	   	 return professorBusca;
	    }
	    public void setProfessorBusca(String professorBusca) {
	   	 this.professorBusca = professorBusca;
	    }
	    
	    public void adicionarProfessor() throws PersistenciaDacException{
	   	 Professor professor2 = dao.getByID(professor.getIdProfessor());
	   	 
	    	if (professor2 == null) {
	   		 dao.save(professor);    
	       	 
	    	}else {
	   		 professor2.setDescricao(professor.getDescricao());
	   		 professor2.setIdade(professor.getIdade());
	   		 professor2.setNome(professor.getNome());
	   		 professor2.setIdProfessor(professor.getIdProfessor());
	   		professor2.setEmail(professor.getEmail());
	   		professor2.setUsername(professor.getPassword());
	    	}
	    	professor = new Professor();
		}
	    
		public void removerProfessor(Integer idProfessor) throws PersistenciaDacException{
	   	 Professor professor2 = dao.getByID(idProfessor);
	   	 dao.delete(professor2);
		}
	    
		public ProfessorBean() {
	   	 professor = new Professor();
	   	dao = new ProfessorDao();
		}
	}

