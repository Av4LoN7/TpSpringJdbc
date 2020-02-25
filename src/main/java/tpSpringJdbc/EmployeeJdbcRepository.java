package tpSpringJdbc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeJdbcRepository extends AbstractJdbcRepository implements EmployeeRepository {

	@PersistenceContext
	protected EntityManager em;
	
	protected Session getSession() {
		return em.unwrap(Session.class);
	}
	
	public void persist(Object entity) {
		em.persist(entity);
	}
	
	public void save(Object entity) {
		/*this.jdbcTemplate.update(
		"insert into employee(firstname, lastname) values(?,?)","steve", "jobs");*/
		this.persist(entity);	
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
			if(emTemp != null || emTemp != 0L) {
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

	@Override
	public void deleteAllEmployee() {
		// TODO Auto-generated method stub	
	}

	
	

}
