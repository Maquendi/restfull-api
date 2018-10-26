package restfull.api.restfullapi.repositoryImpl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import restfull.api.restfullapi.repository.Repositorio;
import restfull.api.restfullapi.exceptions.ResourceNotFoundException;
import restfull.api.restfullapi.model.Professor;

@Repository
public class ProfessorRepositoryImpl implements Repositorio<Professor>{
	
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Professor> findAll() {
		
		List<Professor> list = (List<Professor>) entityManager.createNamedQuery("Professor.findAll").getResultList();
		
		return list;
	}

	@Override
	public Professor find(Long id) throws ResourceNotFoundException{
	  Professor prof = entityManager.find(Professor.class, id);
	  if(prof == null ) { throw new ResourceNotFoundException(Professor.class, id); }
	  return prof;
	}

	@Override
	public boolean update(Professor entity) {
		if(entityManager.merge(entity) != null) 
			return true;
		return false;
	}

	@Override
	public boolean add(Professor entity) {
		entityManager.persist(entity);
		return true;
	}

	@Override
	public boolean remove(Professor entity) {
		entityManager.remove(entity);
		return true;
	}

}
