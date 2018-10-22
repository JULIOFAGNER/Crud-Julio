package crudServicos;


import java.io.Serializable;
import java.util.List;

import crudDao.TurmaDao;
import crudEntidades.Turma;

public class ServicesTurma implements Serializable {
	
	private static final long serialVersionUID = -7803325791425670859L;
	
	private TurmaDao Dao = new TurmaDao ();
	
	public void save(Turma turm) throws ServiceDacException {
		try {
			Dao.save(turm);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public void update(Turma turm) throws ServiceDacException {
		
		try {
			Dao.update(turm);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public void delete(Turma turm) throws ServiceDacException {
		try {
			Dao.delete(turm);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public Turma getByID(int turmId) throws ServiceDacException {
		try {
			return Dao.getByID(turmId);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public List <Turma> getAll() throws ServiceDacException {
		try {
			return Dao.getAll();
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

}
