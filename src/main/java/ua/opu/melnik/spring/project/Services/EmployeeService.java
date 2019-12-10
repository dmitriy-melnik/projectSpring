package ua.opu.melnik.spring.project.Services;

import org.springframework.beans.factory.annotation.Autowired;
import ua.opu.melnik.spring.project.Entities.Employee;
import ua.opu.melnik.spring.project.Entities.Position;
import ua.opu.melnik.spring.project.Repositories.EmployeeRepository;
import ua.opu.melnik.spring.project.Repositories.PositionRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepo;

    @Autowired
    private PositionRepository positionRepo;

    public void addEmployee(Employee employee, int id) {
        Position p = positionRepo.getOne(id);
        employee.setPosition(p);
        employeeRepo.save(employee);
    }

    public List<Employee> getAllEmployees() {

        return employeeRepo.findAll();
    }

    public Employee getEmployee(int idEmployee) {
        return employeeRepo.getOne(idEmployee);
    }
}
