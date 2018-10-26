package restfull.api.restfullapi.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import restfull.api.restfullapi.exceptions.ResourceNotFoundException;
import restfull.api.restfullapi.model.Professor;
import restfull.api.restfullapi.repository.Repositorio;
import restfull.api.restfullapi.service.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProfessorServiceImpl implements Services<Professor>{

	@Autowired
	private Repositorio<Professor> professorRepository;
	
	@Override
	public List<Professor> findAll() {
		return professorRepository.findAll();
	}

	@Override
	public Professor find(Long id) throws ResourceNotFoundException{
		return professorRepository.find(id);
	}

	@Override
	public boolean update(Professor entity) {
		return professorRepository.update(entity);
	}

	@Override
	public boolean add(Professor entity) {
		return professorRepository.add(entity);
	}

	@Override
	public boolean remove(Professor entity) {
		return professorRepository.remove(entity);
	}

}
