package crudServicos;


import java.io.Serializable;
import java.util.List;

import crudDao.ProfessorDao;
import crudEntidades.Professor;

public class ServicesProfessor implements Serializable {
	
	private static final long serialVersionUID = -7803325791425670859L;
	
	private ProfessorDao Dao = new ProfessorDao ();
	
	public void save(Professor prof) throws ServiceDacException {
		try {
			Dao.save(prof);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public void update(Professor prof) throws ServiceDacException {
		
		try {
			Dao.update(prof);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public void delete(Professor prof) throws ServiceDacException {
		try {
			Dao.delete(prof);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public Professor getByID(int profId) throws ServiceDacException {
		try {
			return Dao.getByID(profId);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public List <Professor> getAll() throws ServiceDacException {
		try {
			return Dao.getAll();
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

}
