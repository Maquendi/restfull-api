package restfull.api.restfullapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import restfull.api.restfullapi.exceptions.ResourceNotFoundException;
import restfull.api.restfullapi.model.Professor;
import restfull.api.restfullapi.service.Services;
import org.springframework.hateoas.ResourceAssembler;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;


@RestController
@RequestMapping(value = "/professors")
public class ProfessorResource {
	
	@Autowired
	private Services<Professor> professorService;
	
	
	@GetMapping()
	public List<Professor> getProfessors() {
		List<Professor> list = professorService.findAll();
		System.out.println(list);
		return list;
	}
	
	@GetMapping("/professor/{id}")
	public Resource<Professor> findById(@PathVariable Long id) {
		Professor prof = null;
	  try{
			prof = professorService.find(id);
			
		}catch(ResourceNotFoundException e) {
			throw e;
		}
	 // return new Resource<>(prof,
				//linkTo(methodOn(ProfessorResource.class).one(id)).withSelfRel(),
				//linkTo(methodOn(ProfessorResource.class).all()).withRel("professors"));
	  return new Resource<>(prof);
	}
	
	
	@PostMapping("/professor")
	public void addProfessor(@RequestBody Professor prof) {
				professorService.add(prof);
	}
	
	@PutMapping("/professor/{id}")
	public boolean updateProfessor(@RequestBody Professor prof, @PathVariable long id) {
		prof.setId(id);
		return professorService.update(prof);
	}
	
	@DeleteMapping("/professor/{id}")
	public boolean deleteProfessor(@RequestBody Professor prof,@PathVariable long id) {
		prof.setId(id);
		return this.professorService.remove(prof);
	}
	
}
