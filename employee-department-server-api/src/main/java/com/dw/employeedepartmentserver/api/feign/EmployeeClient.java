package com.dw.employeedepartmentserver.api.feign;

import com.dw.departmentdictionary.dto.DepartmentDto;
import com.dw.employeedepartmentserver.dto.EmployeeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "http://localhost:8761/employee", name = "employee")
public interface EmployeeClient {
    @GetMapping
    List<EmployeeDto> getAll();

    @GetMapping("/{id}")
    DepartmentDto getById(@PathVariable("id") Integer id);
}
