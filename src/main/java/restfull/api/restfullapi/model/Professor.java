package restfull.api.restfullapi.model;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Professor.findAll", query="SELECT p FROM Professor p")
public class Professor extends AbstractPerson {
	private static final long serialVersionUID = 1L;
	
	private double salary;
	
	public Professor(String firstName, String lastName, double salary) {
		super(firstName,lastName);
		this.salary = salary;
	}
	
	public Professor() {
		super();
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Professor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", address=" + address + ",  Salary =" + salary + "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
