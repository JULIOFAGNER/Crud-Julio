package crudDao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import crudEntidades.Identificavel;

public abstract class Dao<E extends Identificavel>{
	@Inject
	private EntityManager em;

	private Class<E> classe;

	public Dao(Class<E> classe) {
		this.classe = classe;
	}

	public void save(E obj) {
		if(obj.getId() == null) {
			em.persist(obj);
		} else {
			update(obj);
		}
	}

	public E update(E obj) {
		E resultado = obj;
		resultado = em.merge(obj);
		return resultado;
	}

	public void remove(E obj) {
		obj = getByID(obj.getId());
		em.remove(obj);
	}

	
	private E getByID(Long id) {
		return em.find(classe, id);
	}

	public List<E> getAll() {
		Query query = em.createQuery("from " + classe.getSimpleName());
		return query.getResultList();
	}
	
}