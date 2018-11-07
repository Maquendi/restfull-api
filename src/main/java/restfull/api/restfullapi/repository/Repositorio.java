package restfull.api.restfullapi.repository;

import java.util.List;
public interface Repositorio<T> {

	List<T> findAll();
	
	T find(Long id);
	
	boolean update(T entity);
	
	boolean add(T entity);

	boolean remove(T entity);
	
}
