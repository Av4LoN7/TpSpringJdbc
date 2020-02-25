package tpSpringJdbc;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeJpaRepository extends AbstractJpaRepository implements EmployeeRepository {

	@Override
	public void save(Object entity) {
		this.persist(entity);
		
	}

	@Override
	public List<Employee> findAll() {
		return super.findAll();
	}

	@Override
	public List<Employee> findBySsn() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(List<Employee> list) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllEmployee() {
		// TODO Auto-generated method stub
		
	}

}
