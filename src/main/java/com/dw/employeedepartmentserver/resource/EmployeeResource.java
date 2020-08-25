package com.dw.employeedepartmentserver.resource;

import com.dw.departmentdictionary.resource.AbstractCommonResource;
import com.dw.employeedepartmentserver.dto.EmployeeDto;
import com.dw.employeedepartmentserver.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/employee", produces = APPLICATION_JSON_VALUE)
public class EmployeeResource extends AbstractCommonResource<EmployeeDto> {

    public EmployeeResource(EmployeeService service) {
        super(service);
    }
}
