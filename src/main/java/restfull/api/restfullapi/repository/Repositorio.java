package restfull.api.restfullapi.repository;

import java.util.List;

import restfull.api.restfullapi.model.AbstractPerson;
public interface Repositorio<T extends AbstractPerson> {

	List<T> findAll();
	
	T find(Long id);
	
	boolean update(T entity);
	
	boolean add(T entity);

	boolean remove(T entity);
	
}
