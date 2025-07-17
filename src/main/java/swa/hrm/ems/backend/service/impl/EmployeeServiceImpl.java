package swa.hrm.ems.backend.service.impl;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import swa.hrm.ems.backend.dto.EmployeeDto;
import swa.hrm.ems.backend.entity.Employee;
import swa.hrm.ems.backend.mapper.EmployeeMapper;
import swa.hrm.ems.backend.repository.EmployeeRepository;
import swa.hrm.ems.backend.service.EmployeeService;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee=employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
