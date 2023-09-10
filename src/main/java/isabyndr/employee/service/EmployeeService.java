package isabyndr.employee.service;


import isabyndr.employee.entity.Employee;
import org.springframework.stereotype.Service;


import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    void deleteEmployeeById(long id);

}
