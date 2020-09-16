package com.dw.employeedepartmentserver.api.feign;

import com.dw.employeedepartmentserver.dto.EmployeeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(url = "http://localhost:8082/employee", name = "employee")
public interface EmployeeClient {
    @GetMapping
    List<EmployeeDto> getAll();

    @GetMapping(params = {"departmentId"})
    List<EmployeeDto> getAllByDepartmentId(@RequestParam Integer departmentId);

    @GetMapping("/{id}")
    EmployeeDto getById(@PathVariable("id") Integer id);
}
