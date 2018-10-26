package restfull.api.restfullapi.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import restfull.api.restfullapi.model.Student;
import restfull.api.restfullapi.repository.Repositorio;
import restfull.api.restfullapi.service.Services;

@Service
@Transactional
public class StudentServiceImpl implements Services<Student>{

	
	private Repositorio<Student> studentRepository;
	
	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student find(Long id) {
		return studentRepository.find(id);
	}

	@Override
	public boolean update(Student entity) {
		return studentRepository.update(entity);
	}

	@Override
	public boolean add(Student entity) {
		return studentRepository.add(entity);
	}

	@Override
	public boolean remove(Student entity) {
		return studentRepository.remove(entity);
	}

}
