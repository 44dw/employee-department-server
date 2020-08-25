package com.dw.employeedepartmentserver.domain;

import com.dw.departmentdictionary.dto.DepartmentDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@SequenceGenerator(name = Employee.ID_SEQ, sequenceName = Employee.ID_SEQ, allocationSize = 1)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    public static final String ID_SEQ = "employee_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String secondName;

    @Column
    private String thirdName;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EmployeeSex sex;

    @Column(nullable = false)
    private Date birthDate;

    @Column(nullable = false)
    private String telNumber;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private Date hireDate;

    @Column
    private Date resignDate;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @Column(nullable = false)
    private Long salary;

//    @Column(nullable = false)
//    @ManyToOne
//    @JoinColumn(name = "department_id")
//    private DepartmentDto department;
    @Column(nullable = false)
    private Integer departmentId;

    @Column(nullable = false)
    private boolean isDepartmentHead;

    public enum EmployeeSex {
        MALE, FEMALE
    }
}
