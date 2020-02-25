package tpSpringJdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeJpaService {

	@Autowired
	private EmployeeJpaRepository empJpaRepo;
	
	public void save(Object entity) {
		this.empJpaRepo.save(entity);
	}
	
	public List<Employee> findAll(){
		return this.empJpaRepo.findAll();
	}
	
	public Employee findOne(Long id) {
		return this.empJpaRepo.findOne(id);
	}
	
	public void update(List<Employee> list) {
		try {
			this.empJpaRepo.update(list);
		} catch (Exception e) {
			throw new RuntimeException(String.format("Erreur employee non trouv�e"));
		}
	}
}
