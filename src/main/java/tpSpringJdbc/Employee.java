package tpSpringJdbc;

import java.time.LocalDate;

public class Employee {
	private String firstName;
	private String lastName;
	private int ssn;
	private LocalDate hiredate;
	private Long id;
	
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, int ssn, LocalDate hiredate, Long id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.hiredate = hiredate;
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
