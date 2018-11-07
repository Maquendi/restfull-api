package restfull.api.restfullapi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restfull.api.restfullapi.model.Materia;
import restfull.api.restfullapi.repository.Repositorio;
import restfull.api.restfullapi.service.Services;

@Service
public class MateriaServiceImpl implements Services<Materia>{

	@Autowired
	private Repositorio<Materia> materiaStore;
	
	@Override
	public List<Materia> findAll() {
		return materiaStore.findAll();
	}

	@Override
	public Materia find(Long id) {
		return materiaStore.find(id);
	}

	@Override
	public boolean update(Materia entity) {
		return materiaStore.update(entity);
	}

	@Override
	public boolean add(Materia entity) {
		return materiaStore.add(entity);
	}

	@Override
	public boolean remove(Materia entity) {
		return materiaStore.remove(entity);
	}

}
