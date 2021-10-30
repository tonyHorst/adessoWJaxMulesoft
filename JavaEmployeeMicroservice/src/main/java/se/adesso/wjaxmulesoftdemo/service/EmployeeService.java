package se.adesso.wjaxmulesoftdemo.service;

import org.springframework.stereotype.Service;
import se.adesso.wjaxmulesoftdemo.entity.EGender;
import se.adesso.wjaxmulesoftdemo.entity.EType;
import se.adesso.wjaxmulesoftdemo.entity.Employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getAllEmployees() {
        return Arrays.asList(
                new Employee(1, "Hans", EType.BOSS, EGender.MAN, LocalDate.parse("1985-06-20")),
                new Employee(2, "Bettina", EType.DEVELOPER, EGender.WOMAN, LocalDate.parse("1989-06-20")),
                new Employee(3,"Klaus", EType.PRODUCT_OWNER, EGender.DIVERS, LocalDate.parse("1945-05-08"))
        );
    }
}
