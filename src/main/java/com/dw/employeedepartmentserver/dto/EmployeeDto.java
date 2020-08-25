package com.dw.employeedepartmentserver.dto;

import com.dw.departmentdictionary.dto.DepartmentDto;
import com.dw.employeedepartmentserver.domain.Employee;
import com.dw.employeedepartmentserver.domain.Position;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDto {
    private Integer id;
    private String firstName;
    private String secondName;
    private String thirdName;
    private Employee.EmployeeSex sex;
    private Date birthDate;
    private String telNumber;
    private String email;
    private Date hireDate;
    private Date resignDate;
    private Position position;
    private Long salary;
    private DepartmentDto department;
    private boolean isDepartmentHead;

}
