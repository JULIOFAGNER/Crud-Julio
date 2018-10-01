package crudDao;

	import java.util.List;

	import crudEntidades.Disciplina;
	import crudDao.DisciplinaFiltro;

	public class DisciplinaDao extends Dao<Disciplina>{

		public DisciplinaDao() {
			super(Disciplina.class);
		}
		
		public List<Disciplina> findBy(DisciplinaFiltro filtro){
			return null;
		}

	}
	

