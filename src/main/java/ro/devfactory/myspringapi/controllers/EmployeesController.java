package ro.devfactory.myspringapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.devfactory.myspringapi.models.Employee;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/employees")
public class EmployeesController {

    @GetMapping
    public List<Employee> getEmployee() {
        return List.of(new Employee("John", "Neeson", 35, "john@gmail.com",
                        "London", "programmer"),
                new Employee("Anna", "Martin", 23, "anna@email.com",
                        "Bucharest", "QA Tester"));
    }
}