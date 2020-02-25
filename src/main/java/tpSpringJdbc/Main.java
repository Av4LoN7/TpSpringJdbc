package tpSpringJdbc;

import java.util.ArrayList;
import java.util.Arrays;
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
		/*EmployeeJdbcService serv = context.getBean(EmployeeJdbcService.class);
		//serv.save();
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		//List<Employee> test2 = serv.findAll();
		emp1.setFirstName("testo");
		emp1.setLastName("grosminet");
		//test2.add(emp1);
		Company comp1 = new Company();
		comp1.setName("company2");
		emp1.setCompany(comp1);
		comp1.addEmployeeToList(emp1);
		//System.out.println(comp1.getName());
		
		serv.save(comp1);
		serv.save(emp1);*/
		EmployeeJpaService serv2 = context.getBean(EmployeeJpaService.class);
		Employee emp1 = new Employee();
		emp1.setFirstName("testaaaaa");
		emp1.setLastName("grosminette");
		Company comp1 = new Company();
		comp1.setName("company9");
		emp1.setCompany(comp1);
		comp1.addEmployeeToList(emp1);
		
		//serv2.save(comp1);
		//serv2.save(emp1);
		
		List<Employee> test = new ArrayList<Employee>();
		 test = serv2.findAll();
		 //System.out.print(test);
		
		for(Employee em: test) {
			System.out.println(em.getFirstName());
		}
		
		/*for(Employee emp : test2) {
			System.out.println(emp.getFirstName());
		}
		serv.update(test2);*/
	}

}
