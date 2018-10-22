package crudBean;

	import java.io.Serializable;
	import java.util.Map;
	import javax.annotation.PostConstruct;
	import javax.faces.view.ViewScoped;
	import javax.inject.Inject;
	import javax.inject.Named;
	import crudDao.DisciplinaDao;
	import crudEntidades.Disciplina;
	import crudServicos.PersistenciaDacException;

	@ViewScoped
	@Named
	public class DisciplinaBean implements Serializable{
	    
		@Inject
		private DisciplinaDao dao;
	    
		private Disciplina disciplina;
		private String disciplinaBusca;
		
		public Disciplina getDisciplina1() {
	    	return disciplina;
		}
		
		@PostConstruct
		public void setProfessores(Map<Integer, Disciplina> disciplinas, Disciplina disciplina) {
	    	this.disciplina = disciplina;
		}
	    
		public Disciplina getDisciplina() {
	   	 return disciplina;
	    }
	    public void setProfessor(Disciplina disciplina) {
	   	 this.disciplina = disciplina;
	    }
	    public String getDisciplinaBusca() {
	   	 return disciplinaBusca;
	    }
	    public void setDisciplinaBusca(String disciplinaBusca) {
	   	 this.disciplinaBusca = disciplinaBusca;
	    }
	    
	    public void adicionarDisciplina() throws PersistenciaDacException{
	    	Disciplina disciplina2 = dao.getByID(disciplina.getIdDisciplina());
	   	 
	    	if (disciplina2 == null) {
	   		 dao.save(disciplina);    
	       	 
	    	}else {
	    		disciplina2.setDescricao(disciplina.getDescricao());
	    		disciplina2.setId(disciplina.getId());
	   		disciplina2.setNome(disciplina.getNome());
	   		disciplina2.setIdDisciplina(disciplina.getIdDisciplina());
	    	}
	    	disciplina = new Disciplina();
		}
	    
		public void removerProfessor(Integer idDisciplina) throws PersistenciaDacException{
			Disciplina disciplina2 = dao.getByID(idDisciplina);
	   	 dao.delete(disciplina2);
		}
	    
		public DisciplinaBean() {
			disciplina = new Disciplina();
	   	dao = new DisciplinaDao();
		}
	}

