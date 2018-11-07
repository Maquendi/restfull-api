package restfull.api.restfullapi.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import restfull.api.restfullapi.model.Materia;
import restfull.api.restfullapi.repository.Repositorio;

@Repository
public class MateriaRepositoryImpl implements Repositorio<Materia>{
	
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Materia> findAll() {
		String hpql = "Select m From Materia m";
		List<Materia> list = entityManager.createQuery(hpql).getResultList();
		return list;
	}

	@Override
	public Materia find(Long id) {
		return entityManager.find(Materia.class, id);
	}

	@Override
	public boolean update(Materia entity) {
		boolean found = false;
		Materia mat = this.find(entity.getId());
		if(mat != null) {
			found = true;
			entityManager.merge(mat);
		}
		return found;
	}

	@Override
	public boolean add(Materia entity) {
		entityManager.persist(entity);
		return true;
	}

	@Override
	public boolean remove(Materia entity) {
		boolean found = false;
		
		Materia materia = this.find(entity.getId());
		
		if(materia != null) {
			found = true;
			entityManager.remove(materia);
		}
		
		return found;
	}

}
