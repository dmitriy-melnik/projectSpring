package ua.opu.melnik.spring.project.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.opu.melnik.spring.project.Entities.Position;
import ua.opu.melnik.spring.project.Services.PositionService;

import java.util.List;

@RestController
public class PositionController {

    @Autowired
    private PositionService service;

    @GetMapping("/position")
    public List<Position> getAllPositions() {
        return service.getAllPositions();
    }

    @PostMapping("/position")
    public void addPosition(@RequestBody Position position) {
        service.addPosition(position);

    }

    /*
    @GetMapping("/employee_type_info")
    public EmployeeType getEmployeeTypeById(@RequestParam(value = "employee_type_id") int employeeTypeId) {
        return new EmployeeType(employeeTypeId, "Старший преподаватель", "ИКС", 5000, 2500);
    }

    @PostMapping("employee_type")
    public void addEmployeeType(@RequestBody EmployeeType employeeType) {
        System.out.println(employeeType);
    }*/
}
