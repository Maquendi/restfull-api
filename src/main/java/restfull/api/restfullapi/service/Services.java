package restfull.api.restfullapi.service;

import java.util.List;


public interface Services<T> {
	
	List<T> findAll();
	T find(Long id);
	boolean update(T entity);
	boolean add(T entity);
	boolean remove(T entity);
}
