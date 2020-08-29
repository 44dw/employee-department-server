package com.dw.employeedepartmentserver.mapper;

import com.dw.departmentdictionary.api.feign.DepartmentClient;
import com.dw.departmentdictionary.mapper.CommonMapper;
import com.dw.employeedepartmentserver.domain.Employee;
import com.dw.employeedepartmentserver.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper implements CommonMapper<Employee, EmployeeDto> {
    @Autowired
    private DepartmentClient departmentClient;

    @Autowired
    private PositionMapper positionMapper;

    @Override
    public Employee mapToDomain(EmployeeDto employeeDto) {
        return Employee.builder()
                .id(employeeDto.getId())
                .firstName(employeeDto.getFirstName())
                .secondName(employeeDto.getSecondName())
                .thirdName(employeeDto.getThirdName())
                .sex(employeeDto.getSex())
                .birthDate(employeeDto.getBirthDate())
                .telNumber(employeeDto.getTelNumber())
                .email(employeeDto.getEmail())
                .hireDate(employeeDto.getHireDate())
                .resignDate(employeeDto.getResignDate())
                .position(this.positionMapper.mapToDomain(employeeDto.getPosition()))
                .salary(employeeDto.getSalary())
                .departmentId(employeeDto.getDepartment().getId())
                .isDepartmentHead(employeeDto.isDepartmentHead())
                .build();
    }

    @Override
    public EmployeeDto mapToDto(Employee employee) {
        return EmployeeDto.builder()
                .id(employee.getId())
                .firstName(employee.getFirstName())
                .secondName(employee.getSecondName())
                .thirdName(employee.getThirdName())
                .sex(employee.getSex())
                .birthDate(employee.getBirthDate())
                .telNumber(employee.getTelNumber())
                .email(employee.getEmail())
                .hireDate(employee.getHireDate())
                .resignDate(employee.getResignDate())
                .position(this.positionMapper.mapToDto(employee.getPosition()))
                .salary(employee.getSalary())
                .department(this.departmentClient.getById(employee.getDepartmentId()))
                .isDepartmentHead(employee.isDepartmentHead())
                .build();
    }
}
