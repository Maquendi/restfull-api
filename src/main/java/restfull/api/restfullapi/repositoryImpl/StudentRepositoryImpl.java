package restfull.api.restfullapi.repositoryImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import restfull.api.restfullapi.model.Student;
import restfull.api.restfullapi.repository.Repositorio;


@Repository
public class StudentRepositoryImpl implements Repositorio<Student> {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Student> findAll() {
		@SuppressWarnings("unchecked")
		List<Student> list = (List<Student>) entityManager.createNamedQuery("Student.findAll").getResultList();
		return list;
	}

	@Override
	public Student find(Long id) {
		return entityManager.find(Student.class, id);
	}

	@Override
	public boolean update(Student entity) {
		if(entityManager.merge(entity) != null )
			return true;
		return false;
	}

	@Override
	public boolean add(Student entity) {
		entityManager.persist(entity);
		return true;
	}

	@Override
	public boolean remove(Student entity) {
		entityManager.remove(entity);
		return true;
	}

}
