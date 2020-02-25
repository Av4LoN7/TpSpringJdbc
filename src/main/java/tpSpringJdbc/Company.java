package tpSpringJdbc;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private String name;
	
	@OneToMany(mappedBy = "company")
	private List<Employee> listEmp = new ArrayList<>();
	
	public Company() {
		
	}

	public Company(Long id, String name, List<Employee> listEmp) {
		this.id = id;
		this.name = name;
		this.listEmp = listEmp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getListEmp() {
		return listEmp;
	}

	public void setListEmp(List<Employee> listEmp) {
		this.listEmp = listEmp;
	}
	
	public void addEmployeeToList(Employee employee) {
		this.listEmp.add(employee);
	}

}
