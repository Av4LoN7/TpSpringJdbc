package tpSpringJdbc;

import java.util.List;

public interface EmployeeRepository {
	
	public void save(Object entity);
	public List<Employee> findAll();
	public List<Employee> findBySsn();
	public void update(List<Employee> list);
	public Employee findOne(Long id);
	public void deleteAllEmployee();
}
