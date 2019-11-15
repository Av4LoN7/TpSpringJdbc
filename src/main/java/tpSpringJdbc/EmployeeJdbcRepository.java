package tpSpringJdbc;

import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeJdbcRepository extends AbstractJdbcRepository implements EmployeeRepository {

	
	public void save() {
		this.jdbcTemplate.update(
		"insert into employee(firstname, lastname) values(?,?)","steve", "jobs");
	}

	public List<Employee> findAll() {
		return this.jdbcTemplate.query("select * from employee", new EmployeeMapper());
	}

	public List<Employee> findBySsn() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(List<Employee> empList) {
		Long emTemp = 0L;
		for(Employee em : empList) {
			emTemp = this.findOne(em.getId()).getId();
			if(emTemp != null || emTemp != 0) {
				this.jdbcTemplate.update(
						"update employee set firstname = ?, lastname = ? where id= ?", "bobi", "dylan", em.getId());
			}
		}
	}

	public Employee findOne(Long id) {
		try {
			return this.jdbcTemplate.queryForObject("select * from employee where id = ?", new Object[] {id}, new EmployeeMapper());
		} catch(EmptyResultDataAccessException e) {
			return null;
		}
		
	}

	
	

}
