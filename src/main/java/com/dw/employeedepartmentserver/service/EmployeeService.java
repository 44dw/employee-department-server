package com.dw.employeedepartmentserver.service;

import com.dw.departmentdictionary.service.AbstractCommonService;
import com.dw.employeedepartmentserver.domain.Employee;
import com.dw.employeedepartmentserver.dto.EmployeeDto;
import com.dw.employeedepartmentserver.mapper.EmployeeMapper;
import com.dw.employeedepartmentserver.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends AbstractCommonService<Employee, EmployeeDto> {

    @Autowired
    public EmployeeService(EmployeeRepository repository, EmployeeMapper mapper) {
        super(repository, mapper);
    }
}
