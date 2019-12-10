package ua.opu.melnik.spring.project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.opu.melnik.spring.project.Entities.Employee;
import ua.opu.melnik.spring.project.Services.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {

        return service.getAllEmployees();
    }

    /*
    @GetMapping("/employee/{id_employee}")
    public Employee getEmployeeById(@PathVariable(name = "id_employee") int id_employee) {
        return service.getEmployee(id_employee);
    }*/

    @PostMapping("/employee/{id_position}")
    public void addEmployee(@RequestBody Employee employee, @PathVariable(name = "id_position") int id_position) {
        service.addEmployee(employee, id_position);
    }

    /*
    @GetMapping("/personal_data")
    public Employee getPersonalDataById(@RequestParam(value = "personal_data_id") int personalDataId) {
        return new Employee(personalDataId, 1, "Иванов", "Иван", "Иванович", "234", "097-54-67-890");
    }

    @PostMapping("/personal_data")
    public void addPersonalData(@RequestBody Employee personalData) {
        System.out.println(personalData);
    }*/
}
