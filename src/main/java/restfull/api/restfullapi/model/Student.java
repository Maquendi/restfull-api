package restfull.api.restfullapi.model;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student extends AbstractPerson{
	private static final long serialVersionUID = 1L;
	
	public Student(String firstName, String lastName, double salary) {
		super(firstName,lastName);
	}
	
	public Student() {
		super();
	}
}
