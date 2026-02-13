package com.example.MyNewProject.tables;

import com.example.MyNewProject.enums.Election_Type;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Election {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int year;
    @Enumerated(EnumType.STRING)
    private Election_Type electionType;
    @OneToMany(mappedBy = "election")
    private List<Election_Result>electionResults;
}
