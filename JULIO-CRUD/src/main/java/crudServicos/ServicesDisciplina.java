package crudServicos;

import java.io.Serializable;
import java.util.List;

import crudDao.DisciplinaDao;
import crudEntidades.Disciplina;


public class ServicesDisciplina implements Serializable {
	
	private static final long serialVersionUID = -7803325791425670859L;
	
	private DisciplinaDao Dao = new DisciplinaDao ();
	
	public void save(Disciplina disc) throws ServiceDacException {
		try {
			Dao.save(disc);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public void update(Disciplina disc) throws ServiceDacException {
		
		try {
			Dao.update(disc);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public void delete(Disciplina disc) throws ServiceDacException {
		try {
			Dao.delete(disc);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public Disciplina getByID(int discId) throws ServiceDacException {
		try {
			return Dao.getByID(discId);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public List <Disciplina> getAll() throws ServiceDacException {
		try {
			return Dao.getAll();
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

}
