package tpSpringJdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class EmployeeJdbcService {

	@Autowired
	private EmployeeJdbcRepository employeeJdbcRepo;
	
	
	public void save() {
		this.employeeJdbcRepo.save();
	}
	
	public List<Employee> findAll(){
		return this.employeeJdbcRepo.findAll();
	}
	
	public Employee findOne(Long id) {
		return this.employeeJdbcRepo.findOne(id);
	}
	
	public void update(List<Employee> list) {
		try {
			this.employeeJdbcRepo.update(list);
		} catch (Exception e) {
			throw new RuntimeException(String.format("Erreur employee non trouvée"));
		}
	}

}
