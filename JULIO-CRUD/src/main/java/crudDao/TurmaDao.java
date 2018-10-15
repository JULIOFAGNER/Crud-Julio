package crudDao;

	import java.util.List;
	import javax.inject.Inject;
	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;
	import javax.persistence.Query;

	import crudEntidades.Turma;
	import crudServicos.PersistenciaDacException;
	import util.TransacionalCDI;

	public class TurmaDao {
		
		@Inject
		private EntityManager manager;

		@TransacionalCDI
		public void save(Turma turma) throws PersistenciaDacException {
			manager.persist(turma);
		}

		@TransacionalCDI
		public void update(Turma turma) throws PersistenciaDacException {
			manager.merge(turma);
		}

		@TransacionalCDI
		public void delete(Turma prof) throws PersistenciaDacException {
			Turma professor = manager.find(Turma.class, prof.getIdturma());
		}

		public Turma getByID(int idTurma) throws PersistenciaDacException {
			return manager.find(Turma.class, idTurma);
		}
		
		public List<Turma> getAll() throws PersistenciaDacException {
			Query query = manager.createQuery("from Professor");
			return query.getResultList();
		}
		
	}



