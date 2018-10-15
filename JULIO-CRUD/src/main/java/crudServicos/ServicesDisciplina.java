package crudServicos;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import crudDao.DisciplinaDao;
import crudEntidades.Disciplina;
import util.TransacionalCDI;

public class ServicesDisciplina {

	public class DisciplinaService implements Serializable ,Service<Disciplina>{

		private static final long serialVersionUID = -7803325791425670859L;
		private DisciplinaDao disciplinaDAO;
		
		@Override
		@TransacionalCDI
		public void save(Disciplina e) {
			disciplinaDAO.save(e);
		}

		@Override
		@TransacionalCDI
		public void update(Disciplina e) {
			disciplinaDAO.update(e);
			
		}

		@Override
		@TransacionalCDI
		public void remove(Disciplina e) {
			disciplinaDAO.remove(e);
			
		}

		@Override
		public Disciplina getByID(long disciplinaId) {
			return disciplinaDAO.getByID(disciplinaId);
		}

		@Override
		public List<Disciplina> getAll() {
			return disciplinaDAO.getAll();
		}
	}


}
