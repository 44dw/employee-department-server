package com.dw.employeedepartmentserver.utils;

import com.dw.employeedepartmentserver.domain.Employee;
import lombok.experimental.UtilityClass;
import org.springframework.data.jpa.domain.Specification;

@UtilityClass
public class SpecificationUtils {

    public static Specification<Employee> getEmployeesByDepartmentId(Integer departmentId) {
        return ((root, criteriaQuery, criteriaBuilder) -> {
            criteriaQuery.distinct(true);
            return criteriaBuilder.equal(root.get(Employee.Fields.departmentId), departmentId);
        });
    }
}
