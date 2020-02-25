package tpSpringJdbc;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AbstractJpaRepository {

	@PersistenceContext
	private EntityManager em;
	
	protected Session getSession() {
		return em.unwrap(Session.class);
	}
	
	public void persist(Object entity) {
		getSession().save(entity);
	}
	
	public void delete(Object entity) {
		em.remove(entity);
	}
	
	public List<Employee> findAll(){
		Query hql = getSession().createQuery("from Employee");
		return hql.list();	
	}
	
}
