package com.dw.employeedepartmentserver.resource;

import com.dw.departmentdictionary.resource.AbstractCommonResource;
import com.dw.employeedepartmentserver.domain.Employee;
import com.dw.employeedepartmentserver.dto.EmployeeDto;
import com.dw.employeedepartmentserver.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/employee", produces = APPLICATION_JSON_VALUE)
public class EmployeeResource extends AbstractCommonResource<Employee, EmployeeDto> {

    public EmployeeResource(EmployeeService service) {
        super(service);
    }

    @GetMapping(params = {"departmentId"})
    public List<EmployeeDto> getAllByDepartmentId(@RequestParam Integer departmentId) {
        return ((EmployeeService) this.service).getByDepartmentId(departmentId);
    }
}
