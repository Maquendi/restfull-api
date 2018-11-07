package restfull.api.restfullapi.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import restfull.api.restfullapi.model.Examen;
import restfull.api.restfullapi.repository.Repositorio;

@Repository
public class ExamenRepositoryImpl implements Repositorio<Examen>{
	
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Examen> findAll() {
		String hpql = "Select m From Materia m";
		List<Examen> list = entityManager.createQuery(hpql).getResultList();
		return list;
	}

	@Override
	public Examen find(Long id) {
		return entityManager.find(Examen.class, id);
	}
	

	@Override
	public boolean update(Examen entity) {
		boolean found = false;
		Examen examen = this.find(entity.getId());
		if(examen != null) {
			found = true;
			entityManager.merge(examen);
		}
		return found;	
	}

	@Override
	public boolean add(Examen entity) {
		entityManager.persist(entity);
		return true;
	}

	@Override
	public boolean remove(Examen entity) {
        boolean found = false;
		Examen examen = this.find(entity.getId());
		if(examen != null) {
			found = true;
			entityManager.remove(examen);
		}
		return found;
	}

}
