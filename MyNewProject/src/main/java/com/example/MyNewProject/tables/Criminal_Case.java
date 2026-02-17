package com.example.MyNewProject.tables;

import com.example.MyNewProject.enums.SeverityLevel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Criminal_Case {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String case_description;
    @Enumerated(EnumType.STRING)
    private SeverityLevel severityLevel;
    @ManyToOne
    @JoinColumn
    private Election_Result electionResult;

}
