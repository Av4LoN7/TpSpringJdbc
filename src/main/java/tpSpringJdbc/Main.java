package tpSpringJdbc;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan
public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		EmployeeJdbcService serv = context.getBean(EmployeeJdbcService.class);
		//serv.save();
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		List<Employee> test2 = serv.findAll();
		emp1.setFirstName("testo");
		emp1.setLastName("grosminet");
		emp1.setId(32L);
		test2.add(emp1);
		
		for(Employee emp : test2) {
			System.out.println(emp.getFirstName());
		}
		serv.update(test2);
	}

}
