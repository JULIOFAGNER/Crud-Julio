package crudBean;

	import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
	import javax.annotation.PostConstruct;
	import javax.faces.view.ViewScoped;
	import javax.inject.Inject;
	import javax.inject.Named;
	import crudDao.TurmaDao;
import crudEntidades.Turma;
	import crudServicos.PersistenciaDacException;

	@ViewScoped
	@Named
	public class TurmaBean  implements Serializable{
	    
		@Inject
		private TurmaDao dao; 
		private Turma turma;
		private String turmaBusca;
		
		public Turma getturma1() {
	    	return turma;
		}
		
		@PostConstruct
		public void setTurmas(Map<Integer, Turma> turmas, Turma turma) {
	    	this.turma = turma;
		}
	    
		public Turma getTurma() {
	   	 return turma;
	    }
	    public void setTurma(Turma turma) {
	   	 this.turma = turma;
	    }
	    public String getTurmaBusca() {
	   	 return turmaBusca;
	    }
	    public void seTurmaBusca(String turmaBusca) {
	   	 this.turmaBusca = turmaBusca;
	    }
	    
	    public void adicionarTurma() throws PersistenciaDacException{
	   	Turma turma2 = dao.getByID(turma.getIdturma());
	   	 
	    	if (turma2 == null) {
	   		 dao.save(turma);    
	       	 
	    	}else {
	   		turma2.setIdturma(turma.getIdturma());
	   		turma2.setProfessores(turma.getProfessores());
	   		turma2.setAlunos(turma.getAlunos());
	   		turma2.setHorarios(turma.getHorarios());
	   		
	    	}
	    	turma = new Turma();
		}
	    
		public void removerProfessor(Integer idTurma) throws PersistenciaDacException{
	   	 Turma turma2 = dao.getByID(idTurma);
	   	 dao.delete(turma2);
		}
	    
		public TurmaBean() {
	   	 turma = new Turma();
	   	dao = new TurmaDao();
		}
	}


	

