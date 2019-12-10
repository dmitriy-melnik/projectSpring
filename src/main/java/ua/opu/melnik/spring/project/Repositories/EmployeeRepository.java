package ua.opu.melnik.spring.project.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.opu.melnik.spring.project.Entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
