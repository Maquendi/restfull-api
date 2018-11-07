package restfull.api.restfullapi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restfull.api.restfullapi.model.Examen;
import restfull.api.restfullapi.repository.Repositorio;
import restfull.api.restfullapi.service.Services;

@Service
public class ExamenServiceImpl implements Services<Examen> {

	@Autowired
	private Repositorio<Examen> examStore;
	
	@Override
	public List<Examen> findAll() {
		return examStore.findAll();
	}

	@Override
	public Examen find(Long id) {
		return examStore.find(id);
	}

	@Override
	public boolean update(Examen entity) {
		return examStore.update(entity);
	}

	@Override
	public boolean add(Examen entity) {
		return examStore.add(entity);
	}

	@Override
	public boolean remove(Examen entity) {
		return examStore.remove(entity);
	}

}
