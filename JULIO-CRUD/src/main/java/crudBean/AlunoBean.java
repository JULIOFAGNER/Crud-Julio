package crudBean;

import java.io.Serializable;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import crudDao.AlunoDao;
import crudEntidades.Aluno;
import crudServicos.PersistenciaDacException;

@ViewScoped
@Named
public class AlunoBean implements Serializable {

	@Inject
	private AlunoDao dao;

	private Aluno aluno;
	private String alunoBusca;

	public Aluno getAluno1() {
		return aluno;
	}

	@PostConstruct
	public void setProfessores(Map<Integer, Aluno> alunos, Aluno aluno) {
		this.aluno = aluno;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getAlunoBusca() {
		return alunoBusca;
	}

	public void setAlunoBusca(String alunoBusca) {
		this.alunoBusca = alunoBusca;
	}

	public void adicionarAluno() throws PersistenciaDacException {
		Aluno aluno2 = dao.getByID(aluno.getIdaluno());

		if (aluno2 == null) {
			dao.save(aluno);

		} else {
			aluno2.setMatricula(aluno.getMatricula());
			aluno2.setIdade(aluno.getIdade());
			aluno2.setNome(aluno.getNome());
			aluno2.setIdaluno(aluno.getIdaluno());
		}
		aluno = new Aluno();
	}

	public void removerProfessor(Integer idAluno) throws PersistenciaDacException {
		Aluno aluno2 = dao.getByID(idAluno);
		dao.delete(aluno2);
	}

	public AlunoBean() {
		aluno = new Aluno();
		dao = new AlunoDao();
	}
}
