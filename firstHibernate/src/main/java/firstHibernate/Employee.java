package firstHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp")
public class Employee {
	
	private String firstname;
	private String lastname;
	@Id
	private int id;
	private String email;
	
	public Employee()
	{
		firstname=null;
	    lastname=null;
	    this.email=null;
	    this.id=0;
	}
	
	public Employee(String fname, String lname, String email, int id)
	{
	    firstname = fname;
	    lastname = lname;
	    this.email =email;
	    this.id=id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
