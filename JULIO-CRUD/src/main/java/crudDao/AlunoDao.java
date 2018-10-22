package crudDao;

import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import crudEntidades.Aluno;
import crudServicos.PersistenciaDacException;
import util.TransacionalCDI;

public class AlunoDao {
	
	@Inject
	private EntityManager manager;

	@TransacionalCDI
	public void save(Aluno aluno) throws PersistenciaDacException {
		manager.persist(aluno);
	}

	@TransacionalCDI
	public void update(Aluno aluno) throws PersistenciaDacException {
		manager.merge(aluno);
	}

	@TransacionalCDI
	public void delete(Aluno alu) throws PersistenciaDacException {
		Aluno aluno = manager.find(Aluno.class, alu.getIdaluno());
	}

	public Aluno getByID(int idAluno) throws PersistenciaDacException {
		return manager.find(Aluno.class, idAluno);
	}
	
	public List<Aluno> getAll() throws PersistenciaDacException {
		Query query = manager.createQuery("from Professor");
		return query.getResultList();
	}
	
}


