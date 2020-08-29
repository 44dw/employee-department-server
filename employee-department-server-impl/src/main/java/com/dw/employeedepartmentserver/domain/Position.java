package com.dw.employeedepartmentserver.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@SequenceGenerator(name = Position.ID_SEQ, sequenceName = Position.ID_SEQ, allocationSize = 1)
@NoArgsConstructor
@AllArgsConstructor
public class Position {
    public static final String ID_SEQ = "position_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(nullable = false)
    private String name;
}
