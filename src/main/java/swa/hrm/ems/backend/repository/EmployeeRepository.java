package swa.hrm.ems.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swa.hrm.ems.backend.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee , Long> {

}
