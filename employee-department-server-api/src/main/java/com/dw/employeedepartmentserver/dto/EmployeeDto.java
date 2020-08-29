package com.dw.employeedepartmentserver.dto;

import com.dw.departmentdictionary.dto.DepartmentDto;
import com.dw.employeedepartmentserver.constants.EmployeeSex;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private EmployeeSex sex;
    private Date birthDate;
    private String telNumber;
    private String email;
    private Date hireDate;
    private Date resignDate;
    private PositionDto position;
    private Long salary;
    private DepartmentDto department;
    private boolean isDepartmentHead;

}
